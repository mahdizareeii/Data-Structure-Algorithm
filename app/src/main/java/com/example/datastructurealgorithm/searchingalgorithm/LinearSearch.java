package com.example.datastructurealgorithm.searchingalgorithm;

public class LinearSearch implements SearchingStrategy {
    @Override
    public int search(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Return the index if the element is found
            }
        }
        return -1; // Return -1 if the element is not found
    }
}
