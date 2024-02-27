package org.mwatt.tutorial.variables;

import org.mwatt.util.ExampleTestBase;

/*
    String      stores text, such as "Hello". String values are surrounded by double quotes
    int:        stores integers (whole numbers), without decimals, such as 123 or -123
    float       stores floating point numbers, with decimals, such as 19.99 or -19.99
    char        stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
    boolean     stores values with two states: true or false
 */
public class VariablesTest extends ExampleTestBase {
    public void variablesExamples() {
        {
            String name = "John";
            System.out.println(name);
        }

        {
            int myNum = 15;
            System.out.println(myNum);
        }

        {
            float myFloatNum = 5.99f;
            System.out.println(myFloatNum);
        }

        {
            char myLetter = 'D';
            System.out.println(myLetter);
        }

        {
            boolean myBool = true;
            System.out.println(myBool);
        };
    }

    public static void main(String[] args) {
        VariablesTest examples = new VariablesTest();
        examples.runExamples("Variables Example", examples::variablesExamples);
    }
}
