package org.mwatt.algorithms.lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ReverseLinkedListTest {
    @Test
    void reverseLinkedListReversesList() {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Reverse the linked list
        ListNode reversedHead = reverseLinkedList.reverse(head);

        // Check the reversed linked list: 5 -> 4 -> 3 -> 2 -> 1
        assertEquals(5, reversedHead.val);
        assertEquals(4, reversedHead.next.val);
        assertEquals(3, reversedHead.next.next.val);
        assertEquals(2, reversedHead.next.next.next.val);
        assertEquals(1, reversedHead.next.next.next.next.val);
        assertNull(reversedHead.next.next.next.next.next);
    }
}