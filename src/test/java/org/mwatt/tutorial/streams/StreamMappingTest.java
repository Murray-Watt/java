package org.mwatt.tutorial.streams;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StreamMappingTest {
    record Person(String name, int age) {}

    @Test
    public void mapToUpperCase() {
        Stream<String> words = Stream.of("hello", "world");
        List<String> result = words.map(String::toUpperCase).collect(Collectors.toList());
        assertEquals(List.of("HELLO", "WORLD"), result);
    }

    @Test
    public void mapLength() {
        Stream<String> words = Stream.of("apple", "banana", "cherry");
        List<Integer> result = words.map(String::length).collect(Collectors.toList());
        assertEquals(List.of(5, 6, 6), result);
    }

    @Test
    public void flatMapSplitWords() {
        Stream<String> lines = Stream.of("hello world", "goodbye");
        List<String> result = lines.flatMap(line -> Stream.of(line.split(" "))).collect(Collectors.toList());
        assertEquals(List.of("hello", "world", "goodbye"), result);
    }

    @Test
    public void flatMapChars() {
        Stream<String> words = Stream.of("cat", "dog", "bird");
        List<Character> result = words.flatMap(word -> word.chars().mapToObj(c -> (char) c)).collect(Collectors.toList());
        assertEquals(List.of('c', 'a', 't', 'd', 'o', 'g', 'b', 'i', 'r', 'd'), result);
    }

    @Test
    public void mapCsvLinetoPerson() {
        Stream<String> lines = Stream.of("Alice,30", "Bob,25", "Charlie,35");
        List<Person> result = lines.map(line -> {
            String[] parts = line.split(",");
            return new Person(parts[0], Integer.parseInt(parts[1]));
        }).collect(Collectors.toList());

        assertEquals(List.of(new Person("Alice", 30), new Person("Bob", 25), new Person("Charlie", 35)), result);
    }
}
