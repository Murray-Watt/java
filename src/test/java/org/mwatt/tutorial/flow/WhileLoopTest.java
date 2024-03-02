package org.mwatt.tutorial.flow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings({"ConstantValue", "unused"})
public class WhileLoopTest {
    @Test
    public void basicWhileLoopBasic() {
        int a = 0;
        int b = 10;

        while (a < b) {
            System.out.println("a is less than b");
            a++;
        }

        assertEquals(10, a);
    }

    @Test
    public void whileLoopBreak() {
        int a = 0;
        int b = 10;

        while (a < b) {
            System.out.println("a is less than b");
            a++;
            if (a == 5) {
                break;
            }
        }

        assertEquals(5, a);
    }

    @Test
    public void dangerousBooleanWhileLoop() {
        boolean a = true;
        int b = 10;

        while (a) {
            System.out.println("a is true");
            b--;
            if (b == 5) {
                a = false;
            }
        }

        assertEquals(5, b);
    }

    @Test
    public void whileLoopWithContinue() {
        int a = 0;
        int b = 10;

        while (a < b) {
            a++;
            if (a % 2 == 0) {
                continue;
            }
            assertTrue(a % 2 != 0);
            System.out.println("a is odd");
        }

        assertEquals(10, a);
    }

    private void whileLoopWithReturn() {
        int a = 0;
        int b = 10;

        while (a < b) {
            a++;
            if (a == 5) {
                return;
            }
        }

        fail();
    }


    @Test
    public void nestedWhileLoops() {
        int a = 0;
        int b = 10;
        int c = 20;

        while (a < b) {
            System.out.println("a is less than b");
            a++;
            while (a < c) {
                System.out.println("a is less than c");
                a++;
            }
        }

        assertEquals(20, a);
    }
}
