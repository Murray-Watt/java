package org.mwatt.algorithms.trees;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class ValidateBinaryTree {
    public static boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        int[] parents = new int[n];
        int aNode = -1;

        Arrays.fill(parents, -1);

        if (n == 1) {
            return (leftChild[0] == -1) && (rightChild[0] == -1);
        }

        for (int i=0; i < n; i++) {
            int lc = leftChild[i];

            if (lc != -1) {
                if (parents[lc] != -1) {
                    return false;
                }

                parents[lc] = i;
                if (aNode == -1) {
                    aNode = i;
                }
            }

            int rc = rightChild[i];

            if (rc != -1) {
                if (parents[rc] != -1) {
                    return false;
                }

                parents[rc] = i;
                if (aNode == -1) {
                    aNode = i;
                }
            }
        }

        int root = aNode;
        int depth = 1;

        while (parents[root] != -1) {
            depth++;
            if (depth > n) {
                return false;
            }

            root = parents[root];
        }

        Deque<Integer> stack = new LinkedList<>();
        stack.push(root);

        boolean[] seen = new boolean[n];
        seen[root] = true;
        int totalSeen = 1;

        Arrays.fill(seen, false);

        seen[root] = true;

        while(!stack.isEmpty()) {
            int current = stack.pop();

            int lc = leftChild[current];

            if (lc != -1) {
                if (lc >= n || lc < 0 || seen[lc]) {
                    return false;
                }

                seen[lc] = true;
                totalSeen++;
                stack.push(lc);
            }

            int rc = rightChild[current];

            if (rc != -1) {
                if (rc >= n || rc < 0 || seen[rc]) {
                    return false;
                }

                seen[rc] = true;
                totalSeen++;
                stack.push(rc);
            }
        }



        return totalSeen == n;
    }
}
