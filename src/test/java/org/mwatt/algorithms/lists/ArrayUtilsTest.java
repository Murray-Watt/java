package org.mwatt.algorithms.lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilsTest {
    @Test
    void limitDistinctIntsWhenMaxCountIsOne() {
        int[] input = {1, 1, 2, 2, 2, 3, 4, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        int[] result = ArrayUtils.nDistinctInts(input, 1);
        assertArrayEquals(expected, result);
    }

    @Test
    void limitDistinctIntsWhenMaxCountIsTwo() {
        int[] input = {1, 1, 2, 2, 2, 3, 4, 4, 5};
        int[] expected = {1, 1, 2, 2, 3, 4, 4, 5};
        int[] result = ArrayUtils.nDistinctInts(input, 2);
        assertArrayEquals(expected, result);
    }

    @Test
    void limitDistinctIntsWhenMaxCountIsThree() {
        int[] input = {1, 1, 2, 2, 2, 3, 4, 4, 5};
        int[] expected = {1, 1, 2, 2, 2, 3, 4, 4, 5};
        int[] result = ArrayUtils.nDistinctInts(input, 3);
        assertArrayEquals(expected, result);
    }

    @Test
    void limitDistinctIntsWhenMaxCountIsGreaterThanOccurrences() {
        int[] input = {1, 1, 2, 2, 2, 3, 4, 4, 5};
        int[] expected = {1, 1, 2, 2, 2, 3, 4, 4, 5};
        int[] result = ArrayUtils.nDistinctInts(input, 5);
        assertArrayEquals(expected, result);
    }

    @Test
    void limitDistinctIntsWhenMaxCountIsZero() {
        int[] input = {1, 1, 2, 2, 2, 3, 4, 4, 5};
        int[] expected = {};
        int[] result = ArrayUtils.nDistinctInts(input, 0);
        assertArrayEquals(expected, result);
    }

    @Test
    void limitDistinctIntsWhenArrayIsEmpty() {
        int[] input = {};
        int[] expected = {};
        int[] result = ArrayUtils.nDistinctInts(input, 2);
        assertArrayEquals(expected, result);
    }

    @Test
    void limitDistinctIntsWhenArrayIsNull() {
        int[] input = null;
        int[] expected = {};
        int[] result = ArrayUtils.nDistinctInts(input, 2);
        assertArrayEquals(expected, result);
    }
}