package org.example;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    private String name;
    private List<String> commands = new ArrayList<>();

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addCommand(String command) {
        commands.add(command);
    }

    public List<String> getCommands() {
        return commands;
    }
}
