package com.tharindu.Data.Structure.Tree.Binary.PREORDER;

public class Preorder_Example_01 {
    public static void main(String[] args) {
        BinaryPre BTree = new BinaryPre();

        int[] arr = {1,2,4,8,9,5,3,7,6};
         // Constructing the following binary tree
         //         1
         //       /   \
         //      2     3
         //     / \   / \
         //    4   5 6   7
         //   / \
         //  8   9

        BTree.root = BTree.buildTree(arr);

        System.out.println("PreOrder Traversal of the binary tree:");
        BTree.PreorderTraversal(BTree.root);
    }
}


