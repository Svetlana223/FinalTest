package org.example;

public class WorkingAnimal extends Animal{
    private String task;

    public WorkingAnimal(String name, String task) {
        super(name);
        this.task = task;
    }

    public String getTask() {
        return task;
    }
}
