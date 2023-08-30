package com.example.datastructurealgorithm.searchingalgorithm;

public class ExponentialSearch implements SearchingStrategy {
    @Override
    public int search(int[] array, int target) {
        int n = array.length;

        // If the target element is at index 0
        if (array[0] == target) {
            return 0;
        }

        // Find a range for binary search
        int i = 1;
        while (i < n && array[i] <= target) {
            i *= 2;
        }

        // Perform binary search within the found range
        return binarySearch(array, i / 2, Math.min(i, n - 1), target);
    }

    private int binarySearch(int[] array, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid; // Return the index if the element is found
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Return -1 if the element is not found
    }
}
