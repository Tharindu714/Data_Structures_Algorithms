package com.tharindu.Data.Algorithm.Binary;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Recursive Binary Search Algorithm");
        int[] arr = {3, 4, 5, 6, 7, 8, 9};
        int target = 8;
        int result = BinarySearchR.RecursiveBinarySearch(arr, 0, arr.length - 1, target);
        if (result == -1) {
            System.out.println("Element not present in array");
        } else {
            System.out.println("Element found at index: " + result);
        }

    }
}
