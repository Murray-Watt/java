package org.mwatt.tutorial.basics;

import org.mwatt.util.ExampleTestBase;

import java.util.Arrays;

@SuppressWarnings("all")
public class StringTest extends ExampleTestBase {
    public void stringObjectEqualsAndValueEqualsExamples() {
        {
            String s1 = "Hello";
            String s2 = "Hello";
            String s3 = new String("Hello");
            String s4 = new String("Hello");

            System.out.println(s1 == s2);
            System.out.println(s1 == s3);
            System.out.println(s3 == s4);

            System.out.println(s1.equals(s2));
            System.out.println(s1.equals(s3));
            System.out.println(s3.equals(s4));
        }

        {
            String s1 = "Hello";
            String s2 = "Hello";
            String s3 = "hello";
            String s4 = "HELLO";

            System.out.println(s1.equalsIgnoreCase(s2));
            System.out.println(s1.equalsIgnoreCase(s3));
            System.out.println(s1.equalsIgnoreCase(s4));
        };
    }
    public void stringCharAtAndCodePoints() {
        {
            String s = "Hello, World!";
            System.out.println(s.charAt(0));
            System.out.println(s.charAt(7));
            System.out.println(s.charAt(12));
        };

        {
            String s = "Hello, World!";
            System.out.println(s.codePointAt(0));
            System.out.println(s.codePointAt(7));
            System.out.println(s.codePointAt(12));
        }

        runExample(() -> {
            String s = "Hello, World!";
            System.out.println(s.codePointBefore(1));
            System.out.println(s.codePointBefore(8));
            System.out.println(s.codePointBefore(13));
        });

        runExample(() -> {
            String s = "Hello, World!";
            System.out.println(s.codePointCount(0, 1));
            System.out.println(s.codePointCount(0, 8));
            System.out.println(s.codePointCount(0, 13));
        });
    }

    public void stringCompareTo() {
        runExample(() -> {
            String s1 = "Hello";
            String s2 = "Hello";
            String s3 = "World";
            String s4 = "Hello, World!";
            String s5 = "Hello, World!";
            String s6 = "Hello, world!";
            String s7 = "Hello, WORLD!";

            System.out.println(s1.compareTo(s2));
            System.out.println(s1.compareTo(s3));
            System.out.println(s1.compareTo(s4));
            System.out.println(s4.compareTo(s5));
            System.out.println(s5.compareTo(s6));
            System.out.println(s6.compareTo(s7));
        });

        runExample(() -> {
            String s1 = "Hello";
            String s2 = "Hello";
            String s3 = "World";
            String s4 = "Hello, World!";
            String s5 = "Hello, World!";
            String s6 = "Hello, world!";
            String s7 = "Hello, WORLD!";

            System.out.println("s1.compareToIgnoreCase(s2): " + s1.compareToIgnoreCase(s2));
            System.out.println("s1.compareToIgnoreCase(s3): " + s1.compareToIgnoreCase(s3));
            System.out.println("s1.compareToIgnoreCase(s4): " + s1.compareToIgnoreCase(s4));
            System.out.println("s4.compareToIgnoreCase(s5): " + s4.compareToIgnoreCase(s5));
            System.out.println("s5.compareToIgnoreCase(s6): " + s5.compareToIgnoreCase(s6));
            System.out.println("s6.compareToIgnoreCase(s7): " + s6.compareToIgnoreCase(s7));
        });
    }

    public void stringContains() {
        runExample(() -> {
            String s = "Hello, World!";
            System.out.println("s.contains(\"Hello\"): " + s.contains("Hello"));
            System.out.println("s.contains(\"World\"): " + s.contains("World"));
            System.out.println("s.contains(\"!\"): " + s.contains("!"));
        });
    }

    //contentEquals()
    public void stringContentEquals() {
        runExample(() -> {
                String s1 = "Hello";
                String s2 = "Hello";
                String s3 = "Hello, World!";
                String s4 = "Hello, World!";

                System.out.println("s1.contentEquals(s2): " + s1.contentEquals(s2));
                System.out.println("s1.contentEquals(s3): " + s1.contentEquals(s3));
                System.out.println("s3.contentEquals(s4): " + s3.contentEquals(s4));
        });
    }

    public void stringCopyValueOf() {
        runExample(() -> {
            char[] c = {'H', 'e', 'l', 'l', 'o'};
            String s = String.copyValueOf(c);
            System.out.println("s: " + s);
        });

        runExample(() -> {
            char[] c = {'H', 'e', 'l', 'l', 'o'};
            String s = String.copyValueOf(c, 1, 3);
            System.out.println("s: " + s);
        });
    }

    // copyValueOf()
    public void stringConcatenation() {
        runExample(() -> {
            String s1 = "Hello";
            String s2 = "World";
            String s3 = s1 + ", " + s2 + "!";
            System.out.println("s3: " + s3);
        });
    }

