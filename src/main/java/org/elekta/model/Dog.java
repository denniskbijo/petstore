package org.elekta.model;

import org.elekta.util.PetConstants;

/**
 * Represents a dog, which is a type of animal with four legs.
 */
public class Dog extends Animal implements PetConstants {

    /**
     * Creates a new Dog object with the given name, age, and owner name.
     * The dog has four legs.
     *
     * @param name      the name of the dog
     * @param age       the age of the dog in years
     * @param ownerName the name of the dog's owner
     */
    public Dog(String name, int age, String ownerName) {
        super(name, age, ownerName, 4);
    }

    /**
     * Returns the type of animal, which is "Dog".
     * @return the string "Dog"
     */
    @Override
    public String getType() {
        return DOG;
    }
}
