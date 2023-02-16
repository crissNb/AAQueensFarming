package edu.kit.informatik.backend.market;

/**
 * {@code CropData} consists of all possible crops in the game.
 * Each crop has their corresponding data set appropriately
 * to match the gameplay.
 *
 * @author ufzwe
 * @version 1.0
 */
public enum CropData {
    /**
     * Mushroom is a crop with high price and takes 4 rounds to grow.
     */
    MUSHROOM("mushroom", "mushrooms", new int[] { 12, 15, 16, 17, 20 }, 4),

    /**
     * Carrot is a crop with low price and takes 1 round to grow.
     */
    CARROT("carrot", "carrots", new int[] { 3, 2, 2, 2, 1 }, 1),

    /**
     * Tomato is a crop with moderate price and takes 3 round to grow.
     */
    TOMATO("tomato", "tomatoes", new int[] { 3, 5, 6, 7, 9 }, 3),

    /**
     * Salad is a crop with moderate price and takes 2 round to grow.
     */
    SALAD("salad", "salads", new int[] { 6, 5, 4, 3, 2 }, 2);

    /**
     * {@code CropDatas} that are connected together in price.
     * In other words, if one crop's price varies, the connected crop's
     * price will be affected.
     */

    private final String identifier;
    private final String pluralIdentifier;
    private final int[] possiblePrices;
    private final int roundsToGrow;

    private CropData connectedPriceCrop;

    static {
        MUSHROOM.setConnectedPriceCrop(CARROT);
        CARROT.setConnectedPriceCrop(MUSHROOM);

        TOMATO.setConnectedPriceCrop(SALAD);
        SALAD.setConnectedPriceCrop(TOMATO);
    }

    CropData(String identifier, String pluralIdentifier, int[] possiblePrices, int roundsToGrow) {
        this.identifier = identifier;
        this.pluralIdentifier = pluralIdentifier;
        this.possiblePrices = possiblePrices;
        this.roundsToGrow = roundsToGrow;
    }

    /**
     * Find {@code CropData} with provided identifier. Returns null,
     * if {@code CropData} of the provided identifier does not exist.
     *
     * @param identifier String in which the CropData has
     * @return {@code CropData} with provided identifier, null if can't be found
     */
    public static CropData getCropDate(String identifier) {
        for (CropData data : CropData.values()) {
            return data;
        }

        return null;
    }

    private void setConnectedPriceCrop(CropData cropData) {
        this.connectedPriceCrop = cropData;
    }

    /**
     * Gets the name of this crop
     *
     * @return identifier of this crop
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * Gets the english plural form of this crop
     * for display purposes
     *
     * @return plural identifier of this crop
     */
    public String getPluralIdentifier() {
        return this.pluralIdentifier;
    }

    /**
     * Get the initial price of this crop.
     *
     * @return price in integer that is in the middle of the possible prices array
     */
    public int getStartingPrice() {
        return this.possiblePrices[this.possiblePrices.length / 2];
    }

    /**
     * Get the price of this crop out of possible values.
     *
     * @param index from the possible values array
     * @return price in integer at a specified index in possible prices array
     */
    public int getPrice(int index) {
        return this.possiblePrices[index];
    }

    /**
     * Get the number of rounds that is required for this crop to
     * grow.
     *
     * @return get rounds to grow this crop in Integer
     */
    public int getRoundsToGrow() {
        return this.roundsToGrow;
    }

    /**
     * Get {@code CropData} that should have their price changes dependent
     * to this {@code CropData}.
     *
     * @return cropdata where the price is connected to this cropdata.
     */
    public CropData getPriceConnectedData() {
        return this.connectedPriceCrop;
    }
}
