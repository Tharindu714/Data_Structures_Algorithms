package com.tharindu.Data.Algorithm.Binary;

public class BinarySearchR {

    public static int RecursiveBinarySearch(int[] arr, int left, int right, int target) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            // If the element is present at the middle itself
            if (arr[mid] == target) {
                return mid;
            }

            // If an element is smaller than mid, then it can only be present in left subarray
            if (arr[mid] > target) {
                return RecursiveBinarySearch(arr, left, mid - 1, target);
            }

            // Else the element can only be present in the right subarray
            return RecursiveBinarySearch(arr, mid + 1, right, target);
        }

        // Element is not present in an array
        return -1;
    }
}
