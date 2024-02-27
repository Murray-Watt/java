package org.mwatt.tutorial.basics;

import org.junit.jupiter.api.Test;
import org.mwatt.util.ExampleTestBase;

public class StringBuilderAndStringBufferTest extends ExampleTestBase {

    @Test
    public void stringBuffer() {

        StringBuffer buffer1 = new StringBuffer("Hello");
        buffer1.append(" World");
        System.out.println(buffer1);

        StringBuffer bufferw = new StringBuffer("Hello");
        bufferw.reverse();
        System.out.println(bufferw);

        StringBuffer buffer4 = new StringBuffer("Hello");
        buffer4.insert(0, "World ");
        System.out.println(buffer4);

        StringBuffer buffer5 = new StringBuffer("Hello");
        buffer5.delete(0, 2);
        System.out.println(buffer5);
    }

    @Test
    public void stringBuilder() {

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

    public static void main(String[] args) {
        StringBuilderAndStringBufferTest examples = new StringBuilderAndStringBufferTest();

        examples.runExamples("String Buffer", examples::stringBuffer);
        examples.runExamples("String Builder", examples::stringBuilder);
    }
}
