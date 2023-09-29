package org.example;

public class Pet extends Animal {
    private String command;

    public Pet(String name, String command) {
        super(name);
        this.command = command;
    }

    public String getCommand() {
        return command;
    }
}
