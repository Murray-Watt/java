package org.mwatt.tutorial.streams;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings({"RedundantOperationOnEmptyContainer", "ConstantValue", "ReplaceInefficientStreamCount"})
public class CollectionsStreamTest {

    @Test
    public void streamList() {
        List<String> words = Arrays.asList("hello", "world");
        String result = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));
        assertEquals("HELLO, WORLD", result);
    }

    @Test
    public void streamEmptyList() {
        List<String> emptyList = List.of();
        long count = emptyList.stream().count();
        assertEquals(0, count);
    }

    @Test
    public void streamSingletonList() {
        List<Integer> singletonList = List.of(42);
        int sum = singletonList.stream().findFirst().orElse(0);
        assertEquals(42, sum);
    }
}