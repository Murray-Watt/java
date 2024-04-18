package org.mwatt.algorithms.sort;

import org.mwatt.algorithms.lists.ListNode;

public class MergeSortList {

    protected static class Split {
        ListNode left;
        ListNode right;
        ListNode remainder;
    }

    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode middle = getMiddle(head);

        ListNode left;
        ListNode right = middle.next;
        middle.next = null;

        left = sortList(head);
        right = sortList(right);

        return merge(left, right);
    }


    public static ListNode sortListIterative(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        int length = getLength(head);
        int size = 1;
        ListNode sorted = head;

        while (size < length) {
            ListNode unsorted = sorted;
            sorted = null;

            while (unsorted != null) {
                Split split = split(unsorted, size);

                unsorted = split.remainder;

                ListNode merged = merge(split.left,split.right);
                sorted = concat(sorted,merged);
            }

            head = sorted;
            size *= 2;
        }

        return head;
    }


    public static int getLength(ListNode head) {
        int length = 0;
        ListNode current = head;

        while (current != null) {
            length++;
            current = current.next;
        }

        return length;
    }

    protected static Split split(ListNode head, int n) {
        Split split = new Split();
        split.left = head;
        split.right = null;
        split.remainder = null;

        int nLeft = n;
        int nRight = n;

        if (head == null) {
            return split;
        }

        if (n == 0) {
            return split;
        }

        ListNode current = head;
        ListNode previous = null;

        while (nLeft > 0 && current != null) {
            previous = current;
            current = current.next;
            nLeft--;
        }

        if (previous != null) {
            previous.next = null;
        }

        split.right = current;

        while (nRight> 0 && current != null) {
            previous = current;
            current = current.next;
            nRight--;
        }

        if (previous != null) {
            previous.next = null;
        }

        split.remainder = current;

        return split;
    }

    public static ListNode getMiddle(ListNode head) {
        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static ListNode merge(ListNode left, ListNode right) {
        ListNode dummyHead = new ListNode(0);
        ListNode newTail = dummyHead;

        while (left != null && right != null) {
            if (left.val < right.val) {
                newTail.next = left;
                left = left.next;
            } else {
                newTail.next = right;
                right = right.next;
            }

            newTail.next.next = null;
            newTail = newTail.next;
        }

        newTail.next = (left != null) ? left : right;
        return dummyHead.next;
    }


    public static ListNode concat(ListNode head, ListNode tail) {
        if (head == null) {
            return tail;
        }

        ListNode current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = tail;
        return head;
    }
}
