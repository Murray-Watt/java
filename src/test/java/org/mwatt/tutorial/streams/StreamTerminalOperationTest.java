package org.mwatt.tutorial.streams;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings({"SimplifyStreamApiCallChains", "ReplaceInefficientStreamCount"})
public class StreamTerminalOperationTest {
    @Test
    public void performForEach() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream().forEach(System.out::println);
        // Manually verify output in console
    }

    @Test
    public void collectToList() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> collectedList = numbers.stream().collect(Collectors.toList());

        assertEquals(Arrays.asList(1, 2, 3, 4, 5), collectedList);
    }

    @Test
    public void reduceToSum() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);

        assertEquals(15, sum.orElse(0));
    }

    @Test
    public void countElements() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        long count = numbers.stream().count();

        assertEquals(5, count);
    }
}
