package edu.kit.informatik.backend.market;

public class CropShopItem implements ShopItem {
    private final CropData data;
    private int currentPrice;

    public CropShopItem(CropData data) {
        this.data = data;
        currentPrice = data.getPossiblePrices()[2];
    }

    /**
     * Updates price of this {@code VegetableShopItem} with provided
     * price index.
     *
     * @param newPriceIndex is an index that should target an item in
     *                      {@code possiblePrices} in {@code VegetableData}.
     */
    public void updatePrice(int newPriceIndex) {
        currentPrice = data.getPossiblePrices()[newPriceIndex];
    }

    @Override
    public void onPurchase() {
    }

    @Override
    public int getPrice() {
        return currentPrice;
    }
}
