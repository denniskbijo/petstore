package org.elekta.service;

import org.elekta.model.Animal;
import org.elekta.model.Cat;
import org.elekta.model.Dog;
import org.elekta.util.PetType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;
import java.util.List;

/**
 * Test class for {@link PetStoreService}
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PetStoreServiceTest {

    private PetStoreService petStoreService;

    private List<Animal> testAnimals;

    private List<Animal> cats;

    @BeforeAll
    void initTests() {
        petStoreService = new PetStoreService();
        testAnimals = new ArrayList<>();
        Animal dog = new Dog("Toby", 10, "Dennis");
        Animal cat = new Cat("Meow", 12, "Dennis");
        testAnimals.add(dog);
        testAnimals.add(cat);

        cats = new ArrayList<>();
        cats.add(cat);

    }

    @Test
    void testGetAnimalsByType() {

        Assertions.assertEquals(cats, petStoreService.getAnimalsByType(testAnimals, PetType.CAT));

    }

}
