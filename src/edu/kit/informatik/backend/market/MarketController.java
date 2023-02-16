package edu.kit.informatik.backend.market;

import java.util.HashMap;
import java.util.Map;

import edu.kit.informatik.backend.GameItem;
import edu.kit.informatik.backend.Player;

/**
 * Using the MVC pattern, a {@code MarketController} will be used to
 * handle input (player's interaction) with the game logic, as well as
 * translating game logic visually.
 *
 * @author ufzwe
 * @version 1.0
 */
public class MarketController {
    private final Market model;
    private final MarketView view;

    private final Map<CropData, Integer> accumulatedSales;

    public MarketController(Market model, MarketView view) {
        this.model = model;
        this.view = view;

        accumulatedSales = new HashMap<>();
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

    public void drawView() {
        view.renderPrices(model.getCropsOnSale());
    }
}
