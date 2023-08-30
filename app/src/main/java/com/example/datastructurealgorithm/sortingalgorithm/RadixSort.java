package com.example.datastructurealgorithm.sortingalgorithm;

public class RadixSort implements SortingStrategy {

    @Override
    public int[] sort(int[] array) {
        return radixSort(array);
    }

    private int[] radixSort(int[] arr) {
        int n = arr.length;
        int max = getMax(arr);

        // Perform counting sort for every digit
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, n, exp);
        }
        return arr;
    }

    private int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private int[] countingSort(int[] arr, int n, int exp) {
        int[] output = new int[n];
        int[] count = new int[10];

        // Count occurrences of each digit in count[]
        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        // Update count[] to store the actual position of digits
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        // Copy the output array to arr[] so that arr[] contains the sorted numbers
        System.arraycopy(output, 0, arr, 0, n);

        return arr;
    }
}
