package org.mwatt.tutorial.basics;

/*
    byte	1 byte	    -128 to 127
    short	2 bytes	    -32,768 to 32,767
    int	    4 bytes 	-2,147,483,648 to 2,147,483,647
    long	8 bytes	    -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    float	4 bytes	    Stores fractional numbers with 6 to 7 decimal digits
    double	8 bytes	    Stores fractional numbers with 15 decimal digits
    boolean	1 bit	    Stores true or false values
    char	2 bytes 	Stores a single character/letter or ASCII values
 */
public class DataTypesTest {
    public void dataTypeExamples() {
        {
            {
            }
            byte b = 100;
            System.out.println("byte b = " + b);

            b = -100;
            System.out.println("byte b = " + b);

            b = 127;
            System.out.println("byte b = " + b);

            b = -128;
            System.out.println("byte b = " + b);
        };

        {
            short s = 10000;
            System.out.println("short s = " + s);

            s = -10000;
            System.out.println("short s = " + s);

            s = 32767;
            System.out.println("short s = " + s);

            s = -32768;
            System.out.println("short s = " + s);
        };

        {
            int i = 100000;
            System.out.println("int i = " + i);

            i = -100000;
            System.out.println("int i = " + i);

            i = 2147483647;
            System.out.println("int i = " + i);

            i = -2147483648;
            System.out.println("int i = " + i);
        };

        {
            long l = 10000000000L;
            System.out.println("long l = " + l);

            l = -10000000000L;
            System.out.println("long l = " + l);

            l = 9223372036854775807L;
            System.out.println("long l = " + l);

            l = -9223372036854775808L;
            System.out.println("long l = " + l);
        };

        {
            float f = 123.456f;
            System.out.println("float f = " + f);

            f = -123.456f;
            System.out.println("float f = " + f);

            f = 3.4028235E38f;
            System.out.println("float f = " + f);

            f = -3.4028235E38f;
            System.out.println("float f = " + f);
        };

        {
            double d = 123.456;
            System.out.println("double d = " + d);

            d = -123.456;
            System.out.println("double d = " + d);

            d = 1.7976931348623157E308;
            System.out.println("double d = " + d);

            d = -1.7976931348623157E308;
            System.out.println("double d = " + d);
        };

        {
            boolean b = true;
            System.out.println("boolean b = " + b);

            b = false;
            System.out.println("boolean b = " + b);
        };

        {
            char c = 'A';
            System.out.println("char c = " + c);

            c = 65;
            System.out.println("char c = " + c);
        };
    }
}
