package org.mwatt.algorithms.lists;

public class PalindromeLinkedList {
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }


    public boolean isPalindrome(ListNode head) {
        // Find the length of the linked list
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }

        // Find the midpoint node
        int mid = length / 2;
        current = head;
        for (int i = 0; i < mid; i++) {
            current = current.next;
        }

        // Reverse the second half of the linked list
        ListNode secondHalf = reverseList(current);

        // Compare the first half with the reversed second half
        ListNode p1 = head;
        ListNode p2 = secondHalf;
        for (int i = 0; i < mid; i++) {
            if (p1.val != p2.val) {
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        return true;
    }

    public boolean isPalindromeFast(ListNode head) {
        if (head == null || head.next == null) {
            return true; // An empty list or a single node list is a palindrome
        }

        // Find the midpoint using slow and fast pointers
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half of the linked list
        ListNode secondHalf = reverseList(slow.next);
        slow.next = null; // Break the original list into two halves

        // Compare the two halves
        ListNode p1 = head;
        ListNode p2 = secondHalf;
        while (p1 != null && p2 != null) {
            if (p1.val != p2.val) {
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        // Reconstruct the original linked list (optional)
        slow.next = reverseList(secondHalf);

        return true;
    }
}
