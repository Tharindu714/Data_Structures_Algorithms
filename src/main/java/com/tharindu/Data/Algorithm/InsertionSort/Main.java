package com.tharindu.Data.Algorithm.InsertionSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {9,5,1,4,3};

        System.out.println("Original array:");
        InsertionSort.printArray(arr);

        InsertionSort.insertionSort(arr);

        System.out.println("\nSorted array:");
        InsertionSort.printArray(arr);

    }
}
