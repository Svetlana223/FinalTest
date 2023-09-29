package org.example;

public class Horse extends WorkingAnimal{
    private String breed;

    public Horse(String name, String task, String breed) {
        super(name, task);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}
