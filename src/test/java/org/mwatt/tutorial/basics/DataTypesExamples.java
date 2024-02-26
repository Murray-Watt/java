package org.mwatt.tutorial.basics;

import org.mwatt.util.ExampleTestBase;

/*
    byte	1 byte	Stores whole numbers from -128 to 127
    short	2 bytes	Stores whole numbers from -32,768 to 32,767
    int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
    long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
    double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
    boolean	1 bit	Stores true or false values
    char	2 bytes	Stores a single character/letter or ASCII values
 */
public class DataTypesExamples extends ExampleTestBase {
    public void dataTypeExamples() {
        runExample(() -> {
            printExample("byte b = 100;");
            printExample("System.out.println(\"byte b = \" + b);");
            byte b = 100;
            System.out.println("byte b = " + b);

            printExample("b = -100;");
            printExample("System.out.println(\"byte b = \" + b);");
            b = -100;
            System.out.println("byte b = " + b);

            printExample("b = 127;");
            printExample("System.out.println(\"byte b = \" + b);");
            b = 127;
            System.out.println("byte b = " + b);

            printExample("b = -128;");
            printExample("System.out.println(\"byte b = \" + b);");
            b = -128;
            System.out.println("byte b = " + b);
        });

        runExample(() -> {
            printExample("short s = 10000;");
            printExample("System.out.println(\"short s = \" + s);");
            short s = 10000;
            System.out.println("short s = " + s);

            printExample("s = -10000;");
            printExample("System.out.println(\"short s = \" + s);");
            s = -10000;
            System.out.println("short s = " + s);

            printExample("s = 32767;");
            printExample("System.out.println(\"short s = \" + s);");
            s = 32767;
            System.out.println("short s = " + s);

            printExample("s = -32768;");
            printExample("System.out.println(\"short s = \" + s);");
            s = -32768;
            System.out.println("short s = " + s);
        });

        runExample(() -> {
            printExample("int i = 100000;");
            printExample("System.out.println(\"int i = \" + i);");
            int i = 100000;
            System.out.println("int i = " + i);

            printExample("i = -100000;");
            printExample("System.out.println(\"int i = \" + i);");
            i = -100000;
            System.out.println("int i = " + i);

            printExample("i = 2147483647;");
            printExample("System.out.println(\"int i = \" + i);");
            i = 2147483647;
            System.out.println("int i = " + i);

            printExample("i = -2147483648;");
            printExample("System.out.println(\"int i = \" + i);");
            i = -2147483648;
            System.out.println("int i = " + i);
        });

        runExample(() -> {
            printExample("long l = 10000000000L;");
            printExample("System.out.println(\"long l = \" + l);");
            long l = 10000000000L;
            System.out.println("long l = " + l);

            printExample("l = -10000000000L;");
            printExample("System.out.println(\"long l = \" + l);");
            l = -10000000000L;
            System.out.println("long l = " + l);

            printExample("l = 9223372036854775807L;");
            printExample("System.out.println(\"long l = \" + l);");
            l = 9223372036854775807L;
            System.out.println("long l = " + l);

            printExample("l = -9223372036854775808L;");
            printExample("System.out.println(\"long l = \" + l);");
            l = -9223372036854775808L;
            System.out.println("long l = " + l);
        });

        runExample(() -> {
            printExample("float f = 123.456f;");
            printExample("System.out.println(\"float f = \" + f);");
            float f = 123.456f;
            System.out.println("float f = " + f);

            printExample("f = -123.456f;");
            printExample("System.out.println(\"float f = \" + f);");
            f = -123.456f;
            System.out.println("float f = " + f);

            printExample("f = 3.4028235E38f;");
            printExample("System.out.println(\"float f = \" + f);");
            f = 3.4028235E38f;
            System.out.println("float f = " + f);

            printExample("f = -3.4028235E38f;");
            printExample("System.out.println(\"float f = \" + f);");
            f = -3.4028235E38f;
            System.out.println("float f = " + f);
        });

        runExample(() -> {
            printExample("double d = 123.456;");
            printExample("System.out.println(\"double d = \" + d);");
            double d = 123.456;
            System.out.println("double d = " + d);

            printExample("d = -123.456;");
            printExample("System.out.println(\"double d = \" + d);");
            d = -123.456;
            System.out.println("double d = " + d);

            printExample("d = 1.7976931348623157E308;");
            printExample("System.out.println(\"double d = \" + d);");
            d = 1.7976931348623157E308;
            System.out.println("double d = " + d);

            printExample("d = -1.7976931348623157E308;");
            printExample("System.out.println(\"double d = \" + d);");
            d = -1.7976931348623157E308;
            System.out.println("double d = " + d);
        });

        runExample(() -> {
            printExample("boolean b = true;");
            printExample("System.out.println(\"boolean b = \" + b);");
            boolean b = true;
            System.out.println("boolean b = " + b);

            printExample("b = false;");
            printExample("System.out.println(\"boolean b = \" + b);");
            b = false;
            System.out.println("boolean b = " + b);
        });

        runExample(() -> {
            printExample("char c = 'A';");
            printExample("System.out.println(\"char c = \" + c);");
            char c = 'A';
            System.out.println("char c = " + c);

            printExample("c = 65;");
            printExample("System.out.println(\"char c = \" + c);");
            c = 65;
            System.out.println("char c = " + c);
        });
    }

    public static void main(String[] args) {
         DataTypesExamples examples = new DataTypesExamples();
        examples.runExamples("Data Type Examples", examples::dataTypeExamples);
    }
}
