package com.tharindu.Data.Algorithm.SelectionSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Original array:");
        SelectionSort.printArray(arr);

        SelectionSort.selectionSort(arr);

        System.out.println("Sorted array:");
        SelectionSort.printArray(arr);
    }
}
