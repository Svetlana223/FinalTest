package org.example;

public class Donkey extends WorkingAnimal{
    private String color;

    public Donkey(String name, String task, String color) {
        super(name, task);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
