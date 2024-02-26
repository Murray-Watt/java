package org.mwatt.tutorial.regex;

import org.mwatt.util.ExampleTestBase;

import java.util.regex.Pattern;

public class PatternExamples extends ExampleTestBase {
    public void basePatternExamples() {
        runExample(() -> {

            printExample("""
                    String str1 = "HHHHHHHHH!";
                    String pattern = "H*!";
                    boolean matches1 = Pattern.matches(pattern1, str1);
                    System.out.println(matches1);
                    """);

            String str1 = "HHHHHHHHH!";
            String pattern1 = "H*!";
            boolean matches1 = Pattern.matches(pattern1, str1);
            System.out.println(matches1);

            printExample("""
                    String str2 = "GHHHHHHHH!";
                    String pattern2 = "H*!";
                    boolean matches2 = Pattern.matches(pattern2, str2);
                    System.out.println(matches2);
                    """);

            String str2 = "GHHHHHHHH!";
            String pattern2 = "H*!";
            boolean matches2 = Pattern.matches(pattern2, str2);
            System.out.println(matches2);
        });
    }

    public void characterPatternsExamples() {
        runExample(() ->
        {
            printExample("""
                    String str1 = "aaaa";
                    String pattern1 = "aaaa";
                    boolean matches1 = Pattern.matches(pattern1, str1);
                    System.out.println(matches1);
                    """);

            String str1 = "aaaa";
            String pattern1 = "aaaa";
            boolean matches1 = Pattern.matches(pattern1, str1);
            System.out.println(matches1);

            printExample("""
                    String str2 = "aaaa";
                    String pattern2 = "a+";
                    boolean matches2 = Pattern.matches(pattern2, str2);
                    System.out.println(matches2);
                    """);

            String str2 = "aaaa";
            String pattern2 = "a+";
            boolean matches2 = Pattern.matches(pattern2, str2);
            System.out.println(matches2);

            printExample("""
                    String str3 = "aaaaaaa";
                    String pattern3 = "a*";
                    boolean matches3 = Pattern.matches(pattern3, str3);
                    System.out.println(matches3);
                    """);

            String str3 = "aaaaaaa";
            String pattern3 = "a*";
            boolean matches3 = Pattern.matches(pattern3, str3);
            System.out.println(matches3);

            printExample("""
                    String str4 = "";
                    String pattern4 = "a*";
                    boolean matches4 = Pattern.matches(pattern4, str4);
                    System.out.println(matches4);
                    """);

            String str4 = "";
            String pattern4 = "a*";
            boolean matches4 = Pattern.matches(pattern4, str4);
            System.out.println(matches4);

            printExample("""
                    String str5 = "aaaaaa";
                    String pattern5 = "\\0141+";
                    boolean matches5 = Pattern.matches(pattern5, str5);
                    System.out.println(matches5);
                    """);

            String str5 = "aaaaaa";
            String pattern5 = "\\0141+";
            boolean matches5 = Pattern.matches(pattern5, str5);
            System.out.println(matches5);

            printExample("""
                    String str6 = "aaaaaa";
                    String pattern6 = "\\x61*";
                    boolean matches6 = Pattern.matches(pattern6, str6);
                    System.out.println(matches6);
                    """);

            String str6 = "aaaaaa";
            String pattern6 = "\\x61*";
            boolean matches6 = Pattern.matches(pattern6, str6);
            System.out.println(matches6);

            printExample("""
                    String str7 = "aaaaaa";
                    String pattern7 = "\\u0061*";
                    boolean matches7 = Pattern.matches(pattern7, str7);
                    System.out.println(matches7);
                    """);

            String str7 = "aaaaaa";
            String pattern7 = "\\u0061*";
            boolean matches7 = Pattern.matches(pattern7, str7);
            System.out.println(matches7);
        });
    }

    public void characterClassPatternsExamples() {
        runExample(() ->
        {
            printExample("""
                    String str1 = "a";
                    String pattern1 = "[abc]";
                    boolean matches1 = Pattern.matches(pattern1, str1);
                    System.out.println(matches1);
                    """);

            String str1 = "a";
            String pattern1 = "[abc]";
            boolean matches1 = Pattern.matches(pattern1, str1);
            System.out.println(matches1);

            printExample("""
                    String str2 = "b";
                    String pattern2 = "[abc]";
                    boolean matches2 = Pattern.matches(pattern2, str2);
                    System.out.println(matches2);
                    """);

            String str2 = "b";
            String pattern2 = "[abc]";
            boolean matches2 = Pattern.matches(pattern2, str2);
            System.out.println(matches2);

            printExample("""
                    String str3 = "c";
                    String pattern3 = "[abc]";
                    boolean matches3 = Pattern.matches(pattern3, str3);
                    System.out.println(matches3);
                    """);

            String str3 = "c";
            String pattern3 = "[abc]";
            boolean matches3 = Pattern.matches(pattern3, str3);
            System.out.println(matches3);

            printExample("""
                    String str4 = "d";
                    String pattern4 = "[abc]";
                    boolean matches4 = Pattern.matches(pattern4, str4);
                    System.out.println(matches4);
                    """);

            String str4 = "d";
            String pattern4 = "[abc]";
            boolean matches4 = Pattern.matches(pattern4, str4);
            System.out.println(matches4);

            printExample("""
                    String str5 = "a";
                    String pattern5 = "[^abc]";
                    boolean matches5 = Pattern.matches(pattern5, str5);
                    System.out.println(matches5);
                    """);

            String str5 = "a";
            String pattern5 = "[^abc]";
            boolean matches5 = Pattern.matches(pattern5, str5);
            System.out.println(matches5);

            printExample("""
                    String str6 = "b";
                    String pattern6 = "[^abc]";
                    boolean matches6 = Pattern.matches(pattern6, str6);
                    System.out.println(matches6);
                    """);

            String str6 = "b";
            String pattern6 = "[^abc]";
            boolean matches6 = Pattern.matches(pattern6, str6);
            System.out.println(matches6);

            printExample("""
                    String str7 = "c";
                    String pattern7 = "[^abc]";
                    boolean matches7 = Pattern.matches(pattern7, str7);
                    System.out.println(matches7);
                    """);

            String str7 = "c";
            String pattern7 = "[^abc]";
            boolean matches7 = Pattern.matches(pattern7, str7);
            System.out.println(matches7);
        });
    }

