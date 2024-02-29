package org.mwatt.tutorial.strings;

import org.junit.jupiter.api.Test;

import static java.util.stream.Collectors.joining;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*
    chars (introduced in Java 9)
    codePoints (introduced in Java 9)
    format
    lines (introduced in Java 11)
    repeat (introduced in Java 11)
    strip
    stripLeading
    stripTrailing
    toCharArray
    toLowerCase
    toUpperCase
    trim
    valueOf
*/
@SuppressWarnings("UnnecessaryCallToStringValueOf")
public class StringTransformationTest {

    // chars Java 9
    @Test
    public void charsExamples() {
        String string1 = "Hello, World!";
        String string2 = string1.chars().mapToObj((c) -> Character.valueOf((char) c).toString()).collect(joining());

        assertTrue(string1.contentEquals(string2));
    }

    // Code points Java 9
    @Test
    public void codePointsExamples() {
        {
            String s = "Hello, World!";
            System.out.println(s.codePointAt(0));
            System.out.println(s.codePointAt(7));
            System.out.println(s.codePointAt(12));
        }
        {
            String s = "Hello, World!";
            System.out.println(s.codePointBefore(1));
            System.out.println(s.codePointBefore(8));
            System.out.println(s.codePointBefore(13));
        }
        {
            String s = "Hello, World!";
            System.out.println(s.codePointCount(0, 1));
            System.out.println(s.codePointCount(0, 8));
            System.out.println(s.codePointCount(0, 13));
        }
    }
    @Test
    public void basicFormatExample() {
        System.out.println("s.format(\"Hello, %s!\", \"World\"): " + String.format("Hello, %s!", "World"));
        System.out.println("s.format(\"Hello, %s!\", \"World\"): " + String.format("Hello, %s!", "World"));
    }

    @Test
    public void linesExamples() {
        String string1 = "Hello, World!\nGoodBye, World!\nHello, World!\n";

        string1.lines().forEach(System.out::println);
        assertEquals(3, string1.lines().count());
    }

    @Test
    public void repeatExamples() {
        String string1 = "Hello, World!";
        System.out.println("string1.repeat(3): " + string1.repeat(3));
        assertEquals("Hello, World!Hello, World!Hello, World!", string1.repeat(3));
    }

    @Test
    public void stripExamples() {
        String string1 = "\t\nHello, World!  ";
        System.out.println("string1.strip(): " + string1.strip());
        assertEquals("Hello, World!", string1.strip());
        System.out.println("string1.stripLeading(): " + string1.stripLeading());
        assertEquals("Hello, World!  ", string1.stripLeading());
        System.out.println("string1.stripTrailing(): " + string1.stripTrailing());
        assertEquals("\t\nHello, World!", string1.stripTrailing());
    }

    /*
        toCharArray
    toLowerCase
    toUpperCase
    trim
    valueOf
     */
    @Test
    public void toCharArrayExamples() {
        String string1 = "Hello, World!";
        char[] charArray = string1.toCharArray();
        assertEquals("Hello, World!", new String(charArray));
    }

    @Test
    public void toLowerCaseExamples() {
        String string1 = "Hello, World!";
        System.out.println("string1.toLowerCase(): " + string1.toLowerCase());
        assertEquals("hello, world!", string1.toLowerCase());
    }

    @Test
    public void toUpperCaseExamples() {
        String string1 = "Hello, World!";
        System.out.println("string1.toUpperCase(): " + string1.toUpperCase());
        assertEquals("HELLO, WORLD!", string1.toUpperCase());
    }

    @Test
    public void trimExamples() {
        String string1 = "\t\nHello, World!  ";
        System.out.println("string1.trim(): " + string1.trim());
        assertEquals("Hello, World!", string1.trim());
    }

    @Test
    public void valueOfExamples() {
        System.out.println("String.valueOf(123): " + String.valueOf(123));
        assertEquals("123", String.valueOf(123));
    }
}
