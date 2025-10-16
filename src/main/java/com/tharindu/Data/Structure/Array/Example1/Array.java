package com.tharindu.Data.Structure.Array.Example1;

public class Array {

    private final int[] data;
    private int size;
    private final int capacity;

    public Array(int capacity) {
        this.capacity = capacity;
        this.data = new int[capacity];
        this.size = 0;
    }

    public void add(int value) {
        if (size < capacity) {
            data[size] = value;
            size++;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            out.append(data[i]);
            if (i == size - 1) {
                out.append("]");
            } else {
                out.append(", ");
            }
        }
        return out.toString();
    }
}
