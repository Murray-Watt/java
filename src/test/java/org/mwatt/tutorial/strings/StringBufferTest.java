package org.mwatt.tutorial.strings;

import org.junit.jupiter.api.Test;

// Thread safe
public class StringBufferTest {

    @Test
    public void basicStringBufferExamples() {

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
}
