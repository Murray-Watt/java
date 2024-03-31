package org.mwatt.algorithms.sort;

public interface IntSorter2 {

    // This method is used to make testing between Recursive and Iterative sorting algorithms easier
    // It is a bit of a cheat, so it should not have any logic in it. It should just call the appropriate method.
    void sort(int[] arr, boolean isRecursive);
    void sortRecursive(int[] arr);
    void sortIterative(int[] arr);
}
