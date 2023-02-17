package edu.kit.informatik.backend.market;

/**
 * A {@code Buyable} is a functional interface that represents an item that
 * can be purchased through shop.
 *
 * @author ufzwe
 * @version 1.0
 */
public interface Buyable {
    /**
     * Get the price of the shop item.
     *
     * @return the price of the item as an integer
     */
    int getPrice();
}
