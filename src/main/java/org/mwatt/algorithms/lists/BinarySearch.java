package org.mwatt.algorithms.lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public int binarySearchRecursive(int[] sortedArray, int key) {
        return binarySearchRecursive(sortedArray, key, 0, sortedArray.length - 1);
    }

    private int binarySearchRecursive(int[] sortedArray, int key, int left, int right) {
        int mid = left + (right - left) / 2;

        if (sortedArray[mid] == key) {
            return mid;
        } else if (sortedArray[mid] > key) {
            return binarySearchRecursive(sortedArray, key, left, mid - 1);
        } else {
            return binarySearchRecursive(sortedArray, key, mid + 1, right);
        }
    }

    public int binarySearchIterative(int[] sortedArray, int key) {
        int left = 0;
        int right = sortedArray.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (sortedArray[mid] == key) {
                return mid;
            } else if (sortedArray[mid] > key) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }

    public int binarySearchArrays(int[] sortedArray, int key) {
         return Arrays.binarySearch(sortedArray, key);
    }

    public int binarySearchCollections(List<Integer> sortedList, int key) {
        return Collections.binarySearch(sortedList, key);
    }

}
