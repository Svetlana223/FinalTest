package org.example;

public class Counter implements AutoCloseable{
    private int count = 0;

    public void add() {
        count++;
    }

    public int getCount() {
        return count;
    }

    @Override
    public void close() {
        count = 0;
    }
}
