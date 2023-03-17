package org.elekta;

import lombok.extern.java.Log;
import org.elekta.exception.InvalidAnimalTypeException;
import org.elekta.model.Animal;
import org.elekta.util.PetConstants;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a pet store that holds a list of animals.
 */
@Log
public class PetStore implements PetConstants {


    /**
     * The main method that creates a list of animals and prints out information about them.
     *
     * @param args the command-line arguments
     * @throws InvalidAnimalTypeException when invalid animal type is used
     */
    public static void main(String[] args) throws InvalidAnimalTypeException {
        List<Animal> animals = new ArrayList<>();
        animals.add(Animal.createAnimal(DOG, "John Smith", "Fido", 7));
        animals.add(Animal.createAnimal(CAT, "John Doe", "Fluffy", 12));
        animals.add(Animal.createAnimal(BIRD, "Jane Doe", "Jonathon Livingston", 3));
        animals.add(Animal.createAnimal(SNAKE, "Jack Sack", "Slitherer", 1));

        // TODO add more animals here

        for (Animal animal : animals) {
            log.info(animal.toString());
        }
    }
}
