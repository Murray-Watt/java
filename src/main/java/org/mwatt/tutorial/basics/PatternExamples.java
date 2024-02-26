package org.mwatt.tutorial.basics;

import org.mwatt.util.ExampleBase;

import java.util.regex.Pattern;

public class PatternExamples extends ExampleBase {
    public void basePatternExamples() {
        runExample(() -> {
            exampleLine("String str1 = \"HHHHHHHHH!\";");
            exampleLine("String pattern = \"H*!\";");
            exampleLine("Pattern pc = Pattern.compile(pattern);");
            exampleLine("Matcher match = pc.matcher(str1);");
            exampleLine("");

            String str1 = "HHHHHHHHH!";
            String pattern = "H*!";
            boolean matches = Pattern.matches(pattern, str1);
            System.out.println(matches);

            exampleLine("String str2 = \"GHHHHHHHH!\";");
            exampleLine("String pattern2 = \"H*!\";");
            exampleLine("boolean matches2 = Pattern.matches(pattern2, str2);");
            exampleLine("System.out.println(matches2);");
            String str2 = "GHHHHHHHH!";
            String pattern2 = "H*!";
            boolean matches2 = Pattern.matches(pattern2, str2);
            System.out.println(matches2);
        });
    }

    public void characterPatternsExamples() {
        runExample(() ->
        {
            exampleLine("String str1 = \"aaaa\";");
            exampleLine("String pattern1 = \"aaaa\";");
            exampleLine("boolean matches1 = Pattern.matches(pattern1, str1);");
            exampleLine("System.out.println(matches1);");
            String str1 = "aaaa";
            String pattern1 = "aaaa";
            boolean matches1 = Pattern.matches(pattern1, str1);
            System.out.println(matches1);

            exampleLine("String str2 = \"aaaa\";");
            exampleLine("String pattern2 = \"a+\";");
            exampleLine("boolean matches2 = Pattern.matches(pattern2, str2);");
            exampleLine("System.out.println(matches2);");
            String str2 = "aaaa";
            String pattern2 = "a+";
            boolean matches2 = Pattern.matches(pattern2, str2);
            System.out.println(matches2);

            exampleLine("String str3 = \"aaaaaaa\";");
            exampleLine("String pattern3 = \"a*\";");
            exampleLine("boolean matches3 = Pattern.matches(pattern3, str3);");
            exampleLine("System.out.println(matches3);");
            String str3 = "aaaaaaa";
            String pattern3 = "a*";
            boolean matches3 = Pattern.matches(pattern3, str3);
            System.out.println(matches3);

            exampleLine("String str4 = \"\";");
            exampleLine("String pattern4 = \"a*\";");
            exampleLine("boolean matches4 = Pattern.matches(pattern4, str4);");
            exampleLine("System.out.println(matches4);");
            String str4 = "";
            String pattern4 = "a*";
            boolean matches4 = Pattern.matches(pattern4, str4);
            System.out.println(matches4);

            exampleLine("String str5 = \"aaaaaa\";");
            exampleLine("String pattern5 = \"\\0141+\";");
            exampleLine("boolean matches5 = Pattern.matches(pattern5, str5);");
            exampleLine("System.out.println(matches5);");
            String str5 = "aaaaaa";
            String pattern5 = "\\0141+";
            boolean matches5 = Pattern.matches(pattern5, str5);
            System.out.println(matches5);

            //hex
            exampleLine("String str6 = \"aaaaaa\";");
            exampleLine("String pattern6 = \"\\x61*\";");
            exampleLine("boolean matches6 = Pattern.matches(pattern6, str6);");
            exampleLine("System.out.println(matches6);");
            String str6 = "aaaaaa";
            String pattern6 = "\\x61*";
            boolean matches6 = Pattern.matches(pattern6, str6);
            System.out.println(matches6);

            //unicode
            exampleLine("String str7 = \"aaaaaa\";");
            exampleLine("String pattern7 = \"\\u0061*\";");
            exampleLine("boolean matches7 = Pattern.matches(pattern7, str7);");
            exampleLine("System.out.println(matches7);");
            String str7 = "aaaaaa";
            String pattern7 = "\\u0061*";
            boolean matches7 = Pattern.matches(pattern7, str7);
            System.out.println(matches7);
        });
    }

