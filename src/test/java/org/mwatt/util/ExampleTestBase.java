package org.mwatt.util;

import org.mwatt.tutorial.basics.ConsoleTest;

public class ExampleTestBase {
    protected static final Integer lineLength = 80;
    protected static final String HR = "*".repeat(lineLength);

    public static void printHeader(String header) {
        System.out.println();
        System.out.println(HR);
        System.out.println(header);
    }

    public static void printFooter() {
        System.out.println();
        System.out.println(HR);
    }

    public void runExample(Example example) {
        System.out.println();
        example.run();
    }

    public void runExamples(String title, Example examples) {
        ConsoleTest.printHeader(title);
        examples.run();
        ConsoleTest.printFooter();
    }
}
