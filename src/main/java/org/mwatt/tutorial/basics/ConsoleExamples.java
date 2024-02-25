package org.mwatt.tutorial.basics;

import org.mwatt.util.ExampleBase;

/**
 * This class demonstrates how to use the System.out object to print text to the console.
 */
public class ConsoleExamples extends ExampleBase {

    public void printTextExample() {
        runExample(() -> {
            exampleLine("System.out.println(\"Hello, World!\");");
            System.out.println("Hello, World!");
        });

        runExample(() -> {
            exampleLine("System.out.println(\"Hello, \");");
            exampleLine("System.out.println(World!);");
            System.out.print("Hello, ");
            System.out.println("World!");

            System.out.println("System.out.printf(\"%s\", \"Hello, World!\");");
            System.out.printf("%s", "Hello, World!");
        });
    }

    public void printNumberExample() {
        runExample(() -> {
            exampleLine("System.out.println(123);");
            exampleLine("System.out.println(4);");

            System.out.println(123);
            System.out.println(4);
        });

        runExample(() -> {
            exampleLine("System.out.print(123);");
            exampleLine("System.out.println(4);");

            System.out.print(123);
            System.out.println(4);
        });

        runExample(() -> {
            exampleLine("System.out.print(\"%d\", 123);");
            exampleLine("System.out.println(\"%d%s\", 4);");
            System.out.printf("%d", 123);

            System.out.printf("%d", 4);
        });
    }
    
    public void printCharacterExample() {
        runExample(() -> {
            exampleLine("System.out.println('a');");
            exampleLine("System.out.println('b');");
            System.out.println('a');
            System.out.println('b');
        });
        
        runExample(() -> {
            exampleLine("System.out.printf(\"%c\", 'a');");
            exampleLine("System.out.printf(\"%c\", 'b');");
            System.out.printf("%c", 'a');
            System.out.printf("%c", 'b');
        });
    }
    
    public void printBooleanExample() {
        runExample(() -> {
            exampleLine("System.out.println(true);");
            exampleLine("System.out.println(false);");
            System.out.println(true);
            System.out.println(false);
        });
        
        runExample(() -> {
            exampleLine("System.out.printf(\"%b\", true);");
            exampleLine("System.out.printf(\"%b\", false);");
            System.out.printf("%b", true);
            System.out.printf("%b", false);
        });
    }
    
    public void printFloatExample() {
        runExample(() -> {
            exampleLine("System.out.println(1.23f);");
            exampleLine("System.out.println(4.56f);");
            System.out.println(1.23f);
            System.out.println(4.56f);
        });
        
        runExample(() -> {
            exampleLine("System.out.printf(\"%f\", 1.23f);");
            exampleLine("System.out.printf(\"%f\", 4.56f);");
            System.out.printf("%f", 1.23f);
            System.out.printf("%f", 4.56f);
        });
    }
    
    public void printDoubleExample() {
        runExample(() -> {
            exampleLine("System.out.println(1.23);");
            exampleLine("System.out.println(4.56);");
            System.out.println(1.23);
            System.out.println(4.56);
        });
        
        runExample(() -> {
            exampleLine("System.out.printf(\"%f\", 1.23);");
            exampleLine("System.out.printf(\"%f\", 4.56);");
            System.out.printf("%f", 1.23);
            System.out.printf("%f", 4.56);
        });
    }
    
    public void printLongExample() {
        runExample(() -> {
            exampleLine("System.out.println(123L);");
            exampleLine("System.out.println(456L);");
            System.out.println(123L);
            System.out.println(456L);
        });
        
        runExample(() -> {
            exampleLine("System.out.printf(\"%d\", 123L);");
            exampleLine("System.out.printf(\"%d\", 456L);");
            System.out.printf("%d", 123L);
            System.out.printf("%d", 456L);
        });
    }
    
    public void printByteExample() {
        runExample(() -> {
            exampleLine("System.out.println((byte) 123);");
            exampleLine("System.out.println((byte) 4);");
            System.out.println((byte) 123);
            System.out.println((byte) 4);
        });
        
        runExample(() -> {
            exampleLine("System.out.printf(\"%d\", (byte) 123);");
            exampleLine("System.out.printf(\"%d\", (byte) 4);");
            System.out.printf("%d", (byte) 123);
            System.out.printf("%d", (byte) 4);
        });
    }
    
    public void printShortExample() {
        runExample(() -> {
            exampleLine("System.out.println((short) 123);");
            exampleLine("System.out.println((short) 4);");
            System.out.println((short) 123);
            System.out.println((short) 4);
        });
        
        runExample(() -> {
            exampleLine("System.out.printf(\"%d\", (short) 123);");
            exampleLine("System.out.printf(\"%d\", (short) 4);");
            System.out.printf("%d", (short) 123);
            System.out.printf("%d", (short) 4);
        });
    }
    
    public void printSpecialCharacterExample() {
        runExample(() -> {
            exampleLine("System.out.println(\"\\n\");");
            exampleLine("System.out.println(\"\\t\");");
            System.out.println("\n");
            System.out.println("\t");
        });
        
        runExample(() -> {
            exampleLine("System.out.printf(\"%s\", \"\\n\");");
            exampleLine("System.out.printf(\"%s\", \"\\t\");");
            System.out.printf("%s", "\n");
            System.out.printf("%s", "\t");
        });
    }

    public static void main(String[] args) {
        ConsoleExamples console = new ConsoleExamples();

        console.runExamples("Text Examples", console::printTextExample);
        console.runExamples("Number Examples", console::printNumberExample);
        console.runExamples("Character Examples", console::printCharacterExample);
        console.runExamples("Boolean Examples", console::printBooleanExample);
        console.runExamples("Float Examples", console::printFloatExample);
        console.runExamples("Double Examples", console::printDoubleExample);
        console.runExamples("Long Examples", console::printLongExample);
        console.runExamples("Byte Examples", console::printByteExample);
        console.runExamples("Short Examples", console::printShortExample);
    }

}

