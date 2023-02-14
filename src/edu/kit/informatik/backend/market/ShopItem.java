package edu.kit.informatik.backend.market;

/**
 * An item that is listed in the market.
 * A {@code ShopItem} can be purchased by the player via market.
 *
 * @author ufzwe
 * @version 1.0
 */
public interface ShopItem {
    void onPurchase();
    int getPrice();
}
