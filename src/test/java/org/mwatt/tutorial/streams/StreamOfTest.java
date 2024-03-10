package org.mwatt.tutorial.streams;
import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StreamOfTest {

    @Test
    public void createStreamOfElements() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        assertEquals("[1, 2, 3, 4, 5]", stream.map(Object::toString).collect(Collectors.joining(", ", "[", "]")));
    }

    @Test
    public void createStreamOfArray() {
        Integer[] numbers = {1, 2, 3, 4, 5};
        Stream<Integer> stream = Stream.of(numbers);
        assertEquals("[1, 2, 3, 4, 5]", stream.map(Object::toString).collect(Collectors.joining(", ", "[", "]")));
    }

    @Test
    public void createStreamOfMixedElements() {
        Stream<Object> stream = Stream.of(1, "two", 3.0, "four", 5);
        assertEquals("[1, two, 3.0, four, 5]", stream.map(Object::toString).collect(Collectors.joining(", ", "[", "]")));
    }
}
