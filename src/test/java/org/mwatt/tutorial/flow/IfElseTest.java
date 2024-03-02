package org.mwatt.tutorial.flow;

import com.sun.net.httpserver.Authenticator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class IfElseTest {
    @Test
    public void ifStatement() {
        int a = 10;
        int b = 20;

        if (a < b) {
            System.out.println("a is less than b");
        }

        if (a > b) {
            fail();
        }
    }

    @Test
    public void ifElse() {
        int a = 10;
        int b = 20;

        if (a < b) {
            System.out.println("a is less than b");
        } else {
            System.out.println("a is greater than or equal to b");
            fail();
        }
    }

    @Test
    public void ifElseIfElse() {
        int a = 10;
        int b = 20;

        if (a < b) {
            System.out.println("a is less than b");
        } else if (a > b) {
            fail();
        } else {
            System.out.println("a is equal to b");
        }
    }

    @Test
    public void nestedIfElse() {
        int a = 10;
        int b = 20;
        int c = 30;

        if (a < b) {
            System.out.println("a is less than b");
            if (b < c) {
                System.out.println("b is less than c");
            } else {
                fail();
            }
        } else {
            fail();
        }
    }

    @Test
    public void simpleIfElse() {
        int a = 10;
        int b = 20;

        if (a < b)
            System.out.println("a is less than b");
        else
            fail();
    }
}
