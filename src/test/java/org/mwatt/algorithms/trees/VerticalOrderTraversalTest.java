package org.mwatt.algorithms.trees;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VerticalOrderTraversalTest {

    @Test
    public void constructVerticalOrder() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        VerticalOrderTraversal verticalNodes = new VerticalOrderTraversal();
        List<List<Integer>> result = verticalNodes.traverse(root);

        // Expected vertical order: [[9], [3, 15], [20], [7]]
        assertEquals(4, result.size());
        assertEquals(List.of(9), result.get(0));
        assertEquals(List.of(3, 15), result.get(1));
        assertEquals(List.of(20), result.get(2));
        assertEquals(List.of(7), result.get(3));
    }

    @Test
    public void constructVerticalOrderWithNullRoot() {
        VerticalOrderTraversal verticalOrderTraversal = new VerticalOrderTraversal();
        List<List<Integer>> result = verticalOrderTraversal.traverse(null);

        // Expected vertical order: []
        assertEquals(0, result.size());
    }

    @Test
    public void constructVerticalOrderWithSingleNode() {
        TreeNode root = new TreeNode(5);

        VerticalOrderTraversal verticalOrderTraversal = new VerticalOrderTraversal();
        List<List<Integer>> result = verticalOrderTraversal.traverse(root);

        // Expected vertical order: [[5]]
        assertEquals(1, result.size());
        assertEquals(List.of(5), result.getFirst());
    }
}