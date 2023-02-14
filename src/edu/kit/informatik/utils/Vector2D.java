package edu.kit.informatik.utils;

/**
 * {@code Vector2D} holds two integer variables.
 * An example use case is to manage coordinates
 * in a two-dimensional space.
 *
 * @author ufzwe
 * @version 1.0
 */
public class Vector2D {
    private final int x;
    private final int y;

    /**
     * Constructor to create a {@code Vector2D} object
     *
     * @param x first integer to describe {@code Vector2D} object
     * @param y second integer to describe {@code Vector2D} object
     */
    public Vector2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Returns x coordinate of this {@code Vector2D} object
     *
     * @return first integer variable of this object
     */
    public int getX() {
        return this.x;
    }

    /**
     * Returns y coordinate of this {@code Vector2D} object
     *
     * @return second integer variable of this object
     */
    public int getY() {
        return this.y;
    }

    /**
     * Perform a Vector addition with another provided {@code Vector2D} object
     *
     * @param other {@code Vector2D} object to perform addition with
     * @return result
     */
    public Vector2D add(Vector2D other) {
        return new Vector2D(this.x + other.x, this.y + other.y);
    }

    /**
     * Perform Vector subtraction with another provided {@code Vector2D} object
     *
     * @param other {@code Vector2D} to perform subtraction with
     * @return result
     */
    public Vector2D subtract(Vector2D other) {
        return new Vector2D(this.x - other.x, this.y - other.y);
    }
}
