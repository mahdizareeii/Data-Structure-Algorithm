package com.example.datastructurealgorithm.sortingalgorithm;

public class QuickSort implements SortingStrategy {

    @Override
    public int[] sort(int[] array) {
        int low = 0;
        int high = array.length - 1;
        return quickSort(array, low, high);
    }

    int[] quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            // Recursively sort the subarrays on both sides of the pivot
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
        return arr;
    }

    private int partition(int[] arr, int low, int high) {
        // Choose the pivot as the last element
        int pivot = arr[high];
        int i = low - 1;

        // Partition the array into elements less than and greater than the pivot
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and pivot
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Return the index of the pivot after partition
        return i + 1;
    }
}
