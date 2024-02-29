package org.mwatt.tutorial.basics;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("all")
public class CastingTest {
    /*
        Widening Casting (automatically) - converting a smaller type to a larger type size
        byte -> short -> int -> long -> float -> double
        char -> int -> long -> float -> double
     */
    @Test
    public void wideningCasting() {
        byte myByte = 0x41;
        char myChar = 'A';

        short myShort = myByte;     // Automatic casting: short to int
        int myInt = myShort;        // Automatic casting: int to long
        int myIntFromChar = myChar; // Automatic casting: char to int
        long myLong = myInt;        // Automatic casting: int to long
        float myFloat = myLong;     // Automatic casting: long to float
        double myDouble = myFloat;  // Automatic casting: int to double

        System.out.println("byte: " + myByte);
        assertEquals(0x41,myByte);

        System.out.println("char: " + myChar);
        assertEquals('A',myChar);

        System.out.println("short: " + myShort);
        assertEquals(65,myShort);

        System.out.println("int: " + myInt);
        assertEquals(65,myInt);

        System.out.println("long: " + myLong);
        assertEquals(65L,myLong);

        System.out.println("float: " + myFloat);
        assertEquals(65.0f,myFloat);

        System.out.println("double: " + myDouble);
        assertEquals(65.0,myDouble);

        System.out.println("int from char " + myIntFromChar);
        assertEquals(65,myIntFromChar);
    }

    /*
        Narrowing Casting (manually) - converting a larger type to a smaller size type
        double -> float -> long -> int -> char -> short -> byte
     */
    @Test
    public void narrowingCasting() {
        double myDouble = 65.0;

        float myFloat = (float) myDouble; // Manual casting: double to float
        long myLong = (long) myFloat;     // Manual casting: float to long
        int myInt = (int) myLong;         // Manual casting: long to int
        char myChar = (char) myInt;       // Manual casting: int to char
        short myShort = (short) myChar;   // Manual casting: char to short
        byte myByte = (byte) myShort;     // Manual casting: short to byte

        System.out.println("double: " + myDouble);
        assertEquals(65.0,myDouble);

        System.out.println("float: " + myFloat);
        assertEquals(65.0f,myFloat);

        System.out.println("long: " + myLong);
        assertEquals(65L,myLong);

        System.out.println("int: " + myInt);
        assertEquals(65,myInt);

        System.out.println("char: " + myChar);
        assertEquals('A',myChar);

        System.out.println("short: " + myShort);
        assertEquals(65,myShort);

        System.out.println("byte: " + myByte);
        assertEquals(65,myByte);
    }
}
