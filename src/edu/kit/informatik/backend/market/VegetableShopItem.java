package edu.kit.informatik.backend.market;

public class VegetableShopItem implements ShopItem {
    private final VegetableData data;

    public VegetableShopItem(VegetableData data) {
        this.data = data;
    }

    @Override
    public void onPurchase() {
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
