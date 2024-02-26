package org.mwatt.tutorial.basics;

import org.mwatt.util.ExampleTestBase;

 /**
     This is a Javadoc comment
     that can be used to document
     classes, methods, and fields
 */
public class CommentsExamplesTest extends ExampleTestBase {
    public void commentsExamples() {
        // This is a single line comment")

        /* This is a multi-line comment
           that spans multiple lines */
    }


     /**
      * This is a Javadoc comment
      * that can be used to document
      * classes, methods, and fields
      *
      * @param args the command-line arguments
      */
    public static void main(String[] args) {
        CommentsExamplesTest example = new CommentsExamplesTest();
        example.runExamples("Comments Examples", example::commentsExamples);
    }

}
