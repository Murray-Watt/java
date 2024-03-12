package org.mwatt.tutorial.streams;

import org.junit.jupiter.api.Test;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryOperatorsTest {
        @Test
        public void performSameTypeOperationWithBinaryOperator() {
            BinaryOperator<Integer> add = Integer::sum;
            assertEquals(Integer.valueOf(5), add.apply(2, 3));
        }

        @Test
        public void applyIntBinaryOperation() {
            IntBinaryOperator multiply = (a, b) -> a * b;
             assertEquals(12, multiply.applyAsInt(3, 4));
        }

        @Test
        public void applyLongBinaryOperation() {
            LongBinaryOperator subtract = (a, b) -> a - b;
             assertEquals(Long.valueOf(5L), subtract.applyAsLong(10L, 5L));
        }

        @Test
        public void applyDoubleBinaryOperation() {
            DoubleBinaryOperator divide = (a, b) -> a / b;
            assertEquals(2.5, divide.applyAsDouble(5.0, 2.0));
        }
}
