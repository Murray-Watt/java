package org.mwatt.tutorial.streams;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StreamFilteringTest {

    record Person(String name, int age) {}

    private final List<Person> people = List.of(
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 35),
            new Person("David", 20),
            new Person("Eve", 40)
    );

    @Test
    public void filterAgeAbove30() {
        List<Person> result = people.stream()
                .filter(person -> person.age() > 30)
                .collect(Collectors.toList());
        assertEquals(List.of(new Person("Charlie", 35), new Person("Eve", 40)), result);
    }

    @Test
    public void filterNameStartingWithA() {
        List<Person> result = people.stream()
                .filter(person -> person.name().startsWith("A"))
                .collect(Collectors.toList());
        assertEquals(List.of(new Person("Alice", 30)), result);
    }

    @Test
    public void filterAgeBetween25And35() {
        List<Person> result = people.stream()
                .filter(person -> person.age() >= 25 && person.age() <= 35)
                .collect(Collectors.toList());
        assertEquals(List.of(new Person("Alice", 30), new Person("Bob", 25), new Person("Charlie", 35)), result);
    }
}

