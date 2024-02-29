package org.mwatt.tutorial.strings;

import org.mwatt.util.ExampleTestBase;

public class TextBlockTest extends ExampleTestBase {

    public void textBlockExample() {
        String textBlock = """
            This is a text block
            It can contain multiple lines
            """;
        System.out.println(textBlock);
    }

    //Escaping in text blocks

    //The text block delimiter is three double quotes (""") and the text block ends with three double quotes (""").
    public void textBlockEscapingExample() {
        String textBlock = """
            This is a text block
            It can contain multiple lines
            It can also contain "quotes"
            You can escape the delimiter with a backslash like this: \"""
            """;
        System.out.println(textBlock);
    }
    public static void main(String[] args) {
        TextBlockTest examples = new TextBlockTest();

        examples.runExamples("Text Block Examples", examples::textBlockExample);
    }
}
