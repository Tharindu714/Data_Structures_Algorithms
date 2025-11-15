package com.tharindu.Data.Algorithm.MergeSort;

public class Main {
    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Sorted array:");
        MergeSort.printArray(array);

        MergeSort.mergeSort(array, 0, array.length - 1);

        System.out.println("\nAfter Merge Sort:");
        MergeSort.printArray(array);

    }
}
