 package org.mwatt.tutorial.basics;

import org.mwatt.util.ExampleBase;

public class StringBuilderAndStringBufferExamples extends ExampleBase {
    public void xExample() {
        runExample(() -> {
        });
    }

    public static void main(String[] args) {
        StringBuilderAndStringBufferExamples examples = new StringBuilderAndStringBufferExamples();

        examples.runExamples("Example", examples::xExample);
    }
}
