package org.example;

public class Hamster extends Pet{
    private String favoriteToy;

    public Hamster(String name, String command, String favoriteToy) {
        super(name, command);
        this.favoriteToy = favoriteToy;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }
}
