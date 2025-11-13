package com.tharindu.Data.Algorithm.BubbleSort;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 2,9,1,5,6};
        BubbleSort BubbleSort = new BubbleSort();

        System.out.println("Before Sorting:");
        BubbleSort.printArray(array);

        BubbleSort.bubbleSort(array);

        System.out.println("After Sorting:");
        BubbleSort.printArray(array);
    }
}
