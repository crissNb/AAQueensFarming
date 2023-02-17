package edu.kit.informatik.backend.market;

import edu.kit.informatik.backend.Crop;

/**
 *
 * @author ufzwe
 * @version 1.0
 */
public class CropShopItem implements Buyable {
    private final CropData cropData;
    private int priceIndex;

    public CropShopItem(CropData cropData, int startingPriceIndex) {
        this.cropData = cropData;
        this.priceIndex = startingPriceIndex;
    }

    @Override
    public int getPrice() {
        return this.cropData.getPrice(priceIndex);
    }

    public Crop getCrop() {
        return new Crop(cropData);
    }

    public void shiftPriceIndex(int shiftAmount) {
        priceIndex += shiftAmount;

        if (priceIndex <= 0) {
            priceIndex = 0;
        } else if (priceIndex > cropData.getPossiblePriceCount()) {
            priceIndex = cropData.getPossiblePriceCount();
        }
    }
}
