package org.mwatt.tutorial.basics;

import org.mwatt.util.ExampleTestBase;

/**
 * This class demonstrates how to use the System.out object to print text to the console.
 */
public class ConsoleExamples extends ExampleTestBase {

    public void printTextExample() {
        runExample(() -> {
            printExample("""
                         System.out.println("Hello, World!");
                         """);
            System.out.println("Hello, World!");
        });

        runExample(() -> {
            printExample("""
                         System.out.print("Hello, ");
                         System.out.println("World!");
                         """);
            System.out.print("Hello, ");
            System.out.println("World!");

            printExample("""
                         System.out.printf("%s", "Hello, World!");
                         """);
            System.out.printf("%s", "Hello, World!");
        });
    }

    public void printNumberExample() {
        runExample(() -> {
            printExample("""
                         System.out.println(123);
                         System.out.println(4);
                         """);

            System.out.println(123);
            System.out.println(4);
        });

        runExample(() -> {
            printExample("""
                         System.out.printf("%d", 123);
                         System.out.printf("%d", 4);
                         """);

            System.out.print(123);
            System.out.println(4);
        });

        runExample(() -> {
            printExample("""
                         System.out.printf("%d", 123);
                         System.out.printf("%d", 4);
                         """);

            System.out.printf("%d", 123);
            System.out.printf("%d", 4);
        });
    }
    
    public void printCharacterExample() {
        runExample(() -> {
            printExample("""
                         System.out.println('a');
                         System.out.println('b');
                         """);

            System.out.println('a');
            System.out.println('b');
        });
        
        runExample(() -> {
            printExample("""
                         System.out.printf("%c", 'a');
                         System.out.printf("%c", 'b');
                         """);

            System.out.printf("%c", 'a');
            System.out.printf("%c", 'b');
        });
    }
    
    public void printBooleanExample() {
        runExample(() -> {
            printExample("""
                         System.out.println(true);
                         System.out.println(false);
                         """);

            System.out.println(true);
            System.out.println(false);
        });
        
        runExample(() -> {
            printExample("""
                         System.out.printf("%b", true);
                         System.out.printf("%b", false);
                         """);

            System.out.printf("%b", true);
            System.out.printf("%b", false);
        });
    }
    
    public void printFloatExample() {
        runExample(() -> {
            printExample("""
                         System.out.println(1.23f);
                         System.out.println(4.56f);
                         """);

            System.out.println(1.23f);
            System.out.println(4.56f);
        });
        
        runExample(() -> {
            printExample("""
                         System.out.printf("%f", 1.23f);
                         System.out.printf("%f", 4.56f);
                         """);

            System.out.printf("%f", 1.23f);
            System.out.printf("%f", 4.56f);
        });
    }
    
    public void printDoubleExample() {
        runExample(() -> {
            printExample("""
                         System.out.println(1.23);
                         System.out.println(4.56);
                         """);

            System.out.println(1.23);
            System.out.println(4.56);
        });
        
        runExample(() -> {
            printExample("""
                         System.out.printf("%f", 1.23);
                         System.out.printf("%f", 4.56);
                         """);

            System.out.printf("%f", 1.23);
            System.out.printf("%f", 4.56);
        });
    }
    
    public void printLongExample() {
        runExample(() -> {
            printExample("""
                         System.out.println(123L);
                         System.out.println(456L);
                         """);

            System.out.println(123L);
            System.out.println(456L);
        });
        
        runExample(() -> {
            printExample("""
                         System.out.printf("%d", 123L);
                         System.out.printf("%d", 456L);
                         """);

            System.out.printf("%d", 123L);
            System.out.printf("%d", 456L);
        });
    }
    
    public void printByteExample() {
        runExample(() -> {
            printExample("""
                         System.out.println((byte) 123);
                         System.out.println((byte) 4);
                         """);

            System.out.println((byte) 123);
            System.out.println((byte) 4);
        });
        
        runExample(() -> {
            printExample("""
                         System.out.printf("%d", (byte) 123);
                         System.out.printf("%d", (byte) 4);
                         """);

            System.out.printf("%d", (byte) 123);
            System.out.printf("%d", (byte) 4);
        });
    }
    
    public void printShortExample() {
        runExample(() -> {
            printExample("""
                         System.out.println((short) 123);
                         System.out.println((short) 4);
                         """);

            System.out.println((short) 123);
            System.out.println((short) 4);
        });
        
        runExample(() -> {
            printExample("""
                        System.out.printf("%d", (short) 123);
                        System.out.printf("%d", (short) 4);
                        """);

            System.out.printf("%d", (short) 123);
            System.out.printf("%d", (short) 4);
        });
    }
    
    public void printSpecialCharacterExample() {
        runExample(() -> {
            printExample("""
                         System.out.println("\\n");
                         System.out.println("\\t");
                         """);

            System.out.println("\n");
            System.out.println("\t");
        });
        
        runExample(() -> {
            printExample("""
                         System.out.printf("%s", "\\n");
                         System.out.printf("%s", "\\t");
                         """);

            System.out.printf("%s", "\n");
            System.out.printf("%s", "\t");
        });
    }

    public static void main(String[] args) {
        ConsoleExamples console = new ConsoleExamples();

        console.runExamples("Text Examples", console::printTextExample);
        console.runExamples("Number Examples", console::printNumberExample);
        console.runExamples("Character Examples", console::printCharacterExample);
        console.runExamples("Special Character Examples", console::printSpecialCharacterExample);
        console.runExamples("Boolean Examples", console::printBooleanExample);
        console.runExamples("Float Examples", console::printFloatExample);
        console.runExamples("Double Examples", console::printDoubleExample);
        console.runExamples("Long Examples", console::printLongExample);
        console.runExamples("Byte Examples", console::printByteExample);
        console.runExamples("Short Examples", console::printShortExample);
    }

}

