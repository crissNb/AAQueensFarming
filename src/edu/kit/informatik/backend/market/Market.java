package edu.kit.informatik.backend.market;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import edu.kit.informatik.backend.GameItem;
import edu.kit.informatik.backend.Player;

/**
 * A {@code Market} is an object that can be interacted with
 * player in order to purchase goods
 *
 * @author ufzwe
 * @version 1.0
 */
public class Market {
    private final List<VegetableShopItem> vegetablesOnSale;

    /**
     * Initialize {@code Market} object by stocking up items
     */
    public Market() {
        vegetablesOnSale = new ArrayList<>();

        for (VegetableData data : VegetableData.values()) {
            vegetablesOnSale.add(new VegetableShopItem(data));
        }
    }

    /**
     * Purchase desired item to a customer.
     * If customer is unable to purchase goods (e.g. not enough balance),
     * no goods will be purchased.
     *
     * @param customer    whom the item will be purchased for
     * @param desiredItem that will be purchased
     * @return item once successfully purchased, null if fails
     */
    public GameItem purchaseItem(Player customer, String desiredItem) {
        return null;
    }

    private void updatePrices() {
        for (Map.Entry<VegetableData, VegetableData> entry : VegetableData.priceConnections.entrySet()) {
        }
    }
}
