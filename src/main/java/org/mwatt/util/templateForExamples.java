package org.mwatt.util;

public class templateForExamples extends ExampleBase {
    public void xExample() {
        runExample(() -> {
        });
    }

    public static void main(String[] args) {
        templateForExamples examples = new templateForExamples();

        examples.runExamples("Example", examples::xExample);
    }
}
