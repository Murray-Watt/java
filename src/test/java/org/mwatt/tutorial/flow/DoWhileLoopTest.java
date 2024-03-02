package org.mwatt.tutorial.flow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoWhileLoopTest {
    @Test
    public void basicDoWhileLoop() {
        int a = 0;
        int b = 10;

        do {
            System.out.println("a is less than b");
            a++;
        } while (a < b);

        assertEquals(10, a);
    }

    @Test
    public void nestedDoWhileLoop() {
        int a = 0;
        int b = 10;
        int c = 20;

        do {
            System.out.println("a is less than b");
            a++;
            do {
                System.out.println("b is less than c");
                b++;
            } while (b < c);
        } while (a < b);

        assertEquals(10, a);
        assertEquals(20, b);

    }

    @Test
    public void doWhileLoopBreak() {
        int a = 0;
        int b = 10;

        do {
            System.out.println("a is less than b");
            a++;
            if (a == 5) {
                break;
            }
        } while (a < b);

        assertEquals(5, a);
    }
}
