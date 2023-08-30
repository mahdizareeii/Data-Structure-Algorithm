package com.example.datastructurealgorithm.searchingalgorithm;

public class BinarySearch implements SearchingStrategy {
    @Override
    public int search(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Calculate the middle index

            if (array[mid] == target) {
                return mid; // Return the index if the element is found
            } else if (array[mid] < target) {
                left = mid + 1; // Search the right half
            } else {
                right = mid - 1; // Search the left half
            }
        }
        return -1; // Return -1 if the element is not found
    }
}
