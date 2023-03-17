package org.elekta.model;

import org.elekta.exception.InvalidAnimalTypeException;
import org.elekta.util.PetConstants;


/**
 * The Animal class represents an animal in a pet store.
 */
public abstract class Animal implements PetConstants {
    private final String name;
    private final int age;
    private final String ownerName;
    private final int numLegs;

    /**
     * Constructs a new Animal with the specified name, age, owner name, and number of legs.
     *
     * @param name      the name of the animal
     * @param age       the age of the animal in years
     * @param ownerName the name of the owner of the animal
     * @param numLegs   the number of legs the animal has (4 for dogs, 4 for cats, 2 for birds, 0 for snakes)
     */
    public Animal(String name, int age, String ownerName, int numLegs) {
        this.name = name;
        this.age = age;
        this.ownerName = ownerName;
        this.numLegs = numLegs;
    }

    /**
     * Gets the name of the animal.
     *
     * @return the name of the animal
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the age of the animal.
     *
     * @return the age of the animal in years
     */
    public int getAge() {
        return age;
    }

    /**
     * Gets the name of the owner of the animal.
     *
     * @return the name of the owner of the animal
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Gets the number of legs the animal has.
     *
     * @return the number of legs the animal has
     */
    public int getNumLegs() {
        return numLegs;
    }

    /**
     * Gets the type of the animal.
     *
     * @return the type of the animal (e.g. "Dog", "Cat", "Bird", or "Snake")
     */
    public abstract String getType();

    /**
     * Returns a string representation of the animal.
     *
     * @return a string representation of the animal
     */
    @Override
    public String toString() {
        return getType() + ": " + name + ", " + age + " years old, " + numLegs + " legs, owned by " + ownerName;
    }

    /**
     * Creates a new Animal object with the specified type, owner name, name, and age.
     *
     * @param type      the type of the animal (e.g. "Dog", "Cat", "Bird", or "Snake")
     * @param ownerName the name of the owner of the animal
     * @param name      the name of the animal
     * @param age       the age of the animal in years
     * @return a new Animal object of the specified type
     * @throws InvalidAnimalTypeException if an invalid animal type is specified
     */
    public static Animal createAnimal(String type, String ownerName, String name, int age) throws InvalidAnimalTypeException {
        switch (type) {
            case DOG:
                return new Dog(name, age, ownerName);
            case CAT:
                return new Cat(name, age, ownerName);
            case BIRD:
                return new Bird(name, age, ownerName);
            case SNAKE:
                return new Snake(name, age, ownerName);
            default:
                throw new InvalidAnimalTypeException("Invalid animal type: " + type);
        }
    }
}
