package org.mwatt.algorithms.trees;
import java.util.*;

public  class VerticalOrderTraversal {
    List<List<Integer>> traverse(TreeNode root) {
        // Check if the root is null, return an empty list if so
        if (root == null) {
            return new LinkedList<>();
        }

        // Map to store columns and their corresponding nodes
        Map<Integer, List<Integer>> cols = new HashMap<>();
        // Queue for level-order traversal
        Queue<TreeNode> queue = new LinkedList<>();
        // Queue to keep track of the column indices of nodes
        Queue<Integer> colIndices = new LinkedList<>();

        // Initialize the queue and column index queue with the root node and column index 0
        queue.add(root);
        colIndices.add(0);

        // Variables to keep track of the minimum and maximum column indices
        int minCol = 0;
        int maxCol = 0;

        // Perform level-order traversal
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            //noinspection DataFlowIssue
            int colIndex = colIndices.poll();

            // Add the node value to the corresponding column list in the map
            cols.computeIfAbsent(colIndex, _ -> new LinkedList<>()).add(node.val);

            // Process the left child
            if (node.left != null) {
                queue.add(node.left);
                colIndices.add(colIndex - 1);
                minCol = Math.min(minCol, colIndex - 1);
            }

            // Process the right child
            if (node.right != null) {
                queue.add(node.right);
                colIndices.add(colIndex + 1);
                maxCol = Math.max(maxCol, colIndex + 1);
            }
        }

        // Construct the result list from the map
        List<List<Integer>> result = new ArrayList<>();
        for (int i = minCol; i <= maxCol; i++) {
            if (cols.containsKey(i)) {
                result.add(cols.get(i));
            }
        }

        return result;
    }
}