package com.tharindu.Data.Structure.Tree.Binary.INORDER;

public class Inorder_Example_05 {
    public static void main(String[] args) {
        Binary BTree = new Binary();

        int[] arr = {50, 25, 75, 10, 35, 60, 85, 5, 15, -1, 40, 55, 70, -1, -1, -1, -1, -1, -1, -1, -1, -1, 65, -1, -1};
        BTree.root = BTree.buildTree(arr);

        System.out.println("Inorder Traversal of the binary tree:");
        BTree.InorderTraversal(BTree.root);
    }
}


