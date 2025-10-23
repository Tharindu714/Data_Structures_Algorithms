package com.tharindu.Data.Structure.Tree.Binary.INORDER;

public class Inorder_Example_02 {
    public static void main(String[] args) {
        Binary BTree = new Binary();

        int[] arr = {10,5,15,3,7,12,17,1,4,6,8};
        BTree.root = BTree.buildTree(arr);

        System.out.println("Inorder Traversal of the binary tree:");
        BTree.InorderTraversal(BTree.root);
    }
}


