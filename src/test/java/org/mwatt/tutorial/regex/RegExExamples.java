package org.mwatt.tutorial.regex;

import org.mwatt.util.ExampleTestBase;

import java.util.regex.Pattern;

public class RegExExamples extends ExampleTestBase {
    public void regExBaseExample() {
        runExample(() -> {
            String text = "This is a test";
            String pattern = ".*test$";
            boolean matches = Pattern.matches(pattern, text);
            printExample("Pattern matches: " + matches);
        });
    }

    public void regExGroupExamples() {
        runExample(() ->
        {
        });
    }

    public static void main(String[] args) {
        RegExExamples examples = new RegExExamples();

        examples.runExamples("RegEx Base Example", examples::regExBaseExample);
        examples.runExamples("RegEx Character Examples", examples::regExGroupExamples);
    }
}
