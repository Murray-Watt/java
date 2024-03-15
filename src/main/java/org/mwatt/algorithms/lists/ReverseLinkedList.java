package org.mwatt.algorithms.lists;

public class ReverseLinkedList {
    /**
     * Reverses a linked list using the two-pointer method.
     *
     * @param head the head of the linked list to reverse
     * @return the head of the reversed linked list
     */
    public ListNode reverse(ListNode head) {
        // Initialize two pointers: prev to keep track of the previous node and current for the current node
        ListNode prev = null;
        ListNode current = head;

        // Iterate through the list until the current node is null
        while (current != null) {
            // Store the next node temporarily
            ListNode next = current.next;
            // Reverse the current node's pointer to point to the previous node
            current.next = prev;
            // Move prev and current one step forward in the list
            prev = current;
            current = next;
        }

        // After the loop, prev will point to the new head of the reversed list
        return prev;
    }
}