    public void stringAcceessors() {
        runExample(() -> {
            String s = "Hello, World!";
            System.out.println("s.indexOf(\"Hello\"): " + s.indexOf("Hello"));
            System.out.println("s.indexOf(\"World\"): " + s.indexOf("World"));
            System.out.println("s.indexOf(\"!\"): " + s.indexOf("!"));
        });

        runExample(() -> {
            String s = "Hello, World!";
            System.out.println("s.length(): " + s.length());
        });

        runExample(() -> {
            String s1 = "Hello";
            String s2 = "Goodbye";
            String s3 = "World";

            String pattern = "Hello|Goodbye";

            System.out.println(s1.matches(pattern));
            System.out.println(s2.matches(pattern));
            System.out.println(s3.matches(pattern));
        });

        runExample(() -> {
            String s = "Hello, World!";
            System.out.println("s.startsWith(\"Hello\"): " + s.startsWith("Hello"));
            System.out.println("s.startsWith(\"World\"): " + s.startsWith("World"));
            System.out.println("s.startsWith(\"!\"): " + s.startsWith("!"));
        });

        runExample(() -> {
            String s = "Hello, World!";
            System.out.println("s.endsWith(\"Hello\"): " + s.endsWith("Hello"));
            System.out.println("s.endsWith(\"World\"): " + s.endsWith("World"));
            System.out.println("s.endsWith(\"!\"): " + s.endsWith("!"));
        });

        runExample(() -> {
            String s = "Hello, World!";
            System.out.println("s.lastIndexOf(\"Hello\"): " + s.lastIndexOf("Hello"));
            System.out.println("s.lastIndexOf(\"World\"): " + s.lastIndexOf("World"));
            System.out.println("s.lastIndexOf(\"!\"): " + s.lastIndexOf("!"));
        });
    }

    public void stringFormat() {
        runExample(() -> {
            String s1 = "Hello, World!";
            System.out.println("s.format(\"Hello, %s!\", \"World\"): " + s1.format("Hello, %s!", "World"));

            String s2 = "Hello, World!";
            System.out.println("s.format(\"Hello, %s!\", \"World\"): " + s2.format("Hello, %s!", "World"));
        });
    }

    public void stringSubSequence() {
        runExample(() -> {
            String s = "Hello, World!";
            System.out.println("s.subSequence(0, 5): " + s.subSequence(0, 5));
            System.out.println("s.subSequence(7, 12): " + s.subSequence(7, 12));
        });
    }

    public void stringSubstring() {
        runExample(() -> {
            String s = "Hello, World!";
            System.out.println("s.substring(0, 5): " + s.substring(0, 5));
            System.out.println("s.substring(7, 12): " + s.substring(7, 12));
        });
    }

    public void stringTranformations() {
        runExample(() -> {
            String s = "Hello, World!";
            System.out.println("s.toLowerCase(): " + s.toLowerCase());
            System.out.println("s.toUpperCase(): " + s.toUpperCase());
            System.out.println("s.trim(): " + s.trim());
        });

        runExample(() -> {
            String str = "Hello, World!";
            System.out.print("str.split(\",\"): ");
            Arrays.stream(str.split(",")).forEach((s) -> System.out.println(s));
        });

        runExample(() -> {
            String s = "Hello, World!";
            System.out.println("s.replace(\"Hello\", \"Goodbye\"): " + s.replace("Hello", "Goodbye"));
        });

        runExample(() -> {
            String s = "Hello, Hello, Hello World!";
            System.out.println("s.replaceAll(\"Hello\", \"Goodbye\"): " + s.replaceAll("Hello", "Goodbye"));
        });

        runExample(() -> {
            String s = "  Hello, World!  ";
            System.out.println(s.trim());
            System.out.println(s.trim().length());

            String s2 = "    Hello, World!";
            System.out.println(s2.trim());
        });
    }

    public void stringGets() {
        runExample(() -> {
            String s = "Hello, World!";
            System.out.println("s.getBytes(): " + s.getBytes());
        });

        runExample(() -> {
            String s = "Hello, World!";
            char[] c = new char[5];
            s.getChars(0, 5, c, 0);
            System.out.println(c);
        });
    }

    public void stringIntern() {
        String s = "Hello, World!";
        System.out.println("s.intern(): " + s.intern());
    }

    public void stringJoin() {
        runExample(() -> {
            String s = String.join(", ", "Hello", "World", "!");
            System.out.println("s: " + s);
        });
    }

    public static void main(String[] args) {
        StringTest examples = new StringTest();

        examples.runExamples("String == and Equals", examples::stringObjectEqualsAndValueEqualsExamples);
        examples.runExamples("String charAt and codePoints", examples::stringCharAtAndCodePoints);
        examples.runExamples("String compareTo", examples::stringCompareTo);
        examples.runExamples("String contains", examples::stringContains);
        examples.runExamples("String concatenation", examples::stringConcatenation);
        examples.runExamples("String contentEquals", examples::stringContentEquals);
        examples.runExamples("String copyValueOf", examples::stringCopyValueOf);
        examples.runExamples("String format", examples::stringFormat);
        examples.runExamples("String subSequence", examples::stringSubSequence);
        examples.runExamples("String substring", examples::stringSubstring);
        examples.runExamples("String transformations", examples::stringTranformations);
        examples.runExamples("String gets", examples::stringGets);
        examples.runExamples("String intern", examples::stringIntern);
        examples.runExamples("String join", examples::stringJoin);
        examples.runExamples("String Accessors", examples::stringAcceessors);
    }
}