    public void characterClassPatternsExamples() {
        runExample(() ->
        {
            exampleLine("String str1 = \"a\";");
            exampleLine("String pattern1 = \"[abc]\";");
            exampleLine("boolean matches1 = Pattern.matches(pattern1, str1);");
            exampleLine("System.out.println(matches1);");
            String str1 = "a";
            String pattern1 = "[abc]";
            boolean matches1 = Pattern.matches(pattern1, str1);
            System.out.println(matches1);

            exampleLine("String str2 = \"b\";");
            exampleLine("String pattern2 = \"[abc]\";");
            exampleLine("boolean matches2 = Pattern.matches(pattern2, str2);");
            exampleLine("System.out.println(matches2);");
            String str2 = "b";
            String pattern2 = "[abc]";
            boolean matches2 = Pattern.matches(pattern2, str2);
            System.out.println(matches2);

            exampleLine("String str3 = \"c\";");
            exampleLine("String pattern3 = \"[abc]\";");
            exampleLine("boolean matches3 = Pattern.matches(pattern3, str3);");
            exampleLine("System.out.println(matches3);");
            String str3 = "c";
            String pattern3 = "[abc]";
            boolean matches3 = Pattern.matches(pattern3, str3);
            System.out.println(matches3);

            exampleLine("String str4 = \"d\";");
            exampleLine("String pattern4 = \"[abc]\";");
            exampleLine("boolean matches4 = Pattern.matches(pattern4, str4);");
            exampleLine("System.out.println(matches4);");
            String str4 = "d";
            String pattern4 = "[abc]";
            boolean matches4 = Pattern.matches(pattern4, str4);
            System.out.println(matches4);

            exampleLine("String str5 = \"a\";");
            exampleLine("String pattern5 = \"[^abc]\";");
            exampleLine("boolean matches5 = Pattern.matches(pattern5, str5);");
            exampleLine("System.out.println(matches5);");
            String str5 = "a";
            String pattern5 = "[^abc]";
            boolean matches5 = Pattern.matches(pattern5, str5);
            System.out.println(matches5);

            exampleLine("String str6 = \"b\";");
            exampleLine("String pattern6 = \"[^abc]\";");
            exampleLine("boolean matches6 = Pattern.matches(pattern6, str6);");
            String str6 = "b";
            String pattern6 = "[^abc]";
            boolean matches6 = Pattern.matches(pattern6, str6);
            System.out.println(matches6);

            exampleLine("String str7 = \"c\";");
            exampleLine("String pattern7 = \"[^abc]\";");
            exampleLine("boolean matches7 = Pattern.matches(pattern7, str7);");
            String str7 = "c";
            String pattern7 = "[^abc]";
            boolean matches7 = Pattern.matches(pattern7, str7);
            System.out.println(matches7);
        });
    }

    public void regExSpecialCharacters() {
        runExample(() -> {
            exampleLine("String str1 = \"\t\";");
            exampleLine("String pattern1 = \"\\t\";");
            exampleLine("boolean matches1 = Pattern.matches(pattern1, str1);");
            exampleLine("System.out.println(matches1);");
            String str1 = "\t";
            String pattern1 = "\\t";
            boolean matches1 = Pattern.matches(pattern1, str1);
            System.out.println(matches1);
        });
        runExample(() -> {
            exampleLine("String str2 = \"\n\";");
            exampleLine("String pattern2 = \"\\n\";");
            exampleLine("boolean matches2 = Pattern.matches(pattern2, str2);");
            exampleLine("System.out.println(matches2);");
            String str2 = "\n";
            String pattern2 = "\\n";
            boolean matches2 = Pattern.matches(pattern2, str2);
            System.out.println(matches2);
        });

        runExample(() -> {
            exampleLine("String str3 = \"\\r\";");
            exampleLine("String pattern3 = \"\\r\";");
            exampleLine("boolean matches3 = Pattern.matches(pattern3, str3);");
            exampleLine("System.out.println(matches3);");
            String str3 = "\r";
            String pattern3 = "\\r";
            boolean matches3 = Pattern.matches(pattern3, str3);
            System.out.println(matches3);
        });

        runExample(() -> {
            exampleLine("String str4 = \"\\u000C\";");
            exampleLine("String pattern4 = \"\\\\f\";");
            exampleLine("boolean matches4 = Pattern.matches(pattern4, str4);");
            exampleLine("System.out.println(matches4);");
            String str4 = "\u000C";
            String pattern4 = "\\f";
            boolean matches4 = Pattern.matches(pattern4, str4);
            System.out.println(matches4);
        });

        runExample(() -> {
            exampleLine("String str5 = \"\\u0007;");
            exampleLine("String pattern5 = \"\\\\a\";");
            exampleLine("boolean matches5 = Pattern.matches(pattern5, str5);");
            exampleLine("System.out.println(matches5);");
            String str5 = "\u0007";
            String pattern5 = "\\a";
            boolean matches5 = Pattern.matches(pattern5, str5);
            System.out.println(matches5);
        });

        runExample(() -> {
            exampleLine("String str6 = \"\\u001a\";");
            exampleLine("String pattern6 = \"\\e\";");
            exampleLine("boolean matches6 = Pattern.matches(pattern6, str6);");
            exampleLine("System.out.println(matches6);");
            String str6 = "\u001a";
            String pattern6 = "\\e";
            boolean matches6 = Pattern.matches(pattern6, str6);
            System.out.println(matches6);
        });

        runExample(() -> {
            exampleLine("String str7 = \"\\u000B\";");
            exampleLine("String pattern7 = \"\\cx\";");
            exampleLine("boolean matches7 = Pattern.matches(pattern7, str7);");
            exampleLine("System.out.println(matches7);");
            String str7 = "\u000B";
            String pattern7 = "\\c0B";
            boolean matches7 = Pattern.matches(pattern7, str7);
            System.out.println(matches7);
        });
    }

