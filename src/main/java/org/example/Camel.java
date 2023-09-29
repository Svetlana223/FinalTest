package org.example;

public class Camel extends WorkingAnimal{
    private int humpCount;

    public Camel(String name, String task, int humpCount) {
        super(name, task);
        this.humpCount = humpCount;
    }

    public int getHumpCount() {
        return humpCount;
    }
}
