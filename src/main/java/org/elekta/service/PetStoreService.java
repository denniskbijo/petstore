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
}
