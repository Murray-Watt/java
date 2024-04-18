package org.mwatt.algorithms.sort;

public class InsertionSort implements IntSorter {

    public void sort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        // the sorted section grows on the left by inserting
        // in the correct position in the sorted part.

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;   // Last sorted element index

            while (j >= 0 && arr[j] >= key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // If key is not already in the correct position
            if (j + 1 < i) {
                arr[j + 1] = key;
            }
        }
    }
}
