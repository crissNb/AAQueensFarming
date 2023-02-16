package edu.kit.informatik.frontend;

import java.util.Map;

import edu.kit.informatik.Renderer;
import edu.kit.informatik.utils.StringUtility;

/**
 * A {@code MarketView} is responsible to receive input from
 * {@code MarketController} and translate the information appropriately so
 * that it is ready to send it to the {@code Renderer}.
 *
 * @author ufzwe
 * @version 1.0
 */
public class MarketView {
    private static final String ITEM_DISPLAY_SEPARATOR = ":";

    public void renderPrices(Map<String, Integer> priceData) {
        Renderer.getInstance().draw(StringUtility.alignStrings(priceData, ITEM_DISPLAY_SEPARATOR));
    }
}
