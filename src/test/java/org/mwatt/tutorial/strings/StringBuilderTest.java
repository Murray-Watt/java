package org.mwatt.tutorial.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings({"StringBufferReplaceableByString", "UnnecessaryToStringCall"})
public class StringBuilderTest {

    @Test
    public void stringBuilderConstructorExamples() {
        StringBuilder builder1 = new StringBuilder();
        System.out.println(builder1);
        assertEquals(0, builder1.length());
        assertEquals(16, builder1.capacity());

        StringBuilder builder2 = new StringBuilder("Hello");
        System.out.println(builder2);
        assertEquals(5, builder2.length());
        assertEquals(21, builder2.capacity());

        StringBuilder builder3 = new StringBuilder(10);
        System.out.println(builder3);
        assertEquals(0, builder3.length());
        assertEquals(10, builder3.capacity());

        StringBuilder builder4 = new StringBuilder(builder2);
        System.out.println(builder4);
        assertEquals(5, builder4.length());
        assertEquals(21, builder4.capacity());
    }

    @Test
    public void appendExamples() {
        StringBuilder builder1 = new StringBuilder("Hello");
        builder1.append(" World");
        System.out.println(builder1);
        assertEquals("Hello World", builder1.toString());

        StringBuilder builder2 = new StringBuilder("Hello");
        builder2.append(" World", 1, 3);
        System.out.println(builder2);
        assertEquals("Hello Wo", builder2.toString());

        StringBuilder builder3 = new StringBuilder("Hello");
        builder3.append(" World".toCharArray());
        System.out.println(builder3);
        assertEquals("Hello World", builder3.toString());

        StringBuilder builder4 = new StringBuilder("Hello");
        builder4.append(" World".toCharArray(), 1, 3);
        System.out.println(builder4);
        assertEquals("Hello Wo", builder4.toString());

        StringBuilder builder5 = new StringBuilder("Hello");
        builder5.append(true);
        System.out.println(builder5);
        assertEquals("Hellotrue", builder5.toString());

        StringBuilder builder6 = new StringBuilder("Hello");
        builder6.append(' ');
        System.out.println(builder6);
        assertEquals("Hello ", builder6.toString());

        StringBuilder builder7 = new StringBuilder("Hello");
        builder7.append(123);
        System.out.println(builder7);
        assertEquals("Hello123", builder7.toString());

        StringBuilder builder8 = new StringBuilder("Hello");
        builder8.append(123L);
        System.out.println(builder8);
        assertEquals("Hello123", builder8.toString());

        StringBuilder builder9 = new StringBuilder("Hello");
        builder9.append(123.45f);
        System.out.println(builder9);
        assertEquals("Hello123.45", builder9.toString());

        StringBuilder builder10 = new StringBuilder("Hello");
        builder10.append(123.45);
        System.out.println(builder10);
        assertEquals("Hello123.45", builder10.toString());

        StringBuilder builder11 = new StringBuilder("Hello");
        builder11.append(new Object());
        System.out.println(builder11);
        assertEquals("Hellojava.lang.Object@1", builder11.toString());
    }

    @Test
    public void compareExamples() {
        StringBuilder builder1 = new StringBuilder("Hello");
        StringBuilder builder2 = new StringBuilder("Hello");
        assertEquals(0, builder1.compareTo(builder2));

        StringBuilder builder3 = new StringBuilder("Hello");
        StringBuilder builder4 = new StringBuilder("World");
        assertEquals(-15, builder3.compareTo(builder4));
    }

    @Test
    public void insertExamples() {
        StringBuilder builder1 = new StringBuilder("Hello");
        builder1.insert(0, "World ");
        System.out.println(builder1);
        assertEquals("World Hello", builder1.toString());

        StringBuilder builder2 = new StringBuilder("Hello");
        builder2.insert(0, true);
        System.out.println(builder2);
        assertEquals("trueHello", builder2.toString());

        StringBuilder builder3 = new StringBuilder("Hello");
        builder3.insert(0, ' ');
        System.out.println(builder3);
        assertEquals(" Hello", builder3.toString());

        StringBuilder builder4 = new StringBuilder("Hello");
        builder4.insert(0, 123);
        System.out.println(builder4);
        assertEquals("123Hello", builder4.toString());

        StringBuilder builder5 = new StringBuilder("Hello");
        builder5.insert(0, 123L);
        System.out.println(builder5);
        assertEquals("123Hello", builder5.toString());

        StringBuilder builder6 = new StringBuilder("Hello");
        builder6.insert(0, 123.45f);
        System.out.println(builder6);
        assertEquals("123.45Hello", builder6.toString());

        StringBuilder builder7 = new StringBuilder("Hello");
        builder7.insert(0, 123.45);
        System.out.println(builder7);
        assertEquals("123.45Hello", builder7.toString());

        StringBuilder builder8 = new StringBuilder("Hello");
        builder8.insert(0, new Object());
        System.out.println(builder8);
        assertEquals("java.lang.Object@1Hello", builder8.toString());
    }

