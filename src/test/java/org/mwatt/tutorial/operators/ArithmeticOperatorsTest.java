package org.mwatt.tutorial.operators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/*
    ++ -- - + * / %
 */
@SuppressWarnings("ALL")
public class ArithmeticOperatorsTest {

    @Test
    public void prefixDecrement() {
        int a = 10;
        int b = 20;

        assertEquals(9, --a);
        assertEquals(19, --b);

        int c = --a;
        assertEquals(8, c);
        assertEquals(8, a);
    }

    @Test
    public void postfixDecrement() {
        int a = 10;
        int b = 20;

        assertEquals(10, a--);
        assertEquals(20, b--);

        int c = a--;
        assertEquals(9, c);
        assertEquals(8, a);
    }

    @Test
    public void prefixIncrement() {
        int a = 10;
        int b = 20;

        assertEquals(11, ++a);
        assertEquals(21, ++b);

        int c = ++a;
        assertEquals(12, c);
        assertEquals(12, a);
    }

    @Test
    public void postfixIncrement() {
        int a = 10;
        int b = 20;

        assertEquals(10, a++);
        assertEquals(20, b++);

        int c = a++;
        assertEquals(11, c);
        assertEquals(12, a);
    }

    @Test
    public void unaryMinus() {
        int a = 10;
        int b = 20;
        assertEquals(-10, -a);
        assertEquals(-20, -b);
    }

    @Test
    public void unaryPlus() {
        int a = 10;
        int b = 20;
        assertEquals(10, +a);
        assertEquals(20, +b);
    }

    @Test
    public void addition() {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        assertEquals(30, a + b);
        assertEquals(-10, a - b);
        assertEquals(200, a * b);
        assertEquals(2, b / a);
        assertEquals(0, b % a);
        assertEquals(5, c % a);
        assertEquals(10, a++);
        assertEquals(11, a--);
        assertEquals(25, d++);
        assertEquals(27, ++d);
    }

    @Test
    public void subtraction() {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        assertEquals(-10, a - b);
        assertEquals(10, b - a);
        assertEquals(0, a - a);
        assertEquals(0, b - b);
        assertEquals(0, c - c);
        assertEquals(0, d - d);
    }

    @Test
    public void multiplication() {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        assertEquals(200, a * b);
        assertEquals(200, b * a);
        assertEquals(100, a * a);
        assertEquals(400, b * b);
        assertEquals(625, c * c);
        assertEquals(625, d * d);
    }

    @Test
    public void division() {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        assertEquals(2, b / a);
        assertEquals(0, a / b);
        assertEquals(1, a / a);
        assertEquals(1, b / b);
        assertEquals(1, c / c);
        assertEquals(1, d / d);
    }

    @Test
    public void modulus() {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        assertEquals(0, b % a);
        assertEquals(10, a % b);
        assertEquals(0, a % a);
        assertEquals(0, b % b);
        assertEquals(0, c % c);
        assertEquals(0, d % d);
    }

    @Test
    public void divideByZero() {
        int a = 10;
        int b = 0;
        try {
            int result = a / b;
            fail();
            System.out.println("result = " + result);

        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e);
        }
    }

    @Test
    public void modulusByZero() {
        int a = 10;
        int b = 0;
        try {
            int result = a % b;
            fail();
            System.out.println("result = " + result);

        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e);
        }
    }

    @Test void divideByZeroDouble() {
        double a = 10;
        double b = 0;
        double result = a / b;
        System.out.println("result = " + result);
        assertEquals(Double.POSITIVE_INFINITY, result);
    }

    @Test void modulusByZeroDouble() {
        double a = 10;
        double b = 0;
        double result = a % b;
        System.out.println("result = " + result);
        assertEquals(Double.NaN, result);
    }
}
