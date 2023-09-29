package org.example;

public class Dog extends Pet{
    private String breed;

    public Dog(String name, String command, String breed) {
        super(name, command);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}