    @Test void deleteCharacterAtExamples() {
        StringBuilder builder1 = new StringBuilder("Hello");
        builder1.deleteCharAt(2);
        System.out.println(builder1);
        assertEquals("Hllo", builder1.toString());
    }

    @Test
    public void deleteExamples() {
        StringBuilder builder1 = new StringBuilder("Hello");
        builder1.delete(0, 3);
        System.out.println(builder1);
        assertEquals("lo", builder1.toString());
    }

    @Test
    public void replaceExamples() {
        StringBuilder builder1 = new StringBuilder("Hello");
        builder1.replace(0, 3, "World");
        System.out.println(builder1);
        assertEquals("Worldlo", builder1.toString());
    }

    @Test
    public void basicStringBuilder() {

        StringBuilder builder1 = new StringBuilder("Hello");
        builder1.append(" World");
        System.out.println(builder1);

        StringBuilder builder2 = new StringBuilder("Hello");
        builder2.reverse();
        System.out.println(builder2);


        StringBuilder builder3 = new StringBuilder("Hello");
        builder3.insert(0, "World ");
        System.out.println(builder3);

        StringBuilder builder4 = new StringBuilder("Hello");
        builder4.delete(0, 3);
        System.out.println(builder4);
    }

    @Test
    public void indexOfExamples() {
        StringBuilder builder1 = new StringBuilder("Hello");
        System.out.println(builder1.indexOf("l"));
        assertEquals(2, builder1.indexOf("l"));

        StringBuilder builder2 = new StringBuilder("Hello");
        System.out.println(builder2.indexOf("l", 3));
        assertEquals(-1, builder2.indexOf("l", 3));
    }

    @Test
    public void lastIndexOfExamples() {
        StringBuilder builder1 = new StringBuilder("Hello");
        System.out.println(builder1.lastIndexOf("l"));
        assertEquals(3, builder1.lastIndexOf("l"));

        StringBuilder builder2 = new StringBuilder("Hello");
        System.out.println(builder2.lastIndexOf("l", 3));
        assertEquals(3, builder2.lastIndexOf("l", 3));
    }

    @Test
    public void reverseExamples() {
        StringBuilder builder1 = new StringBuilder("Hello");
        builder1.reverse();
        System.out.println(builder1);
        assertEquals("olleH", builder1.toString());
    }

    // Does not return a self reference
    @Test
    public void subStringExamples() {
        StringBuilder builder1 = new StringBuilder("Hello World");
        System.out.println(builder1.substring(0, 5));
        assertEquals("Hello", builder1.substring(0, 5));
    }

    @Test
    public void toStringExamples() {
        StringBuilder builder1 = new StringBuilder("Hello");
        System.out.println(builder1.toString());
        assertEquals("Hello", builder1.toString());
    }

    @Test
    public void trimToSizeExamples() {
        StringBuilder builder1 = new StringBuilder(100);
        builder1.append("Hello");
        builder1.trimToSize();
        System.out.println(builder1);
        assertEquals(5, builder1.capacity());
    }

    @Test
    public void getCharsExamples() {
        StringBuilder builder1 = new StringBuilder("Hello");
        char[] chars = new char[5];
        builder1.getChars(0, 5, chars, 0);
        System.out.println(chars);
        assertEquals("Hello", new String(chars));
    }

    @Test
    public void setLengthExamples() {
        StringBuilder builder1 = new StringBuilder("Hello");
        builder1.setLength(2);
        System.out.println(builder1);
        System.out.println(builder1.length());
        System.out.println(builder1.capacity());
        assertEquals(2, builder1.length());
        assertEquals(21, builder1.capacity());
        assertEquals("He", builder1.toString());
    }

    // replace entire contents of a StringBuilder
    @Test
    public void replaceEntireContentsExamples() {
        StringBuilder builder1 = new StringBuilder("Hello");
        builder1.replace(0, 5, "World");
        System.out.println(builder1);
        assertEquals("World", builder1.toString());
    }
}
