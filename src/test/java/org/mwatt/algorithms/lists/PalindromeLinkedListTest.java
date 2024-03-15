package org.mwatt.algorithms.lists;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeLinkedListTest {

    @Test
    void isPalindrome() {
        PalindromeLinkedList pll = new PalindromeLinkedList();
        // Test palindrome list: 1 -> 2 -> 3 -> 2 -> 1
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(2);
        head1.next.next.next.next = new ListNode(1);
        assertTrue(pll.isPalindrome(head1));

        // Test non-palindrome list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = new ListNode(5);
        assertFalse(pll.isPalindrome(head2));
    }

    @Test
    void isPalindromeFast() {
        PalindromeLinkedList pll = new PalindromeLinkedList();
        // Test palindrome list: 1 -> 2 -> 3 -> 2 -> 1
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(2);
        head1.next.next.next.next = new ListNode(1);
        assertTrue(pll.isPalindromeFast(head1));

        // Test non-palindrome list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = new ListNode(5);
        assertFalse(pll.isPalindromeFast(head2));
    }

    private ListNode generateLargePalindrome() {
        // Generate a large palindrome list for performance testing
        ListNode head = new ListNode(0);
        ListNode current = head;
        for (int i = 1; i < 100000; i++) {
            current.next = new ListNode(i);
            current = current.next;
        }
        current.next = reverseList(head);
        return head;
    }

    @SuppressWarnings("SameParameterValue")
    private List<ListNode> generateLargePalindromeList(int size) {
        List<ListNode> palindromes = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            palindromes.add(generateLargePalindrome());
        }

        return palindromes;
    }

    @Test
    void performanceTest() {

        PalindromeLinkedList pll = new PalindromeLinkedList();
        List<ListNode> palindromes = generateLargePalindromeList(100000);

        long start = System.currentTimeMillis();
        for (ListNode head : palindromes) {
            pll.isPalindrome(head);
        }
        long end = System.currentTimeMillis();
        System.out.println("Total time taken for isPalindrome: " + (end - start) + "ms");

        start = System.currentTimeMillis();
        for (ListNode head : palindromes) {
            pll.isPalindromeFast(head);
        }
        end = System.currentTimeMillis();
        System.out.println("Total time taken for isPalindromeFast: " + (end - start) + "ms");
    }

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
}
