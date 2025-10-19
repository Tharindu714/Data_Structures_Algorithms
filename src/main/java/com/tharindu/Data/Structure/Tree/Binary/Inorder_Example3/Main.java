package com.tharindu.Data.Structure.Tree.Binary.Inorder_Example3;

import com.tharindu.Data.Structure.Tree.Binary.Binary;

public class Main {
    public static void main(String[] args) {
        Binary BTree = new Binary();

        int[] arr = {20, 10, 30, 5, 15, -1, 40, 2, 7, 12, 18, -1, 50};
        BTree.root = BTree.buildTree(arr);

        System.out.println("Inorder Traversal of the binary tree:");
        BTree.InorderTraversal(BTree.root);
    }
}


