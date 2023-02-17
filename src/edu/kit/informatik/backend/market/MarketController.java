package edu.kit.informatik.backend.market;

import java.util.HashMap;
import java.util.Map;

import edu.kit.informatik.frontend.MarketView;
import edu.kit.informatik.backend.Crop;
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

    private Map<CropData, Integer> accumulatedSales;

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
     * @param customer        whom the item will be purchased for
     * @param desiredCropName that will be purchased
     * @throws IllegalArgumentException if desiredItem cannot be found
     * @return item once successfully purchased, null if fails
     */
    public Crop purchaseCrop(Player customer, String desiredCropName) throws IllegalArgumentException {
        try {
            CropData desiredCrop = CropData.valueOf(desiredCropName.toUpperCase());
            customer.changeGold(model.getPrice(desiredCrop));
            return new Crop(desiredCrop);
        } catch (final IllegalArgumentException e) {
            return null;
        }
    }

    public void drawView() {
        view.renderCropPrices(model.getCropsOnSale());
    }
}
