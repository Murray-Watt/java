package org.mwatt.algorithms.sort;

public class BubbleSort implements IntSorter {

    public void sort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void sortWithExit(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;

            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public void cocktailSort(int[] arr) {
        int swappedIndex = -1;

        while (swappedIndex != arr.length - 1) {
            int left = swappedIndex + 1;
            int right = arr.length - 1;

            // Set the swap index to the first possible (left most) unsorted element
            boolean isLTR = true;
            swappedIndex = pass(arr, left, right, isLTR);

            // If the swap index did not move, we are done
            if (swappedIndex == left) {
                break;
            }

            // Set the swap index to the last possible (right most) unsorted element
            isLTR = false;
            swappedIndex = pass(arr, left, swappedIndex, isLTR);
        }
    }

    private int pass(int[] arr, int left, int right, boolean isLTR) {
        for (int i = left; i < right; i++) {
            if (isLTR) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    return i;
                }
            } else {
                if (arr[i] < arr[i - 1]) {
                    swap(arr, i, i - 1);
                    return i;
                }
            }
        }
        return right;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
