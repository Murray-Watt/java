package org.mwatt.algorithms.trees;

import java.util.*;

public class TreeTraversalLevelOrder {

    // Recursive level-order traversal
    public static List<List<Integer>> traversalRecursive(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        traversalRecursive(root, 0, result);
        return result;
    }

    private static void traversalRecursive(TreeNode node, int level, List<List<Integer>> result) {
        if (node == null) {
            return;
        }

        if (level >= result.size()) {
            result.add(new ArrayList<>());
        }

        result.get(level).add(node.val);
        traversalRecursive(node.left, level + 1, result);
        traversalRecursive(node.right, level + 1, result);
    }


    public static List<List<Integer>> traversalIterative(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> levelNodes = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();

                if (node != null) {
                    levelNodes.add(node.val);
                }

                if (node != null && node.left != null) {
                    queue.offer(node.left);
                }
                if (node != null && node.right != null) {
                    queue.offer(node.right);
                }
            }
            result.add(levelNodes);
        }

        return result;
    }
}

