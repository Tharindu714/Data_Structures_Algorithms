package com.tharindu.Data.Structure.Tree.Binary.Inorder_Example4;

import com.tharindu.Data.Structure.Tree.Binary.Binary;

public class Main {
    public static void main(String[] args) {
        Binary BTree = new Binary();

        int[] arr = {8, 4, 12, 2, 6, 10, 14, 2, 7, -1, -1, 9, 11, -1, 15};
        BTree.root = BTree.buildTree(arr);

        System.out.println("Inorder Traversal of the binary tree:");
        BTree.InorderTraversal(BTree.root);
    }
}


