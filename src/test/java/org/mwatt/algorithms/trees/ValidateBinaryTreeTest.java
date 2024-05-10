package org.mwatt.algorithms.trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidateBinaryTreeTest {
    @Test
    public void testValidateBinaryTreeNodes1() {
        int n = 6;
        int[] leftChild = {1, -1, -1, 4, -1, -1};
        int[] rightChild = {2, -1, -1, 5, -1, -1};
        boolean expected = false;
        boolean actual = ValidateBinaryTree.validateBinaryTreeNodes(n, leftChild, rightChild);
        assertEquals(expected, actual);
    }

    @Test
    public void testValidateBinaryTreeNodes2() {
        int n = 4;
        int[] leftChild = {1, -1, 3, -1};
        int[] rightChild = {2, 3, -1, -1};
        boolean expected = false;
        boolean actual = ValidateBinaryTree.validateBinaryTreeNodes(n, leftChild, rightChild);
        assertEquals(expected, actual);
    }

    @Test
    public void testValidateBinaryTreeNodes3() {
        int n = 2;
        int[] leftChild = {1, 0};
        int[] rightChild = {-1, -1};
        boolean expected = false;
        boolean actual = ValidateBinaryTree.validateBinaryTreeNodes(n, leftChild, rightChild);
        assertEquals(expected, actual);
    }

    @Test
    public void testValidateBinaryTreeNodes4() {
        int n = 6;
        int[] leftChild = {1, -1, -1, 4, -1, -1};
        int[] rightChild = {2, -1, -1, 5, -1, -1};
        boolean expected = false;
        boolean actual = ValidateBinaryTree.validateBinaryTreeNodes(n, leftChild, rightChild);
        assertEquals(expected, actual);
    }

    @Test
    public void testValidateBinaryTreeNodes5() {
        int n = 4;
        int[] leftChild = {3, -1, 1, -1};
        int[] rightChild = {-1, -1, 0, -1};
        boolean expected = true;
        boolean actual = ValidateBinaryTree.validateBinaryTreeNodes(n, leftChild, rightChild);
        assertEquals(expected, actual);
    }

    @Test
    public void testValidateBinaryTreeNodes6() {
        int n = 3;
        int[] leftChild = {-1, 2, -1};
        int[] rightChild = {-1, -1, -1};
        boolean expected = false;
        boolean actual = ValidateBinaryTree.validateBinaryTreeNodes(n, leftChild, rightChild);
        assertEquals(expected, actual);
    }
}