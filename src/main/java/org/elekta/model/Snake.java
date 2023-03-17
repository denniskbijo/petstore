package org.elekta.model;

import org.elekta.util.PetConstants;

/**
 * Represents a snake, which is a type of animal with no legs.
 */
public class Snake extends Animal implements PetConstants {

    /**
     * Creates a new Snake object with the given name, age, and owner name.
     * The snake has no legs.
     * @param name the name of the snake
     * @param age the age of the snake in years
     * @param ownerName the name of the snake's owner
     */
    public Snake(String name, int age, String ownerName) {
        super(name, age, ownerName, 0);
    }

    /**
     * Returns the type of animal, which is "Snake".
     * @return the string "Snake"
     */
    @Override
    public String getType() {
        return SNAKE;
    }
}