    /*
        Predefined Character Classes
        .	Any character (may or may not match line terminators)
        \d	A digit: [0-9]
        \D	A non-digit: [^0-9]
        \h    A horizontal whitespace character: [ \t\xA0\u1680\u180e\u2000-\u200a\u202f\u205f\u3000]
        \H    A non-horizontal whitespace character: [^\h]
        \s	A whitespace character: [ \t\n\x0B\f\r]
        \S	A non-whitespace character: [^\s]
        \v    A vertical tab character: \x0B
        \V    A non-vertical tab character: [^\v]
        \w	A word character: [a-zA-Z_0-9]
        \W	A non-word character: [^\w]

     */
    public void regExPredefinedCharacterClasses() {
        runExample(() -> {
            exampleLine("String str1 = \"a\";");
            exampleLine("String pattern1 = \"\\w\";");
            exampleLine("boolean matches1 = Pattern.matches(pattern1, str1);");
            exampleLine("System.out.println(matches1);");
            String str1 = "a";
            String pattern1 = "\\w";
            boolean matches1 = Pattern.matches(pattern1, str1);
            System.out.println(matches1);
        });

        runExample(() -> {
            exampleLine("String str2 = \"a\";");
            exampleLine("String pattern2 = \"\\W\";");
            exampleLine("boolean matches2 = Pattern.matches(pattern2, str2);");
            exampleLine("System.out.println(matches2);");
            String str2 = "a";
            String pattern2 = "\\W";
            boolean matches2 = Pattern.matches(pattern2, str2);
            System.out.println(matches2);
        });

        runExample(() -> {
            exampleLine("String str3 = \"a\";");
            exampleLine("String pattern3 = \"\\d\";");
            exampleLine("boolean matches3 = Pattern.matches(pattern3, str3);");
            exampleLine("System.out.println(matches3);");
            String str3 = "a";
            String pattern3 = "\\d";
            boolean matches3 = Pattern.matches(pattern3, str3);
            System.out.println(matches3);
        });

        runExample(() -> {
            exampleLine("String str4 = \"a\";");
            exampleLine("String pattern4 = \"\\D\";");
            exampleLine("boolean matches4 = Pattern.matches(pattern4, str4);");
            exampleLine("System.out.println(matches4);");
            String str4 = "a";
            String pattern4 = "\\D";
            boolean matches4 = Pattern.matches(pattern4, str4);
            System.out.println(matches4);
        });

        runExample(() -> {
            exampleLine("String str5 = \"a\";");
            exampleLine("String pattern5 = \"\\s\";");
            exampleLine("boolean matches5 = Pattern.matches(pattern5, str5);");
            exampleLine("System.out.println(matches5);");
            String str5 = "a";
            String pattern5 = "\\s";
            boolean matches5 = Pattern.matches(pattern5, str5);
            System.out.println(matches5);
        });

        runExample(() -> {
            exampleLine("String str6 = \"a\";");
            exampleLine("String pattern6 = \"\\S\";");
            exampleLine("boolean matches6 = Pattern.matches(pattern6, str6);");
            exampleLine("System.out.println(matches6);");
            String str6 = "a";
            String pattern6 = "\\S";
            boolean matches6 = Pattern.matches(pattern6, str6);
            System.out.println(matches6);
        });

        runExample(() -> {
            exampleLine("String str7 = \"a\";");
            exampleLine("String pattern7 = \"\\h\";");
            exampleLine("boolean matches7 = Pattern.matches(pattern7, str7);");
            exampleLine("System.out.println(matches7);");
            String str7 = "a";
            String pattern7 = "\\h";
            boolean matches7 = Pattern.matches(pattern7, str7);
            System.out.println(matches7);
        });

        runExample(() -> {
            exampleLine("String str8 = \"a\";");
            exampleLine("String pattern8 = \"\\H\";");
            exampleLine("boolean matches8 = Pattern.matches(pattern8, str8);");
            exampleLine("System.out.println(matches8);");
            String str8 = "a";
            String pattern8 = "\\H";
            boolean matches8 = Pattern.matches(pattern8, str8);
            System.out.println(matches8);
        });

        runExample(() -> {
            exampleLine("String str9 = \"a\";");
            exampleLine("String pattern9 = \"\\v\";");
            exampleLine("boolean matches9 = Pattern.matches(pattern9, str9);");
            exampleLine("System.out.println(matches9);");
            String str9 = "a";
            String pattern9 = "\\v";
            boolean matches9 = Pattern.matches(pattern9, str9);
            System.out.println(matches9);
        });

        runExample(() -> {
            exampleLine("String str10 = \"a\";");
            exampleLine("String pattern10 = \"\\V\";");
            exampleLine("boolean matches10 = Pattern.matches(pattern10, str10);");
            exampleLine("System.out.println(matches10);");
            String str10 = "a";
            String pattern10 = "\\V";
            boolean matches10 = Pattern.matches(pattern10, str10);
            System.out.println(matches10);
        });
    }



