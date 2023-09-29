package org.example;

public class Cat extends Pet{
    private String color;

    public Cat(String name, String command, String color) {
        super(name, command);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
