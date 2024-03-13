package org.mwatt.algorithms.trees;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TreeTraversalPreOrderTest {

    @Test
    public void traversePreOrderRecursively() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> result = TreeTraversalPreOrder.traversalRecursive(root);

        // Expected result: [1, 2, 3]
        assertEquals(List.of(1, 2, 3), result);
    }

    @Test
    public void traversePreOrderIteratively() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> result = TreeTraversalPreOrder.traversalIterative(root);

        // Expected result: [1, 2, 3]
        assertEquals(List.of(1, 2, 3), result);
    }

    @Test
    public void traversePreOrderEmptyTree() {
        TreeNode root = null;

        List<Integer> result = TreeTraversalPreOrder.traversalRecursive(root);

        // Expected result: []
        assertEquals(List.of(), result);
    }

    @Test
    public void traversePreOrderSingleNodeTree() {
        TreeNode root = new TreeNode(1);

        List<Integer> result = TreeTraversalPreOrder.traversalRecursive(root);

        // Expected result: [1]
        assertEquals(List.of(1), result);
    }

    @Test
    public void traversePreOrderLeftSkewedTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);

        List<Integer> result = TreeTraversalPreOrder.traversalRecursive(root);

        // Expected result: [1, 2, 3, 4]
        assertEquals(List.of(1, 2, 3, 4), result);
    }

    @Test
    public void traversePreOrderRightSkewedTree() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);

        List<Integer> result = TreeTraversalPreOrder.traversalRecursive(root);

        // Expected result: [1, 2, 3, 4]
        assertEquals(List.of(1, 2, 3, 4), result);
    }
}
