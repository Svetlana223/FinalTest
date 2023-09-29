package org.example;

import java.util.*;

public class AnimalRegistry {
    private final Map<String, List<Animal>> registry = new HashMap<>();

    public void addAnimal(String category, Animal animal) {
        registry.computeIfAbsent(category, k -> new ArrayList<>()).add(animal);
    }

    public List<String> getCategories() {
        return new ArrayList<>(registry.keySet());
    }

    public List<Animal> getAnimalsByCategory(String category) {
        return registry.getOrDefault(category, Collections.emptyList());
    }

    public List<Animal> getAnimalsByName(String name) {
        List<Animal> matchingAnimals = new ArrayList<>();
        for (List<Animal> animals : registry.values()) {
            for (Animal animal : animals) {
                if (animal.getName().equalsIgnoreCase(name)) {
                    matchingAnimals.add(animal);
                }
            }
        }
        return matchingAnimals;
    }

}