    public void regExSpecialCharacters() {
        runExample(() -> {
            printExample("""
                    String str1 = "\\t";
                    String pattern1 = "\\t";
                    boolean matches1 = Pattern.matches(pattern1, str1);
                    System.out.println(matches1);
                    """);

            String str1 = "\t";
            String pattern1 = "\\t";
            boolean matches1 = Pattern.matches(pattern1, str1);
            System.out.println(matches1);
        });
        runExample(() -> {
            printExample("""
                    String str2 = "\\n";
                    String pattern2 = "\\n";
                    boolean matches2 = Pattern.matches(pattern2, str2);
                    System.out.println(matches2);
                    """);

            String str2 = "\n";
            String pattern2 = "\\n";
            boolean matches2 = Pattern.matches(pattern2, str2);
            System.out.println(matches2);
        });

        runExample(() -> {
            printExample("""
                    String str3 = "\\r";
                    String pattern3 = "\\r";
                    boolean matches3 = Pattern.matches(pattern3, str3);
                    System.out.println(matches3);
                    """);

            String str3 = "\r";
            String pattern3 = "\\r";
            boolean matches3 = Pattern.matches(pattern3, str3);
            System.out.println(matches3);
        });

        runExample(() -> {
            printExample("""
                    String str4 = "\\f";
                    String pattern4 = "\\f";
                    boolean matches4 = Pattern.matches(pattern4, str4);
                    System.out.println(matches4);
                    """);
            String str4 = "\u000C";
            String pattern4 = "\\f";
            boolean matches4 = Pattern.matches(pattern4, str4);
            System.out.println(matches4);
        });

        runExample(() -> {
            printExample("""
                    String str5 = "\\a";
                    String pattern5 = "\\a";
                    boolean matches5 = Pattern.matches(pattern5, str5);
                    System.out.println(matches5);
                    """);

            String str5 = "\u0007";
            String pattern5 = "\\a";
            boolean matches5 = Pattern.matches(pattern5, str5);
            System.out.println(matches5);
        });

        runExample(() -> {
            printExample("""
                    String str6 = "\\e";
                    String pattern6 = "\\e";
                    boolean matches6 = Pattern.matches(pattern6, str6);
                    System.out.println(matches6);
                    """);

            String str6 = "\u001a";
            String pattern6 = "\\e";
            boolean matches6 = Pattern.matches(pattern6, str6);
            System.out.println(matches6);
        });

        runExample(() -> {
            printExample("""
                    String str7 = "\\c0B";
                    String pattern7 = "\\c0B";
                    boolean matches7 = Pattern.matches(pattern7, str7);
                    System.out.println(matches7);
                    """);

            String str7 = "\u000B";
            String pattern7 = "\\c0B";
            boolean matches7 = Pattern.matches(pattern7, str7);
            System.out.println(matches7);
        });
    }

