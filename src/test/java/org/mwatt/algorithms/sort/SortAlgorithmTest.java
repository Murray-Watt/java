package org.mwatt.algorithms.sort;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


public class SortAlgorithmTest {

    private static Stream<Arguments> sortingAlgorithmToTest() {
        return Stream.of(
                Arguments.of(new BubbleSort()),
                Arguments.of(new SelectionSort()),
                Arguments.of(new InsertionSort())
        );
    }

    @ParameterizedTest
    @MethodSource("sortingAlgorithmToTest")
    public void emptyArrayReturnsEmptyArray(IntSorter subject) {
        int[] data = {};
        int[] expected = {};

        subject.sort(data);
        assertArrayEquals(expected, data);
    }

    @ParameterizedTest
    @MethodSource("sortingAlgorithmToTest")
    public void alreadySortedArrayReturnsSameArray(IntSorter subject) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expectedArr = {1, 2, 3, 4, 5};

        subject.sort(arr);
        assertArrayEquals(expectedArr, arr);
    }

    @ParameterizedTest
    @MethodSource("sortingAlgorithmToTest")
    public void reverseSortedArrayReturnsSortedArray(IntSorter subject) {
        int[] arr = {5, 4, 3, 2, 1};
        int[] expectedArr = {1, 2, 3, 4, 5};

        subject.sort(arr);
        assertArrayEquals(expectedArr, arr);
    }

    @ParameterizedTest
    @MethodSource("sortingAlgorithmToTest")
    public void arrayWithDuplicateElementsReturnsSortedArray(IntSorter subject) {
        int[] arr = {2, 5, 4, 2, 1, 5};
        int[] expectedArr = {1, 2, 2, 4, 5, 5};

        subject.sort(arr);
        assertArrayEquals(expectedArr, arr);
    }

    @ParameterizedTest
    @MethodSource("sortingAlgorithmToTest")
    public void sortedSubarrayWithUnsortedElementsReturnsSortedArray(IntSorter subject) {
        int[] arr = {1, 2, 5, 3, 4};
        int[] expectedArr = {1, 2, 3, 4, 5};

        subject.sort(arr);
        assertArrayEquals(expectedArr, arr);
    }

    @ParameterizedTest
    @MethodSource("sortingAlgorithmToTest")
    public void arrayWithNegativeNumbersReturnsSortedArray(IntSorter subject) {
        int[] arr = {-5, -2, -3, -1, -4};
        int[] expectedArr = {-5, -4, -3, -2, -1};

        subject.sort(arr);
        assertArrayEquals(expectedArr, arr);
    }

    @ParameterizedTest
    @MethodSource("sortingAlgorithmToTest")
    public void arrayWithLargeNumbersReturnsSortedArray(IntSorter subject) {
        int[] arr = {5000, 100, 200, 50000, 300};
        int[] expectedArr = {100, 200, 300, 5000, 50000};

        subject.sort(arr);
        assertArrayEquals(expectedArr, arr);
    }

    @ParameterizedTest
    @MethodSource("sortingAlgorithmToTest")
    public void arrayWithDuplicateNegativeAndPositiveNumbersReturnsSortedArray(IntSorter subject) {
        int[] arr = {-5, 2, 5, -2, 3, -3, 1, -4};
        int[] expectedArr = {-5, -4, -3, -2, 1, 2, 3, 5};

        subject.sort(arr);
        assertArrayEquals(expectedArr, arr);
    }

    @ParameterizedTest
    @MethodSource("sortingAlgorithmToTest")
    public void arrayWithSingleDuplicateNumberReturnsSortedArray(IntSorter subject) {
        int[] arr = {1, 5, 2, 5, 3, 4};
        int[] expectedArr = {1, 2, 3, 4, 5, 5};

        subject.sort(arr);
        assertArrayEquals(expectedArr, arr);
    }

    @ParameterizedTest
    @MethodSource("sortingAlgorithmToTest")
    public void arrayWithLargeDuplicateNumbersReturnsSortedArray(IntSorter subject) {
        int[] arr = {100000, 50000, 50000, 20000, 10000};
        int[] expectedArr = {10000, 20000, 50000, 50000, 100000};

        subject.sort(arr);
        assertArrayEquals(expectedArr, arr);
    }

    @ParameterizedTest
    @MethodSource("sortingAlgorithmToTest")
    public void arrayWithRandomNumbersReturnsSortedArray(IntSorter subject) {
        int[] arr = {23, 5, 87, 12, 9, 76, 45, 3};
        int[] expectedArr = {3, 5, 9, 12, 23, 45, 76, 87};

        subject.sort(arr);
        assertArrayEquals(expectedArr, arr);
    }

    @ParameterizedTest
    @MethodSource("sortingAlgorithmToTest")
    public void arrayWithConsecutiveNumbersReturnsSortedArray(IntSorter subject) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expectedArr = {1, 2, 3, 4, 5};

        subject.sort(arr);
        assertArrayEquals(expectedArr, arr);
    }

    @ParameterizedTest
    @MethodSource("sortingAlgorithmToTest")
    public void arrayWithSingleSmallNumberReturnsSortedArray(IntSorter subject) {
        int[] arr = {2, 5, 6, 7, 8};
        int[] expectedArr = {2, 5, 6, 7, 8};

        subject.sort(arr);
        assertArrayEquals(expectedArr, arr);
    }

    @ParameterizedTest
    @MethodSource("sortingAlgorithmToTest")
    public void arrayWithSingleLargeNumberReturnsSortedArray(IntSorter subject) {
        int[] arr = {1, 2, 3, 4, 100000};
        int[] expectedArr = {1, 2, 3, 4, 100000};

        subject.sort(arr);
        assertArrayEquals(expectedArr, arr);
    }
}