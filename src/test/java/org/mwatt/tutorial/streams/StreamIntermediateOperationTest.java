package org.mwatt.tutorial.streams;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StreamIntermediateOperationTest {

    @Test
    public void mapNumbersToTheirSquares() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> squaredNumbersStream = numbers.stream().map(n -> n * n);
        List<Integer> squaredNumbers = squaredNumbersStream.collect(Collectors.toList());

        assertEquals(Arrays.asList(1, 4, 9, 16, 25), squaredNumbers);
    }

    @Test
    public void filterEvenNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> evenNumbersStream = numbers.stream().filter(n -> n % 2 == 0);
        List<Integer> evenNumbers = evenNumbersStream.collect(Collectors.toList());

        assertEquals(Arrays.asList(2, 4), evenNumbers);
    }

    @Test
    public void sortNumbers() {
        List<Integer> numbers = Arrays.asList(5, 3, 1, 4, 2);
        Stream<Integer> sortedNumbersStream = numbers.stream().sorted();
        List<Integer> sortedNumbers = sortedNumbersStream.collect(Collectors.toList());

        assertEquals(Arrays.asList(1, 2, 3, 4, 5), sortedNumbers);
    }

    @Test
    public void findDistinctNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);
        Stream<Integer> distinctNumbersStream = numbers.stream().distinct();
        List<Integer> distinctNumbers = distinctNumbersStream.collect(Collectors.toList());

        assertEquals(Arrays.asList(1, 2, 3, 4), distinctNumbers);
    }
}
