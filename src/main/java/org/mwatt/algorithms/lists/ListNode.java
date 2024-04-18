package org.mwatt.algorithms.lists;

import lombok.Data;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int val) { this.val = val; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        ListNode other = (ListNode) obj;

        // Compare the values
        if (this.val != other.val) {
            return false;
        }

        // Compare the next nodes recursively
        return (this.next == null && other.next == null) ||
                (this.next != null && this.next.equals(other.next));
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = 31 * hash + this.val;

        // Recursively calculate the hash code for the next node
        if (this.next != null) {
            hash = 31 * hash + this.next.hashCode();
        }

        return hash;
    }
}
