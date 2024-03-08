package org.mwatt.tutorial.streams;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StreamConstructionTest {

    @Test
    public void createEmptyStream() {
        Stream<Integer> emptyStream = Stream.empty();
        assertEquals(0, emptyStream.count());
    }

    @Test
    public void createStreamOfElements() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        assertEquals(5, stream.count());
    }

    @Test
    public void createStreamFromArray() {
        Integer[] numbers = {1, 2, 3, 4, 5};
        Stream<Integer> stream = Stream.of(numbers);
        assertEquals(5, stream.count());
    }

    @Test
    public void createStreamOfNullable() {
        Stream<Integer> stream = Stream.ofNullable(1);
        assertEquals(1, stream.count());
    }

    @Test
    public void createStreamIterate() {
        Stream<Integer> stream = Stream.iterate(0, i -> i + 2).limit(5);
        assertEquals(5, stream.count());
    }

    @Test
    public void createStreamGenerate() {
        Stream<Integer> stream = Stream.generate(() -> 1).limit(5);
        assertEquals(5, stream.count());
    }

    @Test
    public void createStreamBuilder() {
        Stream<Integer> stream = Stream.<Integer>builder().add(1).add(2).add(3).build();
        assertEquals(3, stream.count());
    }

    @Test
    public void createStreamConcat() {
        Stream<Integer> stream1 = Stream.of(1, 2, 3);
        Stream<Integer> stream2 = Stream.of(4, 5, 6);
        Stream<Integer> stream = Stream.concat(stream1, stream2);
        assertEquals(6, stream.count());
    }

    @Test
    public void createStreamFromArrayList() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        Stream<Integer> stream = list.stream();
        assertEquals(5, stream.count());
    }

    @Test
    public void createStreamWithBuilderAndAccept() {
        Stream.Builder<Integer> builder = Stream.builder();
        builder.accept(1);
        builder.accept(2);
        builder.accept(3);
        builder.accept(4);
        Stream<Integer> stream = builder.build();

        AtomicInteger i = new AtomicInteger();
        stream.parallel().forEach(number -> {
                    System.out.println(number + " " + Thread.currentThread().getName());
                    i.getAndIncrement();
                }
        );

        assertEquals(4, i.get());
    }
}
