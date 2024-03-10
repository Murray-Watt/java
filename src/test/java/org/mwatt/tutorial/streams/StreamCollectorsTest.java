package org.mwatt.tutorial.streams;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("SimplifyStreamApiCallChains")
public class StreamCollectorsTest {

    record Person(String name, int age) {}

    private final List<Person> people = List.of(
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 35),
            new Person("David", 20),
            new Person("Eve", 40)
    );

    @Test
    public void collectToList() {
        List<Person> result = people.stream().collect(Collectors.toList());
        assertEquals(people, result);
    }

    @Test
    public void collectToSet() {
        Set<Person> result = people.stream().collect(Collectors.toSet());
        assertEquals(Set.copyOf(people), result);
    }

    @Test
    public void collectToMap() {
        Map<String, Integer> result = people.stream()
                .collect(Collectors.toMap(Person::name, Person::age));
        assertEquals(Map.of("Alice", 30, "Bob", 25, "Charlie", 35, "David", 20, "Eve", 40), result);
    }

    @Test
    public void sumAges() {
        int sum = people.stream().collect(Collectors.summingInt(Person::age));
        assertEquals(30 + 25 + 35 + 20 + 40, sum);
    }
}

