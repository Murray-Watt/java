package org.mwatt.algorithms.lists;

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;

        while (carry != 0 || l1 != null || l2 != null) {
            int d1 = 0;
            if (l1 != null) {
                d1 = l1.val;
                l1 = l1.next;
            }

            int d2 = 0;
            if (l2 != null) {
                d2 = l2.val;
                l2 = l2.next;
            }

            int total = d1 + d2 + carry;
            carry = total / 10;
            int dr = total % 10;

            prev.next = new ListNode(dr);
            prev = prev.next;
        }

        return dummy.next;
    }
}
