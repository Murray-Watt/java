package org.mwatt.algorithms.strings.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralsTest {

    @Test
    public void romanToIntNull() {
        RomanNumerals romanNumerals = new RomanNumerals();
        int result = romanNumerals.romanToInt(null);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void romanToIntEmptyString() {
        RomanNumerals romanNumerals = new RomanNumerals();
        int result = romanNumerals.romanToInt("");
        Assertions.assertEquals(0, result);
    }

    @Test
    public void romanToIntSingleValue() {
        RomanNumerals romanNumerals = new RomanNumerals();
        int result = romanNumerals.romanToInt("I");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void romanToIntMultipleValues() {
        RomanNumerals romanNumerals = new RomanNumerals();
        int result = romanNumerals.romanToInt("XV");
        Assertions.assertEquals(15, result);
    }

    @Test
    public void romanToIntSubtractiveNotation() {
        RomanNumerals romanNumerals = new RomanNumerals();
        int result = romanNumerals.romanToInt("IV");
        Assertions.assertEquals(4, result);
    }

    @Test
    public void romanToIntCase1() {
        RomanNumerals romanNumerals = new RomanNumerals();
        int result = romanNumerals.romanToInt("III");
        Assertions.assertEquals(3, result);
    }

    @Test
    public void romanToIntCase2() {
        RomanNumerals romanNumerals = new RomanNumerals();
        int result = romanNumerals.romanToInt("LVIII");
        Assertions.assertEquals(58, result);
    }


    @Test
    public void romanToIntCase3() {
        RomanNumerals romanNumerals = new RomanNumerals();
        int result = romanNumerals.romanToInt("MCMXCIV");
        Assertions.assertEquals(1994, result);
    }

    @Test
    public void intToRomanZero() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String result = romanNumerals.intToRoman(0);
        Assertions.assertEquals("", result);
    }

    @Test
    public void intToRomanSingleDigit() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String result = romanNumerals.intToRoman(5);
        Assertions.assertEquals("V", result);
    }

    @Test
    public void intToRomanSubtractiveNotation() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String result = romanNumerals.intToRoman(4);
        Assertions.assertEquals("IV", result);
    }

    @Test
    public void intToRomanMultipleDigits() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String result = romanNumerals.intToRoman(29);
        Assertions.assertEquals("XXIX", result);
    }

    @Test
    public void intToRomanLargeNumber() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String result = romanNumerals.intToRoman(2000);
        Assertions.assertEquals("MM", result);
    }

    @Test
    public void intToRoman90() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String result = romanNumerals.intToRoman(90);
        Assertions.assertEquals("XC", result);
    }

    @Test
    public void intToRomanLargeNumber2() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String result = romanNumerals.intToRoman(1994);
        Assertions.assertEquals("MCMXCIV", result);
    }
}
