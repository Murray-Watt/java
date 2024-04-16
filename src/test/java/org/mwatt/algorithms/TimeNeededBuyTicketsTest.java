package org.mwatt.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TimeNeededBuyTicketsTest {

    @Test
    public void generalTest() {
        TimeNeededBuyTickets solution = new TimeNeededBuyTickets();
        int[] tickets = {1, 2, 3, 4, 5};
        int k = 3;
        int expected = 6;
        int result = solution.timeRequiredToBuy(tickets, k);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testCase231() {
        TimeNeededBuyTickets solution = new TimeNeededBuyTickets();
        int[] tickets = {1};
        int k = 1;
        int expected = 1;
        int result = solution.timeRequiredToBuy(tickets, k);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void extremeTest() {
        TimeNeededBuyTickets solution = new TimeNeededBuyTickets();
        int[] tickets = {100, 100, 1, 1, 1, 1, 1, 1};
        int k = 2;
        int expected = 5;
        int result = solution.timeRequiredToBuy(tickets, k);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testCase1() {
        TimeNeededBuyTickets solution = new TimeNeededBuyTickets();
        int[] tickets = {2, 3, 2};
        int k = 1;
        int expected = 2;
        int result = solution.timeRequiredToBuy(tickets, k);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testCase2() {
        TimeNeededBuyTickets solution = new TimeNeededBuyTickets();
        int[] tickets = {5, 1, 1, 1};
        int k = 2;
        int expected = 4;
        int result = solution.timeRequiredToBuy(tickets, k);
        Assertions.assertEquals(expected, result);
    }
}
