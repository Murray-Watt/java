package org.mwatt.algorithms.trees;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TreeTraversalInOrderTest {

    @Test
    public void traverseInOrderRecursively() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> result = TreeTraversalInOrder.traversalRecursive(root);

        // Expected result: [1, 3, 2]
        assertEquals(List.of(1, 3, 2), result);
    }

    @Test
    public void traverseInOrderIteratively() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> result = TreeTraversalInOrder.traversalIterative(root);

        // Expected result: [1, 3, 2]
        assertEquals(List.of(1, 3, 2), result);
    }

    @Test
    public void traverseInOrderEmptyTree() {
        TreeNode root = null;

        @SuppressWarnings("ConstantValue")
        List<Integer> result = TreeTraversalInOrder.traversalRecursive(root);

        // Expected result: []
        assertEquals(List.of(), result);
    }

    @Test
    public void traverseInOrderSingleNodeTree() {
        TreeNode root = new TreeNode(1);

        List<Integer> result = TreeTraversalInOrder.traversalRecursive(root);

        // Expected result: [1]
        assertEquals(List.of(1), result);
    }

    @Test
    public void traverseInOrderLeftSkewedTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);

        List<Integer> result = TreeTraversalInOrder.traversalRecursive(root);

        // Expected result: [4, 3, 2, 1]
        assertEquals(List.of(4, 3, 2, 1), result);
    }

    @Test
    public void traverseInOrderRightSkewedTree() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);

        List<Integer> result = TreeTraversalInOrder.traversalRecursive(root);

        // Expected result: [1, 2, 3, 4]
        assertEquals(List.of(1, 2, 3, 4), result);
    }
}
