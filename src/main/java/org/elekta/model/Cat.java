package org.elekta.model;

import org.elekta.util.PetConstants;

/**
 * Represents a cat, which is a type of animal with four legs and a random number of lives.
 */
public class Cat extends Animal implements PetConstants {
    private final int numLives;

    /**
     * Creates a new Cat object with the given name, age, and owner name.
     * The cat has four legs and a random number of lives between 1 and 9.
     * @param name the name of the cat
     * @param age the age of the cat in years
     * @param ownerName the name of the cat's owner
     */
    public Cat(String name, int age, String ownerName) {
        super(name, age, ownerName, 4);
        this.numLives = (int) (Math.random() * 9) + 1;
    }

    /**
     * Returns the number of lives the cat has.
     * @return the number of lives of the cat
     */
    public int getNumLives() {
        return numLives;
    }

    /**
     * Returns the type of animal, which is "Cat".
     * @return the string "Cat"
     */
    @Override
    public String getType() {
        return CAT;
    }

    /**
     * Returns a string representation of the cat, with its name, age, owner name, number of legs, and number of lives.
     * @return a string representation of the cat
     */
    @Override
    public String toString() {
        return super.toString() + ", " + numLives + " lives";
    }
}
