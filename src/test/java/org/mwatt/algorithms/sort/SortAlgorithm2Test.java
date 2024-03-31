package org.mwatt.algorithms.sort;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class SortAlgorithm2Test {

    private static Stream<Arguments> sortingAlgorithmToTest() {
        return Stream.of(
                Arguments.of(new MergeSort(),true),
                Arguments.of(new MergeSort(),false),
                Arguments.of(new QuickSort(),true),
                Arguments.of(new QuickSort(),false)
        );
    }

    @ParameterizedTest
    @MethodSource("sortingAlgorithmToTest")
    public void emptyArrayReturnsEmptyArray(IntSorter2 subject, boolean isRecursive) {
        int[] arr = {};
        int[] expectedArr = {};

        subject.sort(arr, isRecursive);
        assertArrayEquals(expectedArr, arr);
    }

    @ParameterizedTest
    @MethodSource("sortingAlgorithmToTest")
    public void alreadySortedArrayReturnsSameArray(IntSorter2 subject, boolean isRecursive) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expectedArr = {1, 2, 3, 4, 5};

        subject.sort(arr, isRecursive);
        assertArrayEquals(expectedArr, arr);
    }

    @ParameterizedTest
    @MethodSource("sortingAlgorithmToTest")
    public void reverseSortedArrayReturnsSortedArray(IntSorter2 subject, boolean isRecursive) {
        int[] arr = {5, 4, 3, 2, 1};
        int[] expectedArr = {1, 2, 3, 4, 5};

        subject.sort(arr, isRecursive);
        assertArrayEquals(expectedArr, arr);
    }

    @ParameterizedTest
    @MethodSource("sortingAlgorithmToTest")
    public void arrayWithDuplicateElementsReturnsSortedArray(IntSorter2 subject, boolean isRecursive) {
        int[] arr = {2, 5, 4, 2, 1, 5};
        int[] expectedArr = {1, 2, 2, 4, 5, 5};

        subject.sort(arr, isRecursive);
        assertArrayEquals(expectedArr, arr);
    }

    @ParameterizedTest
    @MethodSource("sortingAlgorithmToTest")
    public void sortedSubarrayWithUnsortedElementsReturnsSortedArray(IntSorter2 subject, boolean isRecursive) {
        int[] arr = {1, 2, 5, 3, 4};
        int[] expectedArr = {1, 2, 3, 4, 5};

        subject.sort(arr, isRecursive);
        assertArrayEquals(expectedArr, arr);
    }

    @ParameterizedTest
    @MethodSource("sortingAlgorithmToTest")
    public void arrayWithNegativeNumbersReturnsSortedArray(IntSorter2 subject, boolean isRecursive) {
        int[] arr = {-5, -2, -3, -1, -4};
        int[] expectedArr = {-5, -4, -3, -2, -1};

        subject.sort(arr, isRecursive);
        assertArrayEquals(expectedArr, arr);
    }

    @ParameterizedTest
    @MethodSource("sortingAlgorithmToTest")
    public void arrayWithLargeNumbersReturnsSortedArray(IntSorter2 subject, boolean isRecursive) {
        int[] arr = {5000, 100, 200, 50000, 300};
        int[] expectedArr = {100, 200, 300, 5000, 50000};

        subject.sort(arr, isRecursive);
        assertArrayEquals(expectedArr, arr);
    }

    @ParameterizedTest
    @MethodSource("sortingAlgorithmToTest")
    public void arrayWithDuplicateNegativeAndPositiveNumbersReturnsSortedArray(IntSorter2 subject, boolean isRecursive) {
        int[] arr = {-5, 2, 5, -2, 3, -3, 1, -4};
        int[] expectedArr = {-5, -4, -3, -2, 1, 2, 3, 5};

        subject.sort(arr, isRecursive);
        assertArrayEquals(expectedArr, arr);
    }

    @ParameterizedTest
    @MethodSource("sortingAlgorithmToTest")
    public void arrayWithSingleDuplicateNumberReturnsSortedArray(IntSorter2 subject, boolean isRecursive) {
        int[] arr = {1, 5, 2, 5, 3, 4};
        int[] expectedArr = {1, 2, 3, 4, 5, 5};

        subject.sort(arr, isRecursive);
        assertArrayEquals(expectedArr, arr);
    }

    @ParameterizedTest
    @MethodSource("sortingAlgorithmToTest")
    public void arrayWithLargeDuplicateNumbersReturnsSortedArray(IntSorter2 subject, boolean isRecursive) {
        int[] arr = {100000, 50000, 50000, 20000, 10000};
        int[] expectedArr = {10000, 20000, 50000, 50000, 100000};

        subject.sort(arr, isRecursive);
        assertArrayEquals(expectedArr, arr);
    }

    @ParameterizedTest
    @MethodSource("sortingAlgorithmToTest")
    public void arrayWithRandomNumbersReturnsSortedArray(IntSorter2 subject, boolean isRecursive) {
        int[] arr = {23, 5, 87, 12, 9, 76, 45, 3};
        int[] expectedArr = {3, 5, 9, 12, 23, 45, 76, 87};

        subject.sort(arr, isRecursive);
        assertArrayEquals(expectedArr, arr);
    }

    @ParameterizedTest
    @MethodSource("sortingAlgorithmToTest")
    public void arrayWithConsecutiveNumbersReturnsSortedArray(IntSorter2 subject, boolean isRecursive) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expectedArr = {1, 2, 3, 4, 5};

        subject.sort(arr, isRecursive);
        assertArrayEquals(expectedArr, arr);
    }

    @ParameterizedTest
    @MethodSource("sortingAlgorithmToTest")
    public void arrayWithSingleSmallNumberReturnsSortedArray(IntSorter2 subject, boolean isRecursive) {
        int[] arr = {2, 5, 6, 7, 8};
        int[] expectedArr = {2, 5, 6, 7, 8};

        subject.sort(arr, isRecursive);
        assertArrayEquals(expectedArr, arr);
    }

    @ParameterizedTest
    @MethodSource("sortingAlgorithmToTest")
    public void arrayWithSingleLargeNumberReturnsSortedArray(IntSorter2 subject, boolean isRecursive) {
        int[] arr = {1, 2, 3, 4, 100000};
        int[] expectedArr = {1, 2, 3, 4, 100000};

        subject.sort(arr, isRecursive);
        assertArrayEquals(expectedArr, arr);
    }
}