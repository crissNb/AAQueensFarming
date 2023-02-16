package edu.kit.informatik.backend.market;

import java.util.HashMap;
import java.util.Map;

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
            cropsOnSale.put(data, data.getStartingPrice());
        }
    }

    public Map<CropData, Integer> getCropsOnSale() {
        return this.cropsOnSale;
    }
}
