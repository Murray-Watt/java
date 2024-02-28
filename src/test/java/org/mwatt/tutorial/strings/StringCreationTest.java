package org.mwatt.tutorial.strings;

import org.junit.jupiter.api.Test;
import org.mwatt.util.ExampleTestBase;

import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

public class StringCreationTest extends ExampleTestBase {

    @Test
    public void createExamples() {
        String string1 = "Hello";
        System.out.println("string1: " + string1);

        byte[] bytes = {'H', 'e', 'l', 'l', 'o'};
        String string2 = new String(bytes);
        System.out.println("string2: " + string2);
        assertEquals(string1, string2);

        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        String string3 = new String(chars);
        System.out.println("string3: " + string3);
        assertEquals(string1, string3);

        StringBuilder sb = new StringBuilder("Hello");
        String string4 = new String(sb);
        System.out.println("string4: " + string4);
        assertEquals(string1, string4);

        StringBuffer sbf = new StringBuffer("Hello");
        String string5 = new String(sbf);
        System.out.println("string5: " + string5);
        assertEquals(string1, string5);

        String string6 = "He" + 'l' + "lo";
        System.out.println("string6: " + string6);
        assertEquals(string1, string6);


        byte[] bytesHelloWorld = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', '!'};

        // Third parameter is the length of bytes to use
        String string7 =new String(bytesHelloWorld, 0, 5);
        System.out.println("string7: " + string7);
        assertEquals(string1, string7);

        String string8 = new String(bytesHelloWorld, 0, 5, StandardCharsets.UTF_8);
        System.out.println("string8: " + string8);
        assertEquals(string1, string8);

        String string9 = new String(bytesHelloWorld, 0, 5, StandardCharsets.ISO_8859_1);
        System.out.println("string9: " + string9);
        assertEquals(string1, string9);

        // There is no single parameter constructor for String that takes an int array
        String string10 = new String(new int[] {72, 101, 108, 108, 111}, 0, 5);
        System.out.println("string10: " + string10);
        assertEquals(string1, string10);
    }

    @Test
    public void charAtExamples() {
        String s = "Hello, World!";
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(7));
        System.out.println(s.charAt(12));
    }

    @Test
    public void basicFormatExample() {
        String s1 = "Hello, World!";
        System.out.println("s.format(\"Hello, %s!\", \"World\"): " + s1.format("Hello, %s!", "World"));

        String s2 = "Hello, World!";
        System.out.println("s.format(\"Hello, %s!\", \"World\"): " + s2.format("Hello, %s!", "World"));
    }

    @Test
    public void getBytesExamples() {
        String s = "Hello, World!";
        System.out.println("s.getBytes(): " + s.getBytes());
    }

    @Test
    public void getCharsExamples() {
        String s = "Hello, World!";
        char[] c = new char[5];
        s.getChars(0, 5, c, 0);
        System.out.println(c);
    }

    @Test
    public void internExamples() {
        String string1 = "Hello, World!";
        String string2 = new String("Hello, World!");
        String string3 = string2.intern();
        System.out.println("string1: " + string1 + "interned");
        System.out.println("string2: " + string2 + "not interned");
        System.out.println("string3: " + string3 + "interned");
        System.out.println("string1 == string2: " + (string1 == string2));
        System.out.println("string1 == string3: " + (string1 == string3));
        assertFalse(string1 == string2);
        assertTrue(string1 == string3);
    }

    public static void main(String[] args) {
        StringCreationTest examples = new StringCreationTest();

        examples.runExamples("Create String", examples::createExamples);
        examples.runExamples("String charAt", examples::charAtExamples);
        examples.runExamples("String format", examples::basicFormatExample);
        examples.runExamples("String getBytes", examples::getBytesExamples);
        examples.runExamples("String getChars", examples::getCharsExamples);
        examples.runExamples("String intern", examples::internExamples);
    }
}
