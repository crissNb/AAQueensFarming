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
    private static final String MAP_ELEMENT_ALIGN_FORMAT = "%%-%ds%s%%%ds%%n";

    private StringUtility() {
    }

    /**
     * Aligns the keys of a map with a specified String and returns an array of
     * formatted strings.
     * 
     * @param source    a map containing key-value pairs
     * @param separator the character to use before padding the keys
     * @param width     of each line. The spacing between key-value pair
     *                  will be determined using this value
     * @return a string, where each key-value pair is formatted with spacing
     *         between key and value.
     */
    public static String alignMap(Map<String, Integer> source, int width, String separator) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : source.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            // Calculate the number of digits in the value
            int valueWidth = (int) Math.log10(value) + 1;

            // Create a format String that adds spacing between key-value pair
            String format = MAP_ELEMENT_ALIGN_FORMAT.formatted(width - valueWidth, separator, valueWidth);

            sb.append(format.formatted(key, value));
        }

        return sb.toString();
    }
}
