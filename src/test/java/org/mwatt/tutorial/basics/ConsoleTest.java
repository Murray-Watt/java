package org.mwatt.tutorial.basics;

import org.junit.jupiter.api.Test;
import org.mwatt.util.ExampleTestBase;

/**
 * This class demonstrates how to use the System.out object to print text to the console.
 */
public class ConsoleTest extends ExampleTestBase {

    @Test
    public void printTextExample() {
        System.out.println("Hello, World!");

        System.out.print("Hello, ");
        System.out.println("World!");

        System.out.printf("%s", "Hello, World!");
    }

    @Test
    public void printNumberExample() {
        System.out.println(123);
        System.out.println(4);

        System.out.print(123);
        System.out.println(4);

        System.out.printf("%d", 123);
        System.out.printf("%d", 4);
    }

    @Test
    public void printCharacterExample() {
        System.out.println('a');
        System.out.println('b');

        System.out.printf("%c", 'a');
        System.out.printf("%c", 'b');
    }

    @Test
    public void printBooleanExample() {
        System.out.println(true);
        System.out.println(false);

        System.out.printf("%b", true);
        System.out.printf("%b", false);
    }

    @Test
    public void printFloatExample() {
        System.out.println(1.23f);
        System.out.println(4.56f);

        System.out.printf("%f", 1.23f);
        System.out.printf("%f", 4.56f);
    }

    @Test
    public void printDoubleExample() {

        System.out.println(1.23);
        System.out.println(4.56);


        System.out.printf("%f", 1.23);
        System.out.printf("%f", 4.56);
    }

    @Test
    public void printLongExample() {
        System.out.println(123L);
        System.out.println(456L);
        System.out.printf("%d", 123L);
        System.out.printf("%d", 456L);
    }

    @Test
    public void printByteExample() {
        System.out.println((byte) 123);
        System.out.println((byte) 4);
        System.out.printf("%d", (byte) 123);
        System.out.printf("%d", (byte) 4);
    }

    @Test
    public void printShortExample() {
        System.out.println((short) 123);
        System.out.println((short) 4);
        System.out.printf("%d", (short) 123);
        System.out.printf("%d", (short) 4);
    }

    @Test
    public void printSpecialCharacterExample() {
        System.out.println("\n");
        System.out.println("\t");
        System.out.printf("%s", "\n");
        System.out.printf("%s", "\t");
    }

    public static void main(String[] args) {
        ConsoleTest console = new ConsoleTest();

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

