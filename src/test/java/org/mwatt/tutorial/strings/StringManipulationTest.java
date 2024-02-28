package org.mwatt.tutorial.strings;

import org.junit.jupiter.api.Test;
import org.mwatt.util.ExampleTestBase;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
    concat
    join (introduced in Java 8)
    replace
    replaceAll
    replaceFirst
    split
    substring
    subSequence
 */
@SuppressWarnings({"WrapperTypeMayBePrimitive", "unused"})
public class StringManipulationTest extends ExampleTestBase {
    @SuppressWarnings("InnerClassMayBeStatic")
    class HelloClass {
        @Override
        public String toString() {
            return "Hello";
        }
    }

    @Test
    public void concatenationExamples() {
        String string1 = "Hello";
        String string2 = "World";
        String string3 = string1 + ", " + string2 + "!";
        System.out.println("string3: " + string3);

        int i = 42;   // Autoboxed when used in concatenation
        Integer wrappedI = 42;

        String string4 = "" + new HelloClass() + i + wrappedI;
        System.out.println("string4: " + string4);
        assertEquals("Hello4242", string4);

        String string5 = i + wrappedI + "" +  new HelloClass();
        System.out.println("string5: " + string5);
        assertEquals("84Hello", string5);

        String string6 = new HelloClass().toString() + (i + wrappedI);
        System.out.println("string6: " + string6);
        assertEquals("Hello84", string6);

        String string7 = "a";
        string7 += "b";
        string7 += "c";
        System.out.println("string7: " + string7);
        assertEquals("abc", string7);

        String string8 = "";
        string8 += new HelloClass();
        assertEquals("Hello", string8);

        Integer i42 = 42;
        String helloString = "Hello";

        // i42 += helloString; is not allowed
        helloString += i42;
        System.out.println("helloString: " + helloString);
        assertEquals("Hello42", helloString);
    }

    @Test
    public void basicFormatExample() {
        String s1 = "Hello, World!";
        System.out.println("s.format(\"Hello, %s!\", \"World\"): " + String.format("Hello, %s!", "World"));

        String s2 = "Hello, World!";
        System.out.println("s.format(\"Hello, %s!\", \"World\"): " + String.format("Hello, %s!", "World"));
    }

    @Test
    public void joinExamples() {
        String string1 = String.join(", ", "Hello", "World", "!");
        System.out.println("string1 " + string1);

        String[] strings = {"Hello","", "World", "!"};
        String string2 = String.join(", ", strings);
        System.out.println("string2 " + string2);
        assertEquals(string1, string2);
    }

    @Test
    public void linesExamples() {
        String string1 = "Hello, World!\nGoodBye, World!\nHello, World!\n";

        string1.lines().forEach(System.out::println);
        assertEquals(3, string1.lines().count());
    }

    @Test
    public void repeatExamples() {
        String string1 = "Hello, World!";
        System.out.println("string1.repeat(3): " + string1.repeat(3));
        assertEquals("Hello, World!Hello, World!Hello, World!", string1.repeat(3));
    }

    @Test
    public void stripExamples() {
        String string1 = "\t\nHello, World!  ";
        System.out.println("string1.strip(): " + string1.strip());
        assertEquals("Hello, World!", string1.strip());
        System.out.println("string1.stripLeading(): " + string1.stripLeading());
        assertEquals("Hello, World!  ", string1.stripLeading());
        System.out.println("string1.stripTrailing(): " + string1.stripTrailing());
        assertEquals("\t\nHello, World!", string1.stripTrailing());
    }

    // Begining index is inclusive, ending index is exclusive
    // subString returns a CharSequence interface
    @Test
    public void subSequenceExamples() {
        String s = "Hello, World!";
        System.out.println("s.subSequence(0, 5): " + s.subSequence(0, 5));
        System.out.println("s.subSequence(7, 12): " + s.subSequence(7, 12));
    }

    // Substring returns a new string unless the substring is the same as the original string
    @Test
    public void substringExamples() {
        String s = "Hello, World!";
        System.out.println("s.substring(0, 5): " + s.substring(0, 5));
        System.out.println("s.substring(7, 12): " + s.substring(7, 12));
    }

    // replace methods return a new string if there is match
    // if no match is found, the original string is returned
    //
    // If the replace matches when you pass a char
    // but the replacement is the same as the original, the original string is returned
    //

    @Test
    public void replaceExamples() {
        String s = "Hello, World!";
        System.out.println("s.replace(\"o\", \"a\"): " + s.replace("o", "a"));
        assertEquals("Hella, Warld!", s.replace("o", "a"));

        System.out.println("s.replace(\"Hello\", \"Goodbye\"): " + s.replace("Hello", "Goodbye"));
        assertEquals("Goodbye, World!", s.replace("Hello", "Goodbye"));

        System.out.println("s.replace(\"[a-zA-Z]\", \"*\"): " + s.replaceAll("[a-zA-Z]", "*"));
        assertEquals("*****, *****!", s.replaceAll("[a-zA-Z]", "*"));
    }

    @Test
    public void replaceAllExamples() {
        String s = "Hello, Hello, Hello World!";
        System.out.println("s.replaceAll(\"Hello\", \"Goodbye\"): " + s.replaceAll("Hello", "Goodbye"));
        assertEquals("Goodbye, Goodbye, Goodbye World!", s.replaceAll("Hello", "Goodbye"));

        // replace all regular expression
        System.out.println("s.replaceAll(\"[a-zA-Z]\", \"*\"): " + s.replaceAll("[a-zA-Z]", "*"));
        assertEquals("*****, *****, ***** *****!", s.replaceAll("[a-zA-Z]", "*"));
    }

    @Test
    public void replaceFirstExamples() {
        String s = "Hello, Hello, Hello World!";
        System.out.println("s.replaceFirst(\"Hello\", \"Goodbye\"): " + s.replaceFirst("Hello", "Goodbye"));
        assertEquals("Goodbye, Hello, Hello World!", s.replaceFirst("Hello", "Goodbye"));

        // replace first regular expression
        System.out.println("s.replaceFirst(\"[a-zA-Z]\", \"*\"): " + s.replaceFirst("[a-zA-Z]", "*"));
        assertEquals("*ello, Hello, Hello World!", s.replaceFirst("[a-zA-Z]", "*"));
    }

    @Test
    public void splitExamples() {
        String str = "Hello, World!";
        System.out.print("str.split(\",\"): ");
        Arrays.stream(str.split(",")).forEach(System.out::println);
        assertEquals(2, str.split(",").length);
    }

    public static void main(String[] args) {
        StringManipulationTest examples = new StringManipulationTest();

        examples.runExamples("String concatination", examples::concatenationExamples);
        examples.runExamples("String join", examples::joinExamples);
        examples.runExamples("String replace", examples::replaceExamples);
        examples.runExamples("String replaceAll", examples::replaceAllExamples);
        examples.runExamples("String replaceFirst", examples::replaceFirstExamples);
        examples.runExamples("String split", examples::splitExamples);
        examples.runExamples("String subSequence", examples::subSequenceExamples);
        examples.runExamples("String substring", examples::substringExamples);
    }
}
