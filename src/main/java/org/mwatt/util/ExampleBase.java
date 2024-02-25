package org.mwatt.util;

import org.mwatt.tutorial.basics.ConsoleExamples;

public class ExampleBase {
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
        nextExample();
    }

    private void nextExample() {
        System.out.println();
        System.out.print("Press Enter to continue...");
        try {
            int key = System.in.read();

            while (key != 10 && key != 13) {
                key = System.in.read();
            }
        } catch (Exception ignored) {
        }
    }

    public void exampleLine(String line) {
        System.out.println('>' + line);
    }

    public void runExamples(String title, Example examples) {
        ConsoleExamples.printHeader(title);
        examples.run();
        ConsoleExamples.printFooter();
    }
}
