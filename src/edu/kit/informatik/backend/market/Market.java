package edu.kit.informatik.backend.market;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * A {@code Market} is an object that can be interacted with
 * player in order to purchase goods
 *
 * @author ufzwe
 * @version 1.0
 */
public class Market {
    private final Map<CropData, Integer> cropsOnSale;

    /**
     * Initialize {@code Market} object by stocking up items
     */
    public Market() {
        cropsOnSale = new HashMap<>();

        // Put all crops from crop data to market with their starting price
        for (CropData data : CropData.values()) {
            cropsOnSale.put(data, data.getPossiblePriceCount() / 2);
        }
    }

    /**
     * Based on the amount of crops (and the type) a player has purchased,
     * update the price of individual crops in the market.
     *
     * @param accumulatedSales is a total sales that have been made during a
     *                         player's turn.
     *                         Key of this map represents the type of crop the
     *                         player has purchased, and the value is
     *                         the amount player has purchased.
     */
    public void updateMarket(Map<CropData, Integer> accumulatedSales) {
        for (Map.Entry<CropData, Integer> entry : accumulatedSales.entrySet()) {
            CropData key = entry.getKey();
            CropData pair = key.getPriceConnectedData();

            // Check if current entry had more sales than its pair
            int saleDifference = entry.getValue() - accumulatedSales.get(pair);
            if (saleDifference >= 0) {
                // Shift possible price index for both paired items on sale
                // depending on saleDifference
                int indexShift = saleDifference / 2 * key.getPriceIndexChange();
                cropsOnSale.replace(key, cropsOnSale.get(key) + indexShift);
                cropsOnSale.replace(pair, cropsOnSale.get(pair) + indexShift);
            }
        }
    }

    /**
     * Fetch {@code cropsOnSale} map and output in more concise way, only
     * containing the identifier of the crop and price.
     *
     * @return a map with key being the identifier of {@code CropData} and value
     *         being the current price of {@code CropData}.
     */
    public Map<String, Integer> getCropsOnSale() {
        return cropsOnSale.entrySet().stream()
                .collect(Collectors.toMap(
                        entry -> entry.getKey().getIdentifier(),
                        entry -> entry.getKey().getPrice(entry.getValue())));
    }
}