    public void regExPredefinedCharacterClasses() {
        runExample(() -> {
            printExample("""
                    String str1 = "a";
                    String pattern1 = "\\w";
                    boolean matches1 = Pattern.matches(pattern1, str1);
                    System.out.println(matches1);
                    """);

            String str1 = "a";
            String pattern1 = "\\w";
            boolean matches1 = Pattern.matches(pattern1, str1);
            System.out.println(matches1);
        });

        runExample(() -> {
            printExample("""
                    String str2 = "a";
                    String pattern2 = "\\W";
                    boolean matches2 = Pattern.matches(pattern2, str2);
                    System.out.println(matches2);
                    """);

            String str2 = "a";
            String pattern2 = "\\W";
            boolean matches2 = Pattern.matches(pattern2, str2);
            System.out.println(matches2);
        });

        runExample(() -> {
            printExample("""
                    String str3 = "a";
                    String pattern3 = "\\d";
                    boolean matches3 = Pattern.matches(pattern3, str3);
                    System.out.println(matches3);
                    """);
            String str3 = "a";
            String pattern3 = "\\d";
            boolean matches3 = Pattern.matches(pattern3, str3);
            System.out.println(matches3);
        });

        runExample(() -> {
            printExample("""
                    String str4 = "a";
                    String pattern4 = "\\D";
                    boolean matches4 = Pattern.matches(pattern4, str4);
                    System.out.println(matches4);
                    """);
            String str4 = "a";
            String pattern4 = "\\D";
            boolean matches4 = Pattern.matches(pattern4, str4);
            System.out.println(matches4);
        });

        runExample(() -> {
            printExample("""
                    String str5 = "a";
                    String pattern5 = "\\s";
                    boolean matches5 = Pattern.matches(pattern5, str5);
                    System.out.println(matches5);
                    """);

            String str5 = "a";
            String pattern5 = "\\s";
            boolean matches5 = Pattern.matches(pattern5, str5);
            System.out.println(matches5);
        });

        runExample(() -> {
            printExample("""
                    String str6 = "a";
                    String pattern6 = "\\S";
                    boolean matches6 = Pattern.matches(pattern6, str6);
                    System.out.println(matches6);
                    """);

            String str6 = "a";
            String pattern6 = "\\S";
            boolean matches6 = Pattern.matches(pattern6, str6);
            System.out.println(matches6);
        });

        runExample(() -> {
            printExample("""
                    String str7 = "a";
                    String pattern7 = "\\h";
                    boolean matches7 = Pattern.matches(pattern7, str7);
                    System.out.println(matches7);
                    """);

            String str7 = "a";
            String pattern7 = "\\h";
            boolean matches7 = Pattern.matches(pattern7, str7);
            System.out.println(matches7);
        });

        runExample(() -> {
            printExample("""
                    String str8 = "a";
                    String pattern8 = "\\H";
                    boolean matches8 = Pattern.matches(pattern8, str8);
                    System.out.println(matches8);
                    """);

            String str8 = "a";
            String pattern8 = "\\H";
            boolean matches8 = Pattern.matches(pattern8, str8);
            System.out.println(matches8);
        });

        runExample(() -> {
            printExample("""
                    String str9 = "a";
                    String pattern9 = "\\v";
                    boolean matches9 = Pattern.matches(pattern9, str9);
                    System.out.println(matches9);
                    """);
            String str9 = "a";
            String pattern9 = "\\v";
            boolean matches9 = Pattern.matches(pattern9, str9);
            System.out.println(matches9);
        });

        runExample(() -> {
            printExample("""
                    String str10 = "a";
                    String pattern10 = "\\V";
                    boolean matches10 = Pattern.matches(pattern10, str10);
                    System.out.println(matches10);
                    """);

            String str10 = "a";
            String pattern10 = "\\V";
            boolean matches10 = Pattern.matches(pattern10, str10);
            System.out.println(matches10);
        });
    }



    public void boundaryPatternsExamples() {
        runExample(() -> {
            printExample("""
                    String str1 = "a";
                    String pattern1 = "^a";
                    boolean matches1 = Pattern.matches(pattern1, str1);
                    System.out.println(matches1);
                    """);

            String str1 = "a";
            String pattern1 = "^a";
            boolean matches1 = Pattern.matches(pattern1, str1);
            System.out.println(matches1);
        });

        runExample(() -> {
            printExample("""
                    String str2 = "a";
                    String pattern2 = "a$";
                    boolean matches2 = Pattern.matches(pattern2, str2);
                    System.out.println(matches2);
                    """);

            String str2 = "a";
            String pattern2 = "a$";
            boolean matches2 = Pattern.matches(pattern2, str2);
            System.out.println(matches2);
        });

        runExample(() -> {
            printExample("""
                    String str3 = "a";
                    String pattern3 = "\\ba\\b";
                    boolean matches3 = Pattern.matches(pattern3, str3);
                    System.out.println(matches3);
                    """);

            String str3 = "a";
            String pattern3 = "\\ba\\b";
            boolean matches3 = Pattern.matches(pattern3, str3);
            System.out.println(matches3);
        });

        runExample(() -> {
            printExample("""
                    String str4 = "a";
                    String pattern4 = "\\Ba\\B";
                    boolean matches4 = Pattern.matches(pattern4, str4);
                    System.out.println(matches4);
                    """);

            String str4 = "a";
            String pattern4 = "\\Ba\\B";
            boolean matches4 = Pattern.matches(pattern4, str4);
            System.out.println(matches4);
        });

        runExample(() -> {
            printExample("""
                    String str5 = "a";
                    String pattern5 = "\\Aa";
                    boolean matches5 = Pattern.matches(pattern5, str5);
                    System.out.println(matches5);
                    """);

            String str5 = "a";
            String pattern5 = "\\Aa";
            boolean matches5 = Pattern.matches(pattern5, str5);
            System.out.println(matches5);
        });
    }

    public void lineBreakPatternExamples() {
        runExample(() -> {
            printExample("""
                    String str1 = "a";
                    String pattern1 = "\\R";
                    boolean matches1 = Pattern.matches(pattern1, str1);
                    System.out.println(matches1);
                    """);

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
