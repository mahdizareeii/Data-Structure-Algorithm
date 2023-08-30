package com.example.datastructurealgorithm.searchingalgorithm;

public class JumpSearch implements SearchingStrategy {
    @Override
    public int search(int[] array, int target) {
        int n = array.length;
        int blockSize = (int) Math.sqrt(n); // Calculate the block size

        int prev = 0; // Previous block's end
        while (array[Math.min(blockSize, n) - 1] < target) {
            prev = blockSize;
            blockSize += (int) Math.sqrt(n);
            if (prev >= n) {
                return -1; // Element not found
            }
        }

        // Linear search within the current block
        while (array[prev] < target) {
            prev++;

            if (prev == Math.min(blockSize, n)) {
                return -1; // Element not found
            }
        }

        if (array[prev] == target) {
            return prev; // Return the index if the element is found
        }

        return -1; // Element not found
    }
}
