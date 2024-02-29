package org.mwatt.tutorial.strings;

import org.junit.jupiter.api.Test;

public class TextBlockTest {

    public void textBlockExample() {
        String textBlock = """
            This is a text block
            It can contain multiple lines
            """;
        System.out.println(textBlock);
    }

    //Escaping in text blocks

    //The text block delimiter is three double quotes (""") and the text block ends with three double quotes (""").
    @Test
    public void textBlockEscapingExample() {
        String textBlock = """
            This is a text block
            It can contain multiple lines
            It can also contain "quotes"
            You can escape the delimiter with a backslash like this: \"""
            """;
        System.out.println(textBlock);
    }
}
