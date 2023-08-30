package com.example.datastructurealgorithm.searchingalgorithm;

public class InterpolationSearch implements SearchingStrategy{
    @Override
    public int search(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right && target >= array[left] && target <= array[right]) {
            // Calculate the position using the formula
            int pos = left + ((target - array[left]) * (right - left)) / (array[right] - array[left]);

            if (array[pos] == target) {
                return pos; // Return the index if the element is found
            }

            if (array[pos] < target) {
                left = pos + 1; // Search the right half
            } else {
                right = pos - 1; // Search the left half
            }
        }

        return -1; // Element not found
    }
}
