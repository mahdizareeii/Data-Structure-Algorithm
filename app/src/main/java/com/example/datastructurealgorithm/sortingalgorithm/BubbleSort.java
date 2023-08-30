package com.example.datastructurealgorithm.sortingalgorithm;

public class BubbleSort implements SortingStrategy {

    @Override
    public int[] sort(int[] array) {
        int n = array.length;
        // Perform n-1 passes through the array
        for (int i = 0; i < n - 1; i++) {
            // Each pass "bubbles up" the largest unsorted element to the end
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements and swap if they are in the wrong order
                if (array[j] > array[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
