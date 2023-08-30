package com.example.datastructurealgorithm.sortingalgorithm;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort implements SortingStrategy {

    @Override
    public int[] sort(int[] array) {
        int n = array.length;

        // Create buckets and distribute elements into them
        ArrayList<Integer>[] buckets = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }
        for (int j : array) {
            int bucketIndex = n * j;
            buckets[bucketIndex].add(j);
        }

        // Sort elements within each bucket
        for (ArrayList<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }

        // Combine sorted buckets to obtain the final sorted array
        int index = 0;
        for (ArrayList<Integer> bucket : buckets) {
            for (Integer value : bucket) {
                array[index++] = value;
            }
        }
        return array;
    }
}
