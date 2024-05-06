package org.mwatt.algorithms.sort;

import org.mwatt.algorithms.lists.ListNode;

public class QuickSortList {

    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        int[] values = getValues(head);

        quickSort(values, 0, values.length - 1);

        return createList(values);
    }

    private static ListNode createList(int[] values) {
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }

        return head;
    }

    private static void quickSort(int[] values, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(values, left, right);
            quickSort(values, left, partitionIndex - 1);
            quickSort(values, partitionIndex + 1, right);
        }
    }

    private static int partition(int[] values, int left, int right) {
        if (left == right) {
            return left;
        }

        int pivotIndex = left + (int) (Math.random() * (right - left + 1));
        int temp = values[pivotIndex];
        values[pivotIndex] = values[right];
        values[right] = temp;

        int slow = left - 1;
        int pivot = values[right];
        for (int j = left; j < right; j++) {
            if (values[j] < pivot) {
                slow++;
                temp = values[slow];
                values[slow] = values[j];
                values[j] = temp;
            }
        }

        temp = values[slow + 1];
        values[slow + 1] = values[right];
        values[right] = temp;
        return slow + 1;
    }

    private static int[] getValues(ListNode head) {
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }

        int[] values = new int[length];
        current = head;
        int i = 0;
        while (current != null) {
            values[i] = current.val;
            i++;
            current = current.next;
        }

        return values;
    }
}











