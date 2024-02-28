package org.mwatt.tutorial.strings;

import org.junit.jupiter.api.Test;
import org.mwatt.util.ExampleTestBase;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*
    contains
    endsWith
    indexOf
    lastIndexOf
    matches
    regionMatches
    startsWith
 */
public class StringSearchTest extends ExampleTestBase {

    @Test
    public void compareToExamples() {
        {
            String s1 = "Hello";
            String s2 = "Hello";
            String s3 = "World";
            String s4 = "Hello, World!";
            String s5 = "Hello, World!";
            String s6 = "Hello, world!";
            String s7 = "Hello, WORLD!";

            System.out.println(s1.compareTo(s2));
            System.out.println(s1.compareTo(s3));
            System.out.println(s1.compareTo(s4));
            System.out.println(s4.compareTo(s5));
            System.out.println(s5.compareTo(s6));
            System.out.println(s6.compareTo(s7));
        }

        {
            String s1 = "Hello";
            String s2 = "Hello";
            String s3 = "World";
            String s4 = "Hello, World!";
            String s5 = "Hello, World!";
            String s6 = "Hello, world!";
            String s7 = "Hello, WORLD!";

            System.out.println("s1.compareToIgnoreCase(s2): " + s1.compareToIgnoreCase(s2));
            System.out.println("s1.compareToIgnoreCase(s3): " + s1.compareToIgnoreCase(s3));
            System.out.println("s1.compareToIgnoreCase(s4): " + s1.compareToIgnoreCase(s4));
            System.out.println("s4.compareToIgnoreCase(s5): " + s4.compareToIgnoreCase(s5));
            System.out.println("s5.compareToIgnoreCase(s6): " + s5.compareToIgnoreCase(s6));
            System.out.println("s6.compareToIgnoreCase(s7): " + s6.compareToIgnoreCase(s7));
        }
    }

    @Test
    public void containsExamples() {
        String s = "Hello, World!";
        System.out.println("s.contains(\"Hello\"): " + s.contains("Hello"));
        System.out.println("s.contains(\"World\"): " + s.contains("World"));
        System.out.println("s.contains(\"!\"): " + s.contains("!"));
    }

    @Test
    public void indexOfExamples() {
        {
            String s = "Hello, World!";
            System.out.println("s.indexOf(\"Hello\"): " + s.indexOf("Hello"));
            System.out.println("s.indexOf(\"World\"): " + s.indexOf("World"));
            System.out.println("s.indexOf(\"!\"): " + s.indexOf("!"));
        }

        {
            String s = "Hello, World!";
            System.out.println("s.length(): " + s.length());

            String s1 = "Hello";
            String s2 = "Goodbye";
            String s3 = "World";

            String pattern = "Hello|Goodbye";

            System.out.println(s1.matches(pattern));
            System.out.println(s2.matches(pattern));
            System.out.println(s3.matches(pattern));
        }
    }

    @Test
    public void startsWithExample() {
        String s = "Hello, World!";
        System.out.println("s.startsWith(\"Hello\"): " + s.startsWith("Hello"));
        System.out.println("s.startsWith(\"World\"): " + s.startsWith("World"));
        System.out.println("s.startsWith(\"!\"): " + s.startsWith("!"));
    }

    public void endWithExample() {
        String s = "Hello, World!";
        System.out.println("s.endsWith(\"Hello\"): " + s.endsWith("Hello"));
        System.out.println("s.endsWith(\"World\"): " + s.endsWith("World"));
        System.out.println("s.endsWith(\"!\"): " + s.endsWith("!"));
    }

    @Test
    public void lastIndexOfExample() {
        {
            String s = "Hello, World!";
            System.out.println("s.lastIndexOf(\"Hello\"): " + s.lastIndexOf("Hello"));
            System.out.println("s.lastIndexOf(\"World\"): " + s.lastIndexOf("World"));
            System.out.println("s.lastIndexOf(\"!\"): " + s.lastIndexOf("!"));
        }
    }

    @Test
    public void matchesExamples() {
        String s = "Hello, World!";
        System.out.println("s.length(): " + s.length());

        String s1 = "Hello";
        String s2 = "Goodbye";
        String s3 = "World";

        String pattern = "Hello|Goodbye";

        System.out.println(s1.matches(pattern));
        System.out.println(s2.matches(pattern));
        System.out.println(s3.matches(pattern));
    }

    @Test
    public void regionMatchesExamples() {
        String s1 = "Hello, World! 'ello";
        String s2 = "Hello";
        String s3 = "WORLD";

        System.out.println("s1.regionMatches(0, s2, 0, 5): " + s1.regionMatches(0, s2, 0, 5));
        assertTrue(s1.regionMatches(0, s2, 0, 5));

        System.out.println("s1.regionMatches(7, s3, 0, 5): " + s1.regionMatches(true,7, s3, 0, 5));
        assertTrue(s1.regionMatches(true,7, s3, 0, 5));

        System.out.println("s1.regionMatches(7, s3, 0, 5): " + s1.regionMatches(false,14, s2, 0, 5));
        assertFalse(s1.regionMatches(false,14, s2, 0, 5));
        System.out.println("s1.regionMatches(7, s3, 0, 5): " + s1.regionMatches(false,15, s2, 1, 4));
        assertTrue(s1.regionMatches(false,15, s2, 1, 4));
    }

    public static void main(String[] args) {
        StringSearchTest examples = new StringSearchTest();
        examples.runExamples("String contains", examples::containsExamples);
        examples.runExamples("String startsWith and endsWith", examples::endWithExample);
        examples.runExamples("String indexOf", examples::indexOfExamples);
        examples.runExamples("String lastIndexOf", examples::lastIndexOfExample);
        examples.runExamples("String startsWith and endsWith", examples::startsWithExample);
        examples.runExamples("String compareTo", examples::compareToExamples);
        examples.runExamples("String matches", examples::matchesExamples);
        examples.runExamples("String regionMatches", examples::regionMatchesExamples);
    }
}