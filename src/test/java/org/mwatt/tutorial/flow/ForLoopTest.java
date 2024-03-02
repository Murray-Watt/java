package org.mwatt.tutorial.flow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ForLoopTest {
    @Test
    public void basicForLoop() {
        int a = 0;
        int b = 10;

        for (int i = 0; i < b; i++) {
            System.out.println("a is less than b");
            a++;
        }

        assert a == 10;
    }

    @Test
    public void forLoopBreak() {
        int a = 0;
        int b = 10;

        for (int i = 0; i < b; i++) {
            System.out.println("a is less than b");
            a++;
            if (a == 5) {
                break;
            }
        }

        assertEquals(a,5);
    }

    @Test
    public void forLoopWithContinue() {
        int a = 0;
        int b = 10;

        for (int i = 0; i < b; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("a is less than b");
            a++;
        }

        assertEquals(5, a);
    }

    @Test
    public void forLoopWithReturn() {
        int a = 0;
        int b = 10;

        for (int i = 0; i < b; i++) {
            if (i == 5) {
                return;
            }
            System.out.println("a is less than b");
            assertTrue(a < 5);
            a++;
        }

        fail();
    }

    @Test
    public void forLoopWithMultipleVariables() {
        int a = 0;
        int b = 10;
        int c = 20;

        for (int i = 0, j = 0; i < b && j < c; i++, j++) {
            System.out.println("a is less than b");
            a++;
        }

        assertEquals(10, a);
    }
}
