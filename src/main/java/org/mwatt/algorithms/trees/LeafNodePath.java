package org.mwatt.algorithms.trees;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LeafNodePath {
    public List<String> binaryTreePaths(TreeNode root) {
        Deque<TreeNode> stack = new LinkedList<>();
        Deque<String> pathSoFar = new LinkedList<>();
        stack.push(root);
        pathSoFar.push(Integer.valueOf(root.val).toString());
        List<String> paths = new ArrayList<>();



        while(!stack.isEmpty()) {
            TreeNode current = stack.pop();
            String path = pathSoFar.pop();

            if (current.left == null && current.right == null) {
                paths.add(path);
            }

            if (current.left != null) {
                stack.push(current.left);
                pathSoFar.push(path+"->"+Integer.valueOf(current.left.val).toString());
            }

            if (current.right != null) {
                stack.push(current.right);
                pathSoFar.push(path+"->"+Integer.valueOf(current.right.val).toString());
            }
        }

        return paths;
    }
}
