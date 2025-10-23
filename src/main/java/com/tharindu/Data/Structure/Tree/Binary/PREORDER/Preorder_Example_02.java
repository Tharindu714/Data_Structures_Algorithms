package com.tharindu.Data.Structure.Tree.Binary.PREORDER;

public class Preorder_Example_02 {
    public static void main(String[] args) {
        BinaryPreStr BTree = new BinaryPreStr();

        String[] arr = {"X", "Y", "W", "Z", "V", "T", "-1", "-1", "-1", "U", "S", "Q", "-1", "-1", "-1", "R", "-1", "-1"};
        //Constructing the following tree
        //          X
        //        /    \
        //      Y       Z
        //     /       / \
        //   W         V  U
        //            /   / \
        //            T    S  R
        //                 /
        //                 Q

        BTree.root = BTree.buildTree(arr);

        System.out.println("PreOrder Traversal of the binary tree:");
        BTree.PreorderTraversal(BTree.root);
    }
}


