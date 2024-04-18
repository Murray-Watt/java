package org.mwatt.algorithms.sort;

import org.junit.jupiter.api.Test;
import org.mwatt.algorithms.lists.ListNode;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("ConstantValue")
class MergeSortListTest {
    @Test
    public void mergeSortListEmptyLists() {
        ListNode left = null;
        ListNode right = null;
        ListNode expected = null;

        ListNode result = MergeSortList.merge(left, right);

        assertEquals(expected, result);
    }

    @Test
    public void mergeSortListRightListEmpty() {
        ListNode left = new ListNode(1);
        ListNode right = null;
        ListNode expected = new ListNode(1);

        ListNode result = MergeSortList.merge(left, right);

        assertEquals(expected, result);
    }

    @Test
    public void mergeSortListLeftListEmpty() {
        ListNode left = null;
        ListNode right = new ListNode(2);
        ListNode expected = new ListNode(2);

        ListNode result = MergeSortList.merge(left, right);

        assertEquals(expected, result);
    }

    @Test
    public void sortListEmptyList() {
        ListNode head = null;
        ListNode result = MergeSortList.sortList(head);
        assertNull(result);
    }

    @Test
    public void sortListSingleNodeList() {
        ListNode head = new ListNode(5);
        ListNode result = MergeSortList.sortList(head);
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

        ListNode result = MergeSortList.sortList(head);
        assertEquals(result, expected);
    }

    @Test
    public void sortListEmptyListIterative() {
        ListNode head = null;

        ListNode result = MergeSortList.sortListIterative(head);

        assertNull(result);
    }

    @Test
    public void sortListSingleNodeListIterative() {
        ListNode head = new ListNode(5);

        ListNode result = MergeSortList.sortList(head);

        assertEquals(new ListNode(5), result);
    }

    @Test
    public void sortListTwoElementsIterative() {
        ListNode head = new ListNode(2);
        head.next = new ListNode(1);

        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);

        ListNode result = MergeSortList.sortListIterative(head);
        assertEquals(result, expected);
    }

    @Test
    public void sortListAscendingOrderListIterative() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);
        expected.next.next = new ListNode(3);

        ListNode result = MergeSortList.sortListIterative(head);
        assertEquals(result, expected);
    }

    @Test
    public void sortListListIterative() {
        ListNode temp = new ListNode(4);
        ListNode head = temp;

        temp.next = new ListNode(5);
        temp = temp.next;
        temp.next = new ListNode(12);
        temp = temp.next;
        temp.next = new ListNode(13);
        temp = temp.next;
        temp.next = new ListNode(11);
        temp = temp.next;
        temp.next = new ListNode(1);
        temp = temp.next;
        temp.next = new ListNode(111);
        temp = temp.next;
        temp.next = new ListNode(16);



        ListNode expected = new ListNode(1);
        temp = expected;
        temp.next = new ListNode(4);
        temp = temp.next;
        temp.next = new ListNode(5);
        temp = temp.next;
        temp.next = new ListNode(11);
        temp = temp.next;
        temp.next = new ListNode(12);
        temp = temp.next;
        temp.next = new ListNode(13);
        temp = temp.next;
        temp.next = new ListNode(16);
        temp = temp.next;
        temp.next = new ListNode(111);

        ListNode result = MergeSortList.sortListIterative(head);
        assertEquals(result, expected);
    }
}