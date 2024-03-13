package org.mwatt.algorithms.trees;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TreeTraversalPostOrderTest {

    @Test
    public void traversePostOrderRecursively() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> result = TreeTraversalPostOrder.TraversalRecursive(root);

        // Expected result: [3, 2, 1]
        assertEquals(List.of(3, 2, 1), result);
    }

    @Test
    public void traversePostOrderIteratively() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> result = TreeTraversalPostOrder.TraversalIterative(root);

        // Expected result: [3, 2, 1]
        assertEquals(List.of(3, 2, 1), result);
    }

    @Test
    public void traversePostOrderEmptyTree() {
        TreeNode root = null;

        List<Integer> result = TreeTraversalPostOrder.TraversalRecursive(root);

        // Expected result: []
        assertEquals(List.of(), result);
    }

    @Test
    public void traversePostOrderSingleNodeTree() {
        TreeNode root = new TreeNode(1);

        List<Integer> result = TreeTraversalPostOrder.TraversalRecursive(root);

        // Expected result: [1]
        assertEquals(List.of(1), result);
    }

    @Test
    public void traversePostOrderLeftSkewedTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);

        List<Integer> result = TreeTraversalPostOrder.TraversalRecursive(root);

        // Expected result: [4, 3, 2, 1]
        assertEquals(List.of(4, 3, 2, 1), result);
    }

    @Test
    public void traversePostOrderRightSkewedTree() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);

        List<Integer> result = TreeTraversalPostOrder.TraversalRecursive(root);

        // Expected result: [4, 3, 2, 1]
        assertEquals(List.of(4, 3, 2, 1), result);
    }
}
