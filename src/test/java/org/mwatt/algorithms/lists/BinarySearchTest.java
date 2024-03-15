package org.mwatt.algorithms.lists;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {
    private final BinarySearch binarySearch = new BinarySearch();

    @Test
    void findNonExistingElementRecursive() {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15};
        int key = 8;
        int expectedIndex = -1;
        assertEquals(expectedIndex, binarySearch.binarySearchRecursive(sortedArray, key));
    }

    @Test
    void findElementInEmptyArrayRecursive() {
        int[] sortedArray = {};
        int key = 5;
        int expectedIndex = -1;
        assertEquals(expectedIndex, binarySearch.binarySearchRecursive(sortedArray, key));
    }

    @Test
    void findElementWithMultipleCopiesRecursive() {
        int[] sortedArray = {1, 3, 5, 5, 5, 7, 9, 11, 13, 15};
        int key = 5;
        int expectedIndex = 4;
        assertEquals(expectedIndex, binarySearch.binarySearchRecursive(sortedArray, key));
    }

    @Test
    void findElementAtStartRecursive() {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15};
        int key = 1;
        int expectedIndex = 0;
        assertEquals(expectedIndex, binarySearch.binarySearchRecursive(sortedArray, key));
    }

    @Test
    void findElementAtEndRecursive() {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15};
        int key = 15;
        int expectedIndex = 7;
        assertEquals(expectedIndex, binarySearch.binarySearchRecursive(sortedArray, key));
    }

    @Test
    void findElementInMiddleRecursive() {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15};
        int key = 7;
        int expectedIndex = 3;
        assertEquals(expectedIndex, binarySearch.binarySearchRecursive(sortedArray, key));
    }


    @Test
    void findNonExistingElementIterative() {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15};
        int key = 8;
        int expectedIndex = -1;
        assertEquals(expectedIndex, binarySearch.binarySearchIterative(sortedArray, key));
    }

    @Test
    void findElementInEmptyArrayIterative() {
        int[] sortedArray = {};
        int key = 5;
        int expectedIndex = -1;
        assertEquals(expectedIndex, binarySearch.binarySearchIterative(sortedArray, key));
    }

    @Test
    void findElementWithMultipleCopiesIterative() {
        int[] sortedArray = {1, 3, 5, 5, 5, 7, 9, 11, 13, 15};
        int key = 5;
        int expectedIndex = 4;
        assertEquals(expectedIndex, binarySearch.binarySearchIterative(sortedArray, key));
    }

    @Test
    void findElementAtStartIterative() {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15};
        int key = 1;
        int expectedIndex = 0;
        assertEquals(expectedIndex, binarySearch.binarySearchIterative(sortedArray, key));
    }

    @Test
    void findElementAtEndIterative() {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15};
        int key = 15;
        int expectedIndex = 7;
        assertEquals(expectedIndex, binarySearch.binarySearchIterative(sortedArray, key));
    }

    @Test
    void findElementInMiddleIterative() {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15};
        int key = 7;
        int expectedIndex = 3;
        assertEquals(expectedIndex, binarySearch.binarySearchIterative(sortedArray, key));
    }

    @Test
    void findNonExistingElementArray() {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15};
        int key = 8;
        int expectedIndex = -1;
        assertEquals(expectedIndex, binarySearch.binarySearchArrays(sortedArray, key));
    }

    @Test
    void findElementInEmptyArrayArray() {
        int[] sortedArray = {};
        int key = 5;
        int expectedIndex = -1;
        assertEquals(expectedIndex, binarySearch.binarySearchArrays(sortedArray, key));
    }

    @Test
    void findElementWithMultipleCopiesArray() {
        int[] sortedArray = {1, 3, 5, 5, 5, 7, 9, 11, 13, 15};
        int key = 5;
        int expectedIndex = 4;
        assertEquals(expectedIndex, binarySearch.binarySearchArrays(sortedArray, key));
    }

    @Test
    void findElementAtStartArray() {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15};
        int key = 1;
        int expectedIndex = 0;
        assertEquals(expectedIndex, binarySearch.binarySearchArrays(sortedArray, key));
    }

    @Test
    void findElementAtEndArray() {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15};
        int key = 15;
        int expectedIndex = 7;
        assertEquals(expectedIndex, binarySearch.binarySearchArrays(sortedArray, key));
    }

    @Test
    void findElementInMiddleArray() {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15};
        int key = 7;
        int expectedIndex = 3;
        assertEquals(expectedIndex, binarySearch.binarySearchArrays(sortedArray, key));
    }

    @Test
    void findNonExistingElementCollections() {
        Integer[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15};
        int key = 8;
        int expectedIndex = -1;
        assertEquals(expectedIndex, binarySearch.binarySearchCollections(Arrays.asList(sortedArray), key));
    }

    @SuppressWarnings("MismatchedReadAndWriteOfArray")
    @Test
    void findElementInEmptyArrayCollections() {
        Integer[] sortedArray = {};
        int key = 5;
        int expectedIndex = -1;
        assertEquals(expectedIndex, binarySearch.binarySearchCollections(Arrays.asList(sortedArray), key));
    }

    @Test
    void findElementWithMultipleCopiesCollections() {
        Integer[] sortedArray = {1, 3, 5, 5, 5, 7, 9, 11, 13, 15};
        int key = 5;
        int expectedIndex = 4;
        assertEquals(expectedIndex, binarySearch.binarySearchCollections(Arrays.asList(sortedArray), key));
    }

    @Test
    void findElementAtStartCollections() {
        Integer[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15};
        int key = 1;
        int expectedIndex = 0;
        assertEquals(expectedIndex, binarySearch.binarySearchCollections(Arrays.asList(sortedArray), key));
    }

    @Test
    void findElementAtEndCollections() {
        Integer[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15};
        int key = 15;
        int expectedIndex = 7;
        assertEquals(expectedIndex, binarySearch.binarySearchCollections(Arrays.asList(sortedArray), key));
    }

    @Test
    void findElementInMiddleCollections() {
        Integer[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15};
        int key = 7;
        int expectedIndex = 3;
        assertEquals(expectedIndex, binarySearch.binarySearchCollections(Arrays.asList(sortedArray), key));
    }
}
