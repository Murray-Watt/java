package org.mwatt.algorithms.trees;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class TreeTraversalPreOrder {

    // Recursive pre-order traversal
    public static List<Integer> traversalRecursive(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traversalRecursive(root, result);
        return result;
    }

    private static void traversalRecursive(TreeNode node, List<Integer> result) {
        if (node != null) {
            result.add(node.val);
            traversalRecursive(node.left, result);
            traversalRecursive(node.right, result);
        }
    }

    // Iterative pre-order traversal
    public static List<Integer> traversalIterative(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            result.add(node.val);

            // Push right child first so that left child is processed first (LIFO order)
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }

        return result;
    }
}
