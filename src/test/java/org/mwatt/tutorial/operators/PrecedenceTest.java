package org.mwatt.tutorial.operators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrecedenceTest{
    @Test
    public void pretheseExamples() {
        int result = (31 / 2 + 1) + 2;
        System.out.println("result = " + result);
        assertEquals(18, result);

        result = 31 / (2 + 1) + 2;
        System.out.println("result = " + result);
        assertEquals(12, result);

        double dresult = 31 / (2 + 1.0) + 2;
        System.out.println("dresult = " + dresult);
        assertEquals(13.333333333333334, dresult);
    }
}
