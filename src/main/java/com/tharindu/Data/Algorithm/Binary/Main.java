package com.tharindu.Data.Algorithm.Binary;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iterative Binary Search Algorithm");
        int[] arr = {3, 4, 5, 6, 7, 8, 9};
        int target = 7;

        int result = BinarySearch.IterativeBinarySearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
