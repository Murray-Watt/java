package org.mwatt.tutorial.basics;

import org.mwatt.util.ExampleBase;

/*
    String - stores text, such as "Hello". String values are surrounded by double quotes
    int - stores integers (whole numbers), without decimals, such as 123 or -123
    float - stores floating point numbers, with decimals, such as 19.99 or -19.99
    char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
    boolean - stores values with two states: true or false
 */

/*
Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte

Note: You will get an error if you try to convert a larger type to a smaller type:
 */
public class VariablesExamples extends ExampleBase {
    public void variablesExamples() {
        runExample(() -> {
            printExample("""
                    String name = "John";
                    System.out.println(name);
                    """);

            String name = "John";
            System.out.println(name);
        });

        runExample(() -> {
            printExample("""
                    int myNum = 15;
                    System.out.println(myNum);
                    """);

            int myNum = 15;
            System.out.println(myNum);
        });

        runExample(() -> {
            printExample("""
                    float myFloatNum = 5.99f;
                    System.out.println(myFloatNum);
                    """);

            float myFloatNum = 5.99f;
            System.out.println(myFloatNum);
        });

        runExample(() -> {
            printExample("""
                    char myLetter = 'D';
                    System.out.println(myLetter);
                    """);

            char myLetter = 'D';
            System.out.println(myLetter);
        });

        runExample(() -> {
            printExample("""
                    boolean myBool = true;
                    System.out.println(myBool);
                    """);

            boolean myBool = true;
            System.out.println(myBool);
        });
    }

    public static void main(String[] args) {
        VariablesExamples examples = new VariablesExamples();
        examples.runExamples("Variables Example", examples::variablesExamples);
    }
}