    public void boundaryPatternsExamples() {
        runExample(() -> {
            exampleLine("String str1 = \"a\";");
            exampleLine("String pattern1 = \"^a\";");
            exampleLine("boolean matches1 = Pattern.matches(pattern1, str1);");
            exampleLine("System.out.println(matches1);");
            String str1 = "a";
            String pattern1 = "^a";
            boolean matches1 = Pattern.matches(pattern1, str1);
            System.out.println(matches1);
        });

        runExample(() -> {
            exampleLine("String str2 = \"a\";");
            exampleLine("String pattern2 = \"a$\";");
            exampleLine("boolean matches2 = Pattern.matches(pattern2, str2);");
            exampleLine("System.out.println(matches2);");
            String str2 = "a";
            String pattern2 = "a$";
            boolean matches2 = Pattern.matches(pattern2, str2);
            System.out.println(matches2);
        });

        runExample(() -> {
            exampleLine("String str3 = \"a\";");
            exampleLine("String pattern3 = \"\\ba\\b\";");
            exampleLine("boolean matches3 = Pattern.matches(pattern3, str3);");
            exampleLine("System.out.println(matches3);");
            String str3 = "a";
            String pattern3 = "\\ba\\b";
            boolean matches3 = Pattern.matches(pattern3, str3);
            System.out.println(matches3);
        });

        runExample(() -> {
            exampleLine("String str4 = \"a\";");
            exampleLine("String pattern4 = \"\\Ba\\B\";");
            exampleLine("boolean matches4 = Pattern.matches(pattern4, str4);");
            exampleLine("System.out.println(matches4);");
            String str4 = "a";
            String pattern4 = "\\Ba\\B";
            boolean matches4 = Pattern.matches(pattern4, str4);
            System.out.println(matches4);
        });

        runExample(() -> {
            exampleLine("String str5 = \"a\";");
            exampleLine("String pattern5 = \"\\Aa\";");
            exampleLine("boolean matches5 = Pattern.matches(pattern5, str5);");
            exampleLine("System.out.println(matches5);");
            String str5 = "a";
            String pattern5 = "\\Aa";
            boolean matches5 = Pattern.matches(pattern5, str5);
            System.out.println(matches5);
        });
    }

    public void lineBreakPatternExamples() {
        runExample(() -> {
            exampleLine("String str1 = \"a\";");
            exampleLine("String pattern1 = \"\\R\";");
            exampleLine("boolean matches1 = Pattern.matches(pattern1, str1);");
            exampleLine("System.out.println(matches1);");
            String str1 = "a";
            String pattern1 = "\\R";
            boolean matches1 = Pattern.matches(pattern1, str1);
            System.out.println(matches1);
        });
    }

    public static void main(String[] args) {
        PatternExamples examples = new PatternExamples();

        examples.runExamples("Base Examples", examples::basePatternExamples);
        examples.runExamples("Character Examples", examples::characterPatternsExamples);
        examples.runExamples("Character Classes Examples", examples::characterClassPatternsExamples);
        examples.runExamples("Predefined Character Examples", examples::regExPredefinedCharacterClasses);
        examples.runExamples("Boundary Examples", examples::boundaryPatternsExamples);
        examples.runExamples("Line Break Examples", examples::lineBreakPatternExamples);
    }
}
