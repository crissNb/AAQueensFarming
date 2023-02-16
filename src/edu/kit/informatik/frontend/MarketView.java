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
    private static final int ITEM_DISPLAY_WIDTH = 13;

    /**
     * Sends price data as an input to {@code Renderer} to display the current
     * crops on sale. Performs necessary String formatting beforehand.
     *
     * @param priceData that will be displayed via {@code Renderer}
     */
    public void renderCropPrices(Map<String, Integer> priceData) {
        Renderer.getInstance().draw(StringUtility.alignMap(priceData, ITEM_DISPLAY_WIDTH, ITEM_DISPLAY_SEPARATOR));
    }
}
