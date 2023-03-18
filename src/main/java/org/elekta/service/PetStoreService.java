package org.elekta.service;

import lombok.extern.java.Log;
import org.elekta.model.Animal;
import org.elekta.util.PetType;

import java.util.ArrayList;
import java.util.List;

@Log
public class PetStoreService {

    /**
     * Displays the given list of animals using the log.
     *
     * @param animals the list of animals to display
     */
    public void displayAnimals(final List<Animal> animals) {
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
    public List<Animal> sortAnimalsByOwnerName(final List<Animal> animals) {
        // Sort the animals by owner name
        animals.sort((animal1, animal2) ->
                animal1.getOwnerName().compareToIgnoreCase(animal2.getOwnerName()));

        return animals;
    }

    /**
     * Iterates through the collection of animals and displays only the birds.
     *
     * @param animals the collection of animals to iterate through
     * @return List of animals of a specific {@link PetType}
     */
    public List<Animal> getAnimalsByType(final List<Animal> animals, final PetType petType) {
        final List<Animal> animalsByType = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal.getType().equalsIgnoreCase(petType.name())) {
                animalsByType.add(animal);
            }
        }
        return animalsByType;
    }


    /**
     * Iterates through the list of animals and returns the list of animals above a minimum minAge.
     *
     * @param animals the list of animals to iterate through
     * @param minAge  Minimum age of the animal
     * @return List of animals with minAge equal to or above a specific number
     */
    public List<Animal> getAnimalsOverTheAge(List<Animal> animals, int minAge) {
        final List<Animal> animalsOfMinAge = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal.getAge() >= minAge) {
                animalsOfMinAge.add(animal);
            }
        }
        return animalsOfMinAge;
    }
}
