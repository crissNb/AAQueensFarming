package edu.kit.informatik.backend;

/**
 * {@code NoCropFoundException} is thrown in case of an attempt of accessing a
 * non-existent crop.
 *
 * @author ufzwe
 * @version 1.0
 */
public class NoCropFoundException extends IllegalArgumentException {
    /**
     * Constructs an {@code NoCropFoundException} with no detail message.
     */
    public NoCropFoundException() {
        super();
    }
}
