package org.mwatt.algorithms.sort;

import org.mwatt.core.Range;
import java.util.Deque;
import java.util.LinkedList;

public class QuickSort implements IntSorter2 {
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
        int lowIndex = 0;
        int highIndex = arr.length - 1;

        quickSort(arr, lowIndex, highIndex);
    }

    private void quickSort(int[] arr, int lowIndex, int highIndex) {
        if (lowIndex < highIndex) {
            int partitionIndex = partition(arr, lowIndex, highIndex);
            quickSort(arr, lowIndex, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, highIndex);
        }
    }

    private int partition(int[] arr, int lowIndex, int highIndex) {
        if (lowIndex == highIndex) {
            return lowIndex;
        }

        int pivotIndex = lowIndex + (int) (Math.random() * (highIndex - lowIndex + 1));
        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[highIndex];
        arr[highIndex] = temp;

        int i = lowIndex - 1;
        int pivot = arr[highIndex];
        for (int j = lowIndex; j < highIndex; j++) {
            if (arr[j] < pivot) {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        temp = arr[i + 1];
        arr[i + 1] = arr[highIndex];
        arr[highIndex] = temp;
        return i + 1;
    }


    @Override
    public void sortIterative(int[] arr) {
        Deque<Range> stack = new LinkedList<>();
        stack.push(new Range(0, arr.length - 1));

        while (!stack.isEmpty()) {
            Range range = stack.pop();
            int lowIndex = range.getLowIndex();
            int highIndex = range.getHighIndex();

            if (lowIndex < highIndex) {
                int partitionIndex = partition(arr, lowIndex, highIndex);
                stack.push(new Range(lowIndex, partitionIndex - 1));
                stack.push(new Range(partitionIndex + 1, highIndex));
            }
        }
    }
}
