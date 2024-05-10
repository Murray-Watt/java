package org.mwatt.algorithms.lists;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AddTwoNumbersTest {
    @Test
    public void testAddTwoNumbers1() {
        ListNode l1 = createListNode(2, 4, 3);
        ListNode l2 = createListNode(5, 6, 4);
        ListNode expected = createListNode(7, 0, 8);
        ListNode actual = AddTwoNumbers.addTwoNumbers(l1, l2);
        assertEquals(expected, actual);
    }

    @Test
    public void testAddTwoNumbers2() {
        ListNode l1 = createListNode(0);
        ListNode l2 = createListNode(0);
        ListNode expected = createListNode(0);
        ListNode actual = AddTwoNumbers.addTwoNumbers(l1, l2);
        assertEquals(expected, actual);
    }

    @Test
    public void testAddTwoNumbers3() {
        ListNode l1 = createListNode(9,9,9,9,9,9,9);
        ListNode l2 = createListNode(9,9,9,9);
        ListNode expected = createListNode(8,9,9,9,0,0,0,1);
        ListNode actual = AddTwoNumbers.addTwoNumbers(l1, l2);
        assertEquals(expected, actual);
    }

    private static ListNode createListNode(int... values) {
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        for (int value : values) {
            prev.next = new ListNode(value);
            prev = prev.next;
        }

        return dummy.next;
    }
}