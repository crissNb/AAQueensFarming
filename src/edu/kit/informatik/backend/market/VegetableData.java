package edu.kit.informatik.backend.market;

import java.util.HashMap;
import java.util.Map;

/**
 * {@code VegetableData} consists of all possible vegetables in the game.
 * Each vegetable has their corresponding data set appropriately
 * to match the gameplay.
 *
 * @author ufzwe
 * @version 1.0
 */
public enum VegetableData {
    /**
     * Mushroom is a vegetable with high price and takes 4 rounds to grow.
     */
    MUSHROOM("mushroom", "mushrooms", new int[]{12, 15, 16, 17, 20}, 4),

    /**
     * Carrot is a vegetable with low price and takes 1 round to grow.
     */
    CARROT("carrot", "carrots", new int[]{3, 2, 2, 2, 1}, 1),

    /**
     * Tomato is a vegetable with moderate price and takes 3 round to grow.
     */
    TOMATO("tomato", "tomatoes", new int[]{3, 5, 6, 7, 9}, 3),

    /**
     * Salad is a vegetable with moderate price and takes 2 round to grow.
     */
    SALAD("salad", "salads", new int[]{6, 5, 4, 3, 2}, 2);

    /**
     * {@code VegetableDatas} that are connected together in price.
     * In other words, if one vegetable's price varies, the connected vegetable's
     * price will be affected.
     */
    public static Map<VegetableData, VegetableData> priceConnections = new HashMap<>();

    private final String identifier;
    private final String pluralIdentifier;
    private final int[] possiblePrices;
    private final int roundsToGrow;

    static {
        priceConnections.put(MUSHROOM, CARROT);
        priceConnections.put(TOMATO, SALAD);
    }

    VegetableData(String identifier, String pluralIdentifier, int[] possiblePrices, int roundsToGrow) {
        this.identifier = identifier;
        this.pluralIdentifier = pluralIdentifier;
        this.possiblePrices = possiblePrices;
        this.roundsToGrow = roundsToGrow;
    }

    /**
     * Gets the name of this vegetable
     *
     * @return identifier of this vegetable
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Gets the english plural form of this vegetable
     * for display purposes
     *
     * @return plural identifier of this vegetable
     */
    public String getPluralIdentifier() {
        return pluralIdentifier;
    }

    public int[] getPossiblePrices() {
        return possiblePrices;
    }

    public int getRoundsToGrow() {
        return roundsToGrow;
    }

    public VegetableData getPriceConnectedData() {
        return priceConnections.get(this);
    }
}
