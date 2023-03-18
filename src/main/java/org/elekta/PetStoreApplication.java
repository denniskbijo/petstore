package org.elekta;

import lombok.extern.java.Log;
import org.elekta.exception.InvalidAnimalTypeException;
import org.elekta.model.Animal;
import org.elekta.service.PetStoreService;
import org.elekta.util.PetConstants;
import org.elekta.util.PetType;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a pet store that holds a list of animals.
 */
@Log
public class PetStoreApplication implements PetConstants {


    /**
     * The main method that creates a list of animals and prints out information about them.
     *
     * @param args the command-line arguments
     * @throws InvalidAnimalTypeException when invalid animal type is used
     */
    public static void main(String[] args) throws InvalidAnimalTypeException {
        PetStoreService petStoreService = new PetStoreService();
        List<Animal> animals = new ArrayList<>();
        animals.add(Animal.createAnimal(DOG, "John Smith", "Fido", 7));
        animals.add(Animal.createAnimal(CAT, "John Doe", "Fluffy", 12));
        animals.add(Animal.createAnimal(BIRD, "Jane Doe", "Jonathon Livingston", 3));
        animals.add(Animal.createAnimal(SNAKE, "Jack Sack", "Slitherer", 1));

        // TODO add more animals here

        log.info("My PetStore Animals");
        petStoreService.displayAnimals(animals);

        log.info("PetStore Animals sorted by Owner name");
        //Sort animals by owner name
        List<Animal> animalsByOwnerName = petStoreService.sortAnimalsByOwnerName(animals);
        petStoreService.displayAnimals(animalsByOwnerName);

        log.info("PetStore Animals which are birds");
        // Display birds
        petStoreService.displayAnimals(petStoreService.getAnimalsByType(animals, PetType.BIRD));

        log.info("PetStore Animals aged more than 5");
        //Display pets aged more than 5
        petStoreService.displayAnimals(petStoreService.getAnimalsOverTheAge(animals, 5));
    }


}
