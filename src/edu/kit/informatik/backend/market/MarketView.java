package edu.kit.informatik.backend.market;

import java.util.Map;
import java.util.stream.Collectors;

import edu.kit.informatik.Renderer;
import edu.kit.informatik.utils.StringUtility;

public class MarketView {
    private static final String ITEM_DISPLAY_SEPARATOR = ":";

    public void renderPrices(Map<CropData, Integer> priceData) {

        // Grab identifier and convert Integer to String from provided priceData
        Map<String, String> stringMap = priceData.entrySet().stream()
                .collect(Collectors.toMap(
                        entry -> entry.getKey().getIdentifier(),
                        entry -> entry.getValue().toString()));

        Renderer.getInstance().draw(StringUtility.alignStrings(stringMap, ITEM_DISPLAY_SEPARATOR));
    }
}
