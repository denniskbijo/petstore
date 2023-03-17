package org.elekta.exception;

/**
 * Exception class for invalid animal types.
 */
public class InvalidAnimalTypeException extends Exception {

    /**
     * Creates a new InvalidAnimalException with the specified detail message.
     * @param message the detail message
     */
    public InvalidAnimalTypeException(String message) {
        super(message);
    }
}
