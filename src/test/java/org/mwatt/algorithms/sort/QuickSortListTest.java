package org.mwatt.algorithms.sort;

import org.junit.jupiter.api.Test;
import org.mwatt.algorithms.lists.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@SuppressWarnings("ConstantValue")
class QuickSortListTest {
    @Test
    public void sortListEmptyList() {
        ListNode head = null;
        ListNode result = QuickSortList.sortList(head);
        assertNull(result);
    }

    @Test
    public void sortListSingleNodeList() {
        ListNode head = new ListNode(5);
        ListNode result = QuickSortList.sortList(head);
        assertEquals(new ListNode(5), result);
    }

    @Test
    public void sortListAscendingOrderList() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);
        expected.next.next = new ListNode(3);

        ListNode result = QuickSortList.sortList(head);
        assertEquals(result, expected);
    }
}