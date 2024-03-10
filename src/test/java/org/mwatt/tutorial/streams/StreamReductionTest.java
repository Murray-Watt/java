package org.mwatt.tutorial.streams;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StreamReductionTest {
    @Test
    public void reduceStreamSum() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);
        assertEquals(15, sum.orElse(0));
    }

    @Test
    public void reduceStreamProduct() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Optional<Integer> product = numbers.stream().reduce((a, b) -> a * b);
        assertEquals(120, product.orElse(0));
    }

    @Test
    public void reduceStreamWithIdentitySum() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sumWithIdentity = numbers.stream().reduce(10, Integer::sum);
        assertEquals(25, sumWithIdentity);
    }

    @Test
    public void reduceStreamWithIdentityProduct() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int productWithIdentity = numbers.stream().reduce(2, (a, b) -> a * b);
        assertEquals(240, productWithIdentity);
    }
}

