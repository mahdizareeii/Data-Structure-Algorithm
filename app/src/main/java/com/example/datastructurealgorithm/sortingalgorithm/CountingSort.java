package com.example.datastructurealgorithm.sortingalgorithm;

public class CountingSort implements SortingStrategy {

    @Override
    public int[] sort(int[] array) {
        int n = array.length;

        // Find the maximum element in the array
        int max = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        // Create a count array to store the occurrence count of each element
        int[] count = new int[max + 1];
        for (int i = 0; i < n; i++) {
            count[array[i]]++;
        }

        // Update the count array to store the cumulative counts
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // Build the sorted array by placing elements in their correct positions
        int[] output = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            output[count[array[i]] - 1] = array[i];
            count[array[i]]--;
        }

        // Copy the sorted elements back to the original array
        for (int i = 0; i < n; i++) {
            array[i] = output[i];
        }
        return array;
    }
}
