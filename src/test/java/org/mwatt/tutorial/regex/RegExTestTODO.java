package org.mwatt.tutorial.regex;

import org.junit.jupiter.api.Test;
import org.mwatt.util.ExampleTestBase;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegExTestTODO extends ExampleTestBase {
    @Test
    public void regExBaseExample() {
    }

    public void regExGroupExamples() {
    }

    public void regExUsefulRegExes() {
    }

    public static void main(String[] args) {
        RegExTestTODO examples = new RegExTestTODO();

        examples.runExamples("RegEx Base Example", examples::regExBaseExample);
        examples.runExamples("RegEx Character Examples", examples::regExGroupExamples);
    }
}
