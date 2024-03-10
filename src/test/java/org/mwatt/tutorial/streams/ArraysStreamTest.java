package org.mwatt.tutorial.streams;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraysStreamTest {

    @Test
    public void streamIntArray() {
        int[] numbers = {1, 2, 3, 4, 5};
        IntStream stream = Arrays.stream(numbers);
        assertEquals(15, stream.sum());
    }

    @Test
    public void streamStringArray() {
        String[] words = {"hello", "world"};
        long count = Arrays.stream(words)
                .map(String::toUpperCase)
                .mapToInt(String::length)
                .sum();
        assertEquals(10, count);
    }

    @Test
    public void streamArrayRange() {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] result = Arrays.stream(numbers, 1, 4).toArray();
        assertArrayEquals(new int[]{2, 3, 4}, result);
    }
}
