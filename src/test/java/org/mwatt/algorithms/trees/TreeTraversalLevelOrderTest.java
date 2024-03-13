package org.mwatt.algorithms.trees;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TreeTraversalLevelOrderTest {

    @Test
    public void traverseLevelOrderRecursively() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<List<Integer>> result = TreeTraversalLevelOrder.traversalRecursive(root);

        // Expected result: [[1], [2], [3]]
        assertEquals(List.of(List.of(1), List.of(2), List.of(3)), result);
    }

    @Test
    public void traverseLevelOrderIteratively() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<List<Integer>> result = TreeTraversalLevelOrder.traversalIterative(root);

        // Expected result: [[1], [2], [3]]
        assertEquals(List.of(List.of(1), List.of(2), List.of(3)), result);
    }

    @SuppressWarnings("ConstantValue")
    @Test
    public void traverseLevelOrderEmptyTree() {
        TreeNode root = null;

        List<List<Integer>> result = TreeTraversalLevelOrder.traversalRecursive(root);

        // Expected result: []
        assertEquals(List.of(), result);
    }

    @Test
    public void traverseLevelOrderSingleNodeTree() {
        TreeNode root = new TreeNode(1);

        List<List<Integer>> result = TreeTraversalLevelOrder.traversalRecursive(root);

        // Expected result: [[1]]
        assertEquals(List.of(List.of(1)), result);
    }

    @Test
    public void traverseLevelOrderLeftSkewedTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);

        List<List<Integer>> result = TreeTraversalLevelOrder.traversalRecursive(root);

        // Expected result: [[1], [2], [3], [4]]
        assertEquals(List.of(List.of(1), List.of(2), List.of(3), List.of(4)), result);
    }

    @Test
    public void traverseLevelOrderRightSkewedTree() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);

        List<List<Integer>> result = TreeTraversalLevelOrder.traversalRecursive(root);

        // Expected result: [[1], [2], [3], [4]]
        assertEquals(List.of(List.of(1), List.of(2), List.of(3), List.of(4)), result);
    }
}
