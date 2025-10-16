package com.tharindu.Data.Structure.Array.Example4;

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

    public int find(int value) {
        for (int i = 0; i < size; i++) {
            if (data[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public void remove(int value) {
        int index = find(value);
        if (index == -1) {
            throw new ArrayIndexOutOfBoundsException();
        }

        for (int i = index; i < size - 1; i++) {
            System.out.println(i);
            data[i] = data[i + 1];
        }

        data[--size] = 0;
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
