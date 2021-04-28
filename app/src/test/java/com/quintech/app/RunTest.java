package com.quintech.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.quintech.app.Farm.Corral;
import com.quintech.app.Farm.FarmAnimal;
import com.quintech.app.Farm.Horse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * RunTest
 */
public class RunTest {

    private List<Optional<FarmAnimal>> animals = new ArrayList<>();

    @BeforeEach
    public  void initAll() {
        animals = List.of(
            Optional.ofNullable(new Horse("Spirit", 150)),
            Optional.ofNullable(new Horse("Shina", 220)), 
            Optional.ofNullable(new Horse("Kelly", 430)),
            Optional.ofNullable(new Horse("Doby", 600))
        );
    }

    @Test
    @Disabled(value = "Is only for test")
    public void testAllWeights() {
        // Steup
        Corral corral = new Corral(animals);
        // Execute
        BigDecimal allWeights = corral.allWeight();
        // Test
        assertEquals(allWeights, new BigDecimal(1400));
        assertNotEquals(allWeights, new BigDecimal(1500));
    }

    @Test
    public void testAllNames() {
        // Setup
        List<String> names = animals.stream().map(Optional::get).map(FarmAnimal::getName).collect(Collectors.toList());
        Corral corral = new Corral(animals);
        // execute
        List<String> allNames = corral.allNames();
        // test
        assertEquals(allNames, names);
    }

    @Test
    public void testFindAnimalbyName() {
        // Setup
        FarmAnimal horse = animals.get(1).get();
        Corral corral = new Corral(animals);
        // execute
        FarmAnimal animal = corral.findAnimalByName(horse.getName());
        // test
        assertEquals(horse, animal);
    }

    @Test
    public void testFindAnimalByWeight() {
        // Setup
        FarmAnimal horse = animals.get(1).get();
        Corral corral = new Corral(animals);
        // execute
        FarmAnimal animal = corral.findAnimalByWeight(horse.getWeight());
        // test
        assertEquals(horse, animal);
    }

    @Test
    public void testCountAnimalsByWeight() {
        // Setup

        // Comparations And Values
        Integer lessComparation = -1;
        BigDecimal lessValue = new BigDecimal(150);
        Integer equalsComparation = 0;
        BigDecimal equalsValue = new BigDecimal(500);
        Integer greatherComparation = 1;
        BigDecimal greatherValue = new BigDecimal(500);
        // Corral Instance
        Corral corral = new Corral(animals);
        // Quantity of items resulted
        Integer equalsQuantity = 1;
        Integer lessQuantity = 3;
        Integer greatherQuantity = 1;
        
        // execute
        Integer equals = corral.countAnimalsByWeight(lessValue, equalsComparation);
        Integer less = corral.countAnimalsByWeight(equalsValue, lessComparation);
        Integer greather = corral.countAnimalsByWeight(greatherValue, greatherComparation);
        // test
        assertEquals(equals, equalsQuantity);
        assertEquals(less, lessQuantity);
        assertEquals(greather, greatherQuantity);
    }
}