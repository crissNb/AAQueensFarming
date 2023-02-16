package edu.kit.informatik.utils;

import java.util.Map;

/**
 * {@code StringUtility} is a Utility class containing various
 * actions that focuses on creating a formatted String.
 *
 * @version 1.0
 * @author ufzwe
 */
public final class StringUtility {
    private StringUtility() {
    }

    /**
     * Aligns the keys of a map with a specified String and returns an array of
     * formatted strings.
     * 
     * @param source      a map containing key-value pairs
     * @param alignString the character to use before padding the keys
     * @return a string, where each key-value pair is formatted with the
     *         key padded to the same width
     */
    public static String alignStrings(Map<String, String> source, String alignString) {
        // Find the length of longest key String
        int longestKey = source.keySet().stream()
                .mapToInt(String::length)
                .max()
                .orElse(0);

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : source.entrySet()) {
            sb.append(String.format("%-" + longestKey + "s%s%s", entry.getKey(), alignString,
                    entry.getValue())).append(System.lineSeparator());
        }

        return sb.toString();
    }
}
