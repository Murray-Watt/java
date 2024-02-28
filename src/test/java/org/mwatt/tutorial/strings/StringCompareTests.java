package org.mwatt.tutorial.strings;

import org.junit.jupiter.api.Test;
import org.mwatt.util.ExampleTestBase;
import java.util.Arrays;

import static java.util.stream.Collectors.joining;
import static org.junit.jupiter.api.Assertions.*;

/*
        equals
        equalsIgnoreCase
        contentEquals
        compareTo
        compareToIgnoreCase
        isEmpty
        isBlank
 */
public class StringCompareTests extends ExampleTestBase {
    @Test
    public void objectEqualsExamples() {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = new String("Hello");

        System.out.println("\"Hello\" interned == \"Hello\" Interned: " + s1 == s2);
        assertEquals(s1, s2);

        System.out.println("\"Hello\" interned == \"Hello\" not Interned ==" + s1 == s3);
        assertNotEquals(s1, s3);

        System.out.println("Hello interned ==" + s1 == s2);

        System.out.println("\"Hello\" not interned == \"Hello\" not Interned" + s3 == s4);
        assertNotEquals(s3, s4);
    }

    @Test
    public void valueEqualsExamples() {
        String s1 = new String("Hello");  // Not interned
        String s2 = new String("Hello");  // Not interned
        String s3 = new String("hello");  // Not interned
        String s4 = new String("HELLO");  // Not interned

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
    }

    @Test
    public void equalIgnoreCaseExamples() {
        String s1 = new String("Hello");  // Not interned
        String s2 = new String("Hello");  // Not interned
        String s3 = new String("hello");  // Not interned
        String s4 = new String("HELLO");  // Not interned

        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.equalsIgnoreCase(s4));
    }

    /*
        return 0 if the string is equal to the other string
        <0 if the string is lexicographically less than the other string
        >0 if the string is lexicographically greater than the other string

        if strings differ in length and share a common prefix,
        the shorter string is considered less than the longer one by the difference in length

        if the strings differ in character at one or more index positions,
        the first differing character determines the result of the comparison

     */
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
        };
    }

    @Test
    public void contentEqualsExamples() {
        String string1 = "Hello";
        String string2 = "Hello";
        StringBuilder stringBuilder1 = new StringBuilder("Hello");
        StringBuffer stringBuffer1 = new StringBuffer("Hello");
        char[] charArray1 = {'H', 'e', 'l', 'l', 'o'};

        System.out.println("string1.contentEquals(string2): " + string1.contentEquals(string2));
        assertTrue(string1.contentEquals(string2));

        System.out.println("string1.contentEquals(stringBuilder1): " + string1.contentEquals(stringBuilder1));
        assertTrue(string1.contentEquals(stringBuilder1));

        System.out.println("string2.contentEquals(stringBuffer1): " + string2.contentEquals(stringBuffer1));
        assertTrue(string2.contentEquals(stringBuffer1));
    }


    @Test
    public void isEmptyExamples() {
        String s1 = "Hello";
        String s2 = "";
        String s3 = " ";
        String s4 = "  ";
        String s5 = "Hello, World!";

        System.out.println("s1: \"" + s1 + "\"");
        System.out.println("s1.isEmpty(): " + s1.isEmpty());
        assertFalse(s1.isEmpty());

        System.out.println("s2: " + s2 + "\"");
        System.out.println("s2.isEmpty(): " + s2.isEmpty());
        assertTrue(s2.isEmpty());

        System.out.println("s3: \"" + s3 + "\"");
        System.out.println("s3.isEmpty(): " + s3.isEmpty());
        assertFalse(s3.isEmpty());

        System.out.println("s4: \"" + s4 + "\"");
        System.out.println("s4.isEmpty(): " + s4.isEmpty());
        assertFalse(s4.isEmpty());

        System.out.println("s5: \"" + s5 + "\"");
        System.out.println("s5.isEmpty(): " + s5.isEmpty());
        assertFalse(s5.isEmpty());
    }

    @Test
    public void isBlankExamples() {
        String s1 = "Hello";
        String s2 = "";
        String s3 = " ";
        String s4 = "  ";
        String s5 = "Hello, World!";

        System.out.println("s1: \"" + s1 + "\"");
        System.out.println("s1.isBlank(): " + s1.isBlank());
        assertFalse(s1.isBlank());

        System.out.println("s2: " + s2 + "\"");
        System.out.println("s2.isBlank(): " + s2.isBlank());
        assertTrue(s2.isBlank());

        System.out.println("s3: \"" + s3 + "\"");
        System.out.println("s3.isBlank(): " + s3.isBlank());
        assertTrue(s3.isBlank());

        System.out.println("s4: \"" + s4 + "\"");
        System.out.println("s4.isBlank(): " + s4.isBlank());
        assertTrue(s4.isBlank());

        System.out.println("s5: \"" + s5 + "\"");
        System.out.println("s5.isBlank(): " + s5.isBlank());
        assertFalse(s5.isBlank());
    }

    public static void main(String[] args) {
        
        /*
            equals
            equalsIgnoreCase
            contentEquals
            compareTo
            compareToIgnoreCase
            isEmpty
            isBlank
         */
        StringCompareTests examples = new StringCompareTests();

        examples.runExamples("String ==", examples::objectEqualsExamples);
        examples.runExamples("String equals", examples::valueEqualsExamples);
        examples.runExamples("String equalsIgnoreCase", examples::equalIgnoreCaseExamples);
        examples.runExamples("isEmpty", examples::isEmptyExamples);
        examples.runExamples("isBlank", examples::isBlankExamples);
        examples.runExamples("String contentEquals", examples::contentEqualsExamples);
        examples.runExamples("String compareTo", examples::compareToExamples);
    }
}
