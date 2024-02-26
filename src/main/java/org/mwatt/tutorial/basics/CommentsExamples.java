package org.mwatt.tutorial.basics;

import org.mwatt.util.ExampleBase;

/**
 * Examples of comments in Java.
 */
public class CommentsExamples extends ExampleBase {
    public void commentsExamples() {
        runExample(() -> {
            printExample("// This is a single line comment");
        });

        runExample(() -> {
            printExample("""
                    /* This is a multi-line comment
                       that spans multiple lines */
                    """);
        });

        runExample(() -> {
            printExample("""
                    /**
                      This is a Javadoc comment
                      that can be used to document
                      classes, methods, and fields
                     */
                    """);
        });

        runExample(() -> {
            printExample("""
                    /**
                     * This is a Javadoc comment
                     * that can be used to document
                     * classes, methods, and fields
                     *
                     * @param <K> the type of keys maintained by this cache
                     * @param <V> the type of mapped values
                     */
                    """);
        });
    }


    public static void main(String[] args) {
        CommentsExamples example = new CommentsExamples();
        example.runExamples("Comments Examples", example::commentsExamples);
    }

}
