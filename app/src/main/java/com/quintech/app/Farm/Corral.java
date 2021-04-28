package com.quintech.app.Farm;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Corral {
    private List<Optional<FarmAnimal>> animals;

    public Corral(List<Optional<FarmAnimal>> animals) {
        this.animals = animals;
    }

    public BigDecimal allWeight() {
        return animals.stream()
            .filter(Optional::isPresent)
            .map(Optional::get)
            .map(FarmAnimal::getWeight)
            .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public List<String> allNames() {
        return this.animals.stream()
        .filter(Optional::isPresent)
        .map(Optional::get)
        .map(FarmAnimal::getName)
        .collect(Collectors.toList());
    }

    public FarmAnimal findAnimalByName(String name) {
        return  this.animals.stream()
        .filter(Optional::isPresent)
        .map(Optional::get)
        .filter((this.findByName(name)))
        .findFirst()
        .orElseThrow();
    }

    public FarmAnimal findAnimalByWeight(BigDecimal weight) {
        return  this.animals.stream()
        .filter(Optional::isPresent)
        .map(Optional::get)
        .filter((value) -> value.getWeight().compareTo(weight) == 0 )
        .findFirst() 
        .orElseThrow();
    }

    public Integer countAnimalsByWeight(BigDecimal decimal, int compare) {
        return this.animals.stream()
        .filter(Optional::isPresent)
        .map(Optional::get)
        .map(FarmAnimal::getWeight)
        .map((value) -> value.compareTo(decimal))
        .filter((value) -> value == compare)
        .collect(Collectors.toList())
        .size();
    }

    private Predicate<FarmAnimal> findByName(String name) {
        return new Predicate<FarmAnimal>() {

            @Override
            public boolean test(FarmAnimal t) {
                return t.getName().equals(name);
            }

        };
    }
}
