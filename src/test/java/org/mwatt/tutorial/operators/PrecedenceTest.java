package org.mwatt.tutorial.operators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrecedenceTest{
    @Test
    public void parenthesesExamples() {
        int result = (31 / 2 + 1) + 2;
        System.out.println("result = " + result);
        assertEquals(18, result);

        result = 31 / (2 + 1) + 2;
        System.out.println("result = " + result);
        assertEquals(12, result);

        double dresult = 31 / (2 + 1.0) + 2;
        System.out.println("dresult = " + dresult);
        assertEquals(12.333333333333334, dresult);
    }

    @Test
    public void unaryOperatorsPrecedence() {
        int a = 10;
        int b = 20;
        int c = 30;
        int result = -a + b * c;
        System.out.println("result = " + result);
        assertEquals(590, result);
    }

    @Test
    public void postFixIncrementPrecedence() {
        int a = 10;
        int result = a++ + a;
        System.out.println("result = " + result);
        assertEquals(21, result);
    }

    @Test
    public void prefixIncrementPrecedence() {
        int a = 10;
        int result = ++a + a;
        System.out.println("result = " + result);
        assertEquals(22, result);
    }

    @Test
    public void divisonOverAdditionPrecedence() {
        int a = 10;
        int b = 20;
        int c = 30;
        int result = c / b + a;
        System.out.println("result = " + result);
        assertEquals(11, result);
    }

    @Test
    public void multiplicationOverAdditionPrecedence() {
        int a = 10;
        int b = 20;
        int c = 30;
        int result = c * b + a;
        System.out.println("result = " + result);
        assertEquals(610, result);
    }

    @Test
    public void shiftOperatorsPrecedence() {
        int a = 10;
        int result = a << 2 + 2;
        System.out.println("result = " + result);
        assertEquals(160, result);
    }
}
