package org.mwatt.algorithms.trees;

import java.util.*;

public class TreeTraversalInOrder {
    // Recursive in-order traversal
    public static List<Integer> traversalRecursive(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traversalRecursive(root, result);
        return result;
    }

    private static void traversalRecursive(TreeNode node, List<Integer> result) {
        if (node != null) {
            traversalRecursive(node.left, result);
            result.add(node.val);
            traversalRecursive(node.right, result);
        }
    }

    // Iterative in-order traversal
    public static List<Integer> traversalIterative(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            result.add(current.val);
            current = current.right;
        }

        return result;
    }
}