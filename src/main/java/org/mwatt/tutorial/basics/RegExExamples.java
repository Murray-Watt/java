package org.mwatt.tutorial.basics;

import org.mwatt.util.ExampleBase;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExExamples extends ExampleBase {
    public void regExBaseExample() {
        runExample(() -> {
            exampleLine("String str1 = \"HHHHHHHHH!\";");
            exampleLine("String pattern = \"H*!\";");
            exampleLine("Pattern pc = Pattern.compile(pattern);");
            exampleLine("Matcher match = pc.matcher(str1);");

            String str1 = "HHHHHHHHH!";
            String pattern = "H*!";
            Pattern pc = Pattern.compile(pattern);
            Matcher match = pc.matcher(str1);
            if (match.matches()) {
                System.out.println(match.group());
            }
        });
    }

    public void regExCharacterExamples() {
        //octal
        //hex
        //unicode
        runExample(() ->
        {
            String str1 = "aaaaaaa";
            String pattern1 = "a*";
            Pattern pc1 = Pattern.compile(pattern1);
            Matcher match1 = pc1.matcher(str1);
            if (match1.matches()) {
                System.out.println(match1.group());
            }

            //octal
            String str2 = "\141\141\141\141\141\141\141";
            String pattern2 = "\141*";
            Pattern pc2 = Pattern.compile(pattern2);
            Matcher match2 = pc2.matcher(str2);
            if (match2.matches()) {
                System.out.println(match2.group());
            }

            //hex
            //unicode
        });
    }

    /*
    \\R
     */

    /*
    appendReplacement
appendTail
replaceAll
replaceFirst
results
     */
    public static void main(String[] args) {
        RegExExamples examples = new RegExExamples();

        examples.runExamples("RegEx Base Example", examples::regExBaseExample);
        examples.runExamples("RegEx Character Examples", examples::regExCharacterExamples);
    }
}
