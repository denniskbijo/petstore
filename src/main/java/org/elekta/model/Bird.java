package org.elekta.model;

import org.elekta.util.PetConstants;

/**
 * Represents a bird, which is a type of animal with two legs.
 */
public class Bird extends Animal implements PetConstants {

    /**
     * Creates a new Bird object with the given name, age, and owner name.
     * The bird has two legs.
     *
     * @param name      the name of the bird
     * @param age       the age of the bird in years
     * @param ownerName the name of the bird's owner
     */
    public Bird(String name, int age, String ownerName) {
        super(name, age, ownerName, 2);
    }

    /**
     * Returns the type of animal, which is "Bird".
     * @return the string "Bird"
     */
    @Override
    public String getType() {
        return BIRD;
    }
}
