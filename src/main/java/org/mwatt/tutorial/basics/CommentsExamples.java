package org.mwatt.tutorial.basics;

import org.mwatt.util.ExampleBase;

/**
 * Examples of comments in Java.
 */
public class CommentsExamples extends ExampleBase {
    public void commentsExamples() {
        runExample(() -> {
            exampleLine("// This is a single line comment");
        });

        runExample(() -> {
            exampleLine("/* This is a multi-line comment");
            exampleLine("   that spans multiple lines */");
        });

        runExample(() -> {
            exampleLine("/** This is a Javadoc comment");
            exampleLine("    that can be used to document");
            exampleLine("    classes, methods, and fields */");
        });

        runExample(() -> {
            exampleLine("/**");
            exampleLine(" * This is a Javadoc comment");
            exampleLine(" * that can be used to document");
            exampleLine(" * classes, methods, and fields");
            exampleLine(" *");
            exampleLine(" * @param <K> the type of keys maintained by this cache");
            exampleLine(" * @param <V> the type of mapped values");
            exampleLine(" */");
        });
    }


    public static void main(String[] args) {
        CommentsExamples example = new CommentsExamples();
        example.runExamples("Comments Examples", example::commentsExamples);
    }

}
