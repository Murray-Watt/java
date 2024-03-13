package org.mwatt.algorithms.trees;

import java.util.*;

public class TreeTraversalPostOrder {

    // Recursive post-order traversal
    public static List<Integer> TraversalRecursive(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        TraversalRecursive(root, result);
        return result;
    }

    private static void TraversalRecursive(TreeNode node, List<Integer> result) {
        if (node != null) {
            TraversalRecursive(node.left, result);
            TraversalRecursive(node.right, result);
            result.add(node.val);
        }
    }

    // Iterative post-order traversal
    public static List<Integer> TraversalIterative(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        Deque<Integer> output = new LinkedList<>();

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            output.push(node.val);

            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }

        while (!output.isEmpty()) {
            result.add(output.pop());
        }

        return result;
    }
}
