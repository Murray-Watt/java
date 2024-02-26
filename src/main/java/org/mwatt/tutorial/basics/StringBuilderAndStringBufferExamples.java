package org.mwatt.tutorial.basics;

import org.mwatt.util.ExampleBase;

public class StringBuilderAndStringBufferExamples extends ExampleBase {
    public void stringBuffer() {
        runExample(() -> {
            printExample("""
                    StringBuffer buffer = new StringBuffer("Hello")
                    buffer.append(" World")
                    System.out.println(buffer.toString())
                    """);

            StringBuffer buffer = new StringBuffer("Hello");
            buffer.append(" World");
            System.out.println(buffer);
        });

        runExample(() -> {
            printExample("""
                    StringBuffer buffer = new StringBuffer("Hello")
                    buffer.reverse()
                    System.out.println(buffer.toString())
                    """);

            StringBuffer buffer = new StringBuffer("Hello");
            buffer.reverse();
            System.out.println(buffer);
        });

        runExample(() -> {
            printExample("""
                    StringBuffer buffer = new StringBuffer("Hello")
                    buffer.insert(0, "World ")
                    System.out.println(buffer.toString())
                    """);

            StringBuffer buffer = new StringBuffer("Hello");
            buffer.insert(0, "World ");
            System.out.println(buffer);
        });

        runExample(() -> {
            printExample("""
                    StringBuffer buffer = new StringBuffer("Hello")
                    buffer.delete(0, 2)
                    System.out.println(buffer.toString())
                    """);

            StringBuffer buffer = new StringBuffer("Hello");
            buffer.delete(0, 2);
            System.out.println(buffer);
        });
    }

    public void stringBuilder() {
        runExample(()-> {
            printExample("""
                    StringBuilder builder = new StringBuilder("Hello")
                    builder.append(" World")
                    System.out.println(builder.toString())
                    """);

            StringBuilder builder = new StringBuilder("Hello");
            builder.append(" World");
            System.out.println(builder);
        });

        runExample(()-> {
            printExample("""
                    StringBuilder builder = new StringBuilder("Hello")
                    builder.reverse()
                    System.out.println(builder.toString())
                    """);

            StringBuilder builder = new StringBuilder("Hello");
            builder.reverse();
            System.out.println(builder);
        });

        runExample(()-> {
            printExample("""
                    StringBuilder builder = new StringBuilder("Hello")
                    builder.insert(0, "World ")
                    System.out.println(builder.toString())
                    """);

            StringBuilder builder = new StringBuilder("Hello");
            builder.insert(0, "World ");
            System.out.println(builder);
        });

        runExample(()-> {
            printExample("""
                    StringBuilder builder = new StringBuilder("Hello")
                    builder.delete(0, 2)
                    System.out.println(builder.toString())
                    """);

            StringBuilder builder = new StringBuilder("Hello");
            builder.delete(0, 2);
            System.out.println(builder);
        });
    }

    public static void main(String[] args) {
        StringBuilderAndStringBufferExamples examples = new StringBuilderAndStringBufferExamples();

        examples.runExamples("String Buffer", examples::stringBuffer);
        examples.runExamples("String Builder", examples::stringBuilder);
    }
}
