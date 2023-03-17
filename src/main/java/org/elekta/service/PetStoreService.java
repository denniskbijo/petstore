package org.elekta.service;

import lombok.extern.java.Log;
import org.elekta.model.Animal;

import java.util.List;

@Log
public class PetStoreService {

    /**
     * Displays the given list of animals using the log.
     *
     * @param animals the list of animals to display
     */
    public void displayAnimals(List<Animal> animals) {
        // Display the sorted animals
        for (Animal animal : animals) {
            log.info(animal.toString());
        }
    }

    /**
     * Sorts the given list of animals by their owner name and displays them.
     *
     * @param animals the list of animals to sort and display
     * @return list of animals sorted by owner name
     */
    public List<Animal> sortAnimalsByOwnerName(List<Animal> animals) {
        // Sort the animals by owner name
        animals.sort((animal1, animal2) ->
                animal1.getOwnerName().compareToIgnoreCase(animal2.getOwnerName()));

        return animals;
    }

}
