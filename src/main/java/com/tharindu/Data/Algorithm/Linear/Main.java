package com.tharindu.Data.Algorithm.Linear;

public class Main {
    public static void main(String[] args) {
        int[] data = {2,4,0,1,9};
        int target = 4;

        int result = LinearSearch.linearSearch(data, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
