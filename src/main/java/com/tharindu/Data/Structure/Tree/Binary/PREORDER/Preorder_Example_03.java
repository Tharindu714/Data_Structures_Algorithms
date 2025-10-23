package com.tharindu.Data.Structure.Tree.Binary.PREORDER;

public class Preorder_Example_03 {
    public static void main(String[] args) {
        BinaryPre BTree = new BinaryPre();

        int[] arr = {10, 20, 40, 80, 50, 90, 30, 60, 70};
        //Constructing the following tree
        //          10
        //        /    \
        //      20      30
        //     /  \    /  \
        //   40    50 60   70
        //  /      /
        // 80     90
        BTree.root = BTree.buildTree(arr);

        System.out.println("PreOrder Traversal of the binary tree:");
        BTree.PreorderTraversal(BTree.root);
    }
}


