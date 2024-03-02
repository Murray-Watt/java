package org.mwatt.tutorial.operators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings({"ConstantValue", "PointlessBitwiseExpression"})
public class LogicalOperatorsTest {
    @Test
    public void bitWiseNegate() {
        byte a = 0b00000000;
        byte b = (byte) -1;
        byte c = 0b01010101;
        byte d = (byte) 0b10101010;

        assertEquals(-1, ~a);
        assertEquals(a, ~b);
        assertEquals(-86, ~c);
        assertEquals(c, ~d);

    }

    @Test
    public void bitWiseAnd() {
        byte a = 0b00000000;
        byte b = (byte) 0b11111111;
        byte c = 0b01010101;
        byte d = (byte) 0b10101010;

        assertEquals(0, a & b);
        assertEquals(0, b & a);
        assertEquals(0, c & d);
        assertEquals(0, d & c);
    }

    @Test
    public void bitWiseOr() {
        byte a = 0b00000000;
        byte b = (byte) 0b11111111;
        byte c = 0b01010101;
        byte d = (byte) 0b10101010;

        assertEquals(-1, a | b);
        assertEquals(-1, b | a);
        assertEquals(-1, c | d);
        assertEquals(-1, d | c);
    }

    @Test
    public void bitWiseXor() {
        byte a = 0b00000000;
        byte b = (byte) 0b11111111;
        byte c = 0b01010101;
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
        byte a = 0b00000000;
        byte b = -1;
        byte c = 0b01010101;
        byte d = (byte) 0b10101010;
        int cResult = -86;
        int dResult = 84;

        assertEquals(0, a << 1);
        assertEquals(-2, b << 1);
        assertEquals(cResult,(byte) (c << 1));
        assertEquals(dResult,(byte) (d << 1));
    }

    @Test
    public void rightShift() {
        byte a = 0;
        byte b = (byte) -1;
        byte c = 0b01010101;
        byte d = (byte) 0b10101010;

        assertEquals(0, a >> 1);
        assertEquals(-1, (b >> 1));
        assertEquals(0b00101010, c >> 1);
        assertEquals(-43, d >> 1);
    }

    @Test
    public void unsignedRightShift() {
        byte a = 0;
        byte b = (byte) -1;
        byte c = 0b01010101;
        byte d = (byte) 0b10101010;
        int bResult = 2147483647;
        int dResult = 2147483605;

        assertEquals(0, a >>> 1);
        assertEquals(bResult, b >>> 1);
        assertEquals(0b00101010, c >>> 1);
        assertEquals(dResult, d >>> 1);
    }
}
