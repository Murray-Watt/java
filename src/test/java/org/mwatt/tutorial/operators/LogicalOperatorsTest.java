package org.mwatt.tutorial.operators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LogicalOperatorsTest {
    @Test
    public void bitWiseNegate() {
        byte a = (byte) 0b00000000;
        byte b = (byte) 0b11111111;
        byte c = (byte) 0b01010101;
        byte d = (byte) 0b10101010;

        assertEquals(-1, ~a);
        assertEquals(a, ~b);
        assertEquals(-86, ~c);
        assertEquals(c, ~d);

    }

    @Test
    public void bitWiseAnd() {
        byte a = (byte) 0b00000000;
        byte b = (byte) 0b11111111;
        byte c = (byte) 0b01010101;
        byte d = (byte) 0b10101010;

        assertEquals(0, a & b);
        assertEquals(0, b & a);
        assertEquals(0, c & d);
        assertEquals(0, d & c);
    }

    @Test
    public void bitWiseOr() {
        byte a = (byte) 0b00000000;
        byte b = (byte) 0b11111111;
        byte c = (byte) 0b01010101;
        byte d = (byte) 0b10101010;

        assertEquals(-1, a | b);
        assertEquals(-1, b | a);
        assertEquals(-1, c | d);
        assertEquals(-1, d | c);
    }

    @Test
    public void bitWiseXor() {
        byte a = (byte) 0b00000000;
        byte b = (byte) 0b11111111;
        byte c = (byte) 0b01010101;
        byte d = (byte) 0b10101010;

        assertEquals(b, a ^ b);
        assertEquals(a, a ^ a);
        assertEquals(a, b ^ b);
        assertEquals(a, c ^ c);
        assertEquals(a, d ^ d);
        assertEquals(b, b ^ a);
        assertEquals(b, c ^ d);
        assertEquals(b, d ^ c);
    }

    @Test
    public void leftShift() {
        byte a = (byte) 0b00000000;
        byte b = (byte) 0b11111111;
        byte c = (byte) 0b01010101;
        byte d = (byte) 0b10101010;

        assertEquals(0b00000000, a << 1);
        assertEquals(0b11111110, b << 1);
        assertEquals(0b10101010, c << 1);
        assertEquals(0b01010100, d << 1);
    }

    @Test
    public void rightShift() {
        byte a = (byte) 0b00000000;
        byte b = (byte) 0b11111111;
        byte c = (byte) 0b01010101;
        byte d = (byte) 0b10101010;

        assertEquals(0b00000000, a >> 1);
        assertEquals(0b01111111, b >> 1);
        assertEquals(0b00101010, c >> 1);
        assertEquals(0b11010101, d >> 1);
    }

    @Test
    public void unsignedRightShift() {
        byte a = (byte) 0b00000000;
        byte b = (byte) 0b11111111;
        byte c = (byte) 0b01010101;
        byte d = (byte) 0b10101010;

        assertEquals(0b00000000, a >>> 1);
        assertEquals(0b01111111, b >>> 1);
        assertEquals(0b00101010, c >>> 1);
        assertEquals(0b11010101, d >>> 1);
    }
}
