package org.mwatt.algorithms.sort;

public class MergeSort implements IntSorter2 {

    @Override
    public void sort(int[] arr, boolean isRecursive) {
       if (isRecursive) {
           sortRecursive(arr);
       } else {
           sortIterative(arr);
       }
    }

    @Override
    public void sortRecursive(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        int[] helper = new int[arr.length];
        mergeSort(arr, helper, 0, arr.length - 1);

    }

    private void mergeSort(int[] arr, int[] helper, int low, int high) {
        if (low < high) {
            int middle = low + (high - low) / 2;
            mergeSort(arr, helper, low, middle);
            mergeSort(arr, helper, middle + 1, high);
            merge(arr, helper, low, middle, high);
        }
    }

    private void merge(int[] arr, int[] helper, int low, int middle, int high) {
        if (high + 1 - low >= 0) System.arraycopy(arr, low, helper, low, high + 1 - low);

        int helperNextLeft = low;
        int helperNextRight = middle + 1;
        int currentDestIndex = low;

        while (helperNextLeft <= middle && helperNextRight <= high) {
            if (helper[helperNextLeft] <= helper[helperNextRight]) {
                arr[currentDestIndex] = helper[helperNextLeft];
                helperNextLeft++;
            } else {
                arr[currentDestIndex] = helper[helperNextRight];
                helperNextRight++;
            }
            currentDestIndex++;
        }

        int remainingLeft = middle - helperNextLeft + 1;
        if (remainingLeft >  0) System.arraycopy(helper, helperNextLeft, arr, currentDestIndex, remainingLeft);

        int remainingRight = high - helperNextRight + 1;
        if (remainingRight > 0) System.arraycopy(helper, helperNextRight, arr, currentDestIndex, remainingRight);
    }

    @Override
    public void sortIterative(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        int[] helper = new int[arr.length];

        int size = 1; // size of sorted sub-arrays to be merged
        while (size < arr.length) {
            mergeSubArrays(arr, size, helper);
            size *= 2;
        }
    }

    public void mergeSubArrays(int[] arr, int size, int[] helper) {
        int left = 0;
        while (left < arr.length) {
            int right = Math.min(left + (2 * size - 1), arr.length - 1);
            int middle = Math.min(left + size - 1,right);

            merge(arr, helper, left, middle, right);

            left += 2 * size;
        }
    }
}
