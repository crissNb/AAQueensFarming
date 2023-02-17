package edu.kit.informatik.backend;

/**
 * {@code NoGoldException} is thrown in case of player attempting
 * to perform an action that would deduct their gold to less than the amount
 * one can hold.
 *
 * @author ufzwe
 * @version 1.0
 */
public class NoGoldException extends ArithmeticException {
    /**
     * Constructs an {@code NoGoldException} with no detail message.
     */
    public NoGoldException() {
        super();
    }
}
