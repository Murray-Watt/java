package org.mwatt.tutorial.streams;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValueTypesStreamTest {

    @Test
    public void sumIntStreamFromArray() {
        int[] numbers = {1, 2, 3, 4, 5};
        IntStream stream = Arrays.stream(numbers);
        assertEquals(15, stream.sum());
    }

    @Test
    public void sumIntStreamUsingRange() {
        IntStream stream = IntStream.range(1, 6);
        assertEquals(15, stream.sum());
    }

    @Test
    public void sumLongStreamFromArray() {
        long[] numbers = {1L, 2L, 3L, 4L, 5L};
        LongStream stream = Arrays.stream(numbers);
        assertEquals(15, stream.sum());
    }

    @Test
    public void sumLongStreamUsingRange() {
        LongStream stream = LongStream.range(1, 6);
        assertEquals(15, stream.sum());
    }

    @Test
    public void sumDoubleStreamFromArray() {
        double[] numbers = {1.0, 2.0, 3.0, 4.0, 5.0};
        DoubleStream stream = Arrays.stream(numbers);
        assertEquals(15.0, stream.sum(), 0.0001);
    }

    @Test
    public void sumDoubleStreamUsingOf() {
        DoubleStream stream = DoubleStream.of(1.0, 2.0, 3.0, 4.0, 5.0);
        assertEquals(15.0, stream.sum(), 0.0001);
    }
}

