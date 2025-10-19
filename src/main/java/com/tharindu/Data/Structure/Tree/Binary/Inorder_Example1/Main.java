package com.tharindu.Data.Structure.Tree.Binary.Inorder_Example1;

import com.tharindu.Data.Structure.Tree.Binary.Node;

public class Main {
    public static void main(String[] args) {
        Binary_simple binarySimpleTree = new Binary_simple();
        binarySimpleTree.root = new Node(1);
        binarySimpleTree.root.left = new Node(2);
        binarySimpleTree.root.right = new Node(3);
        binarySimpleTree.root.left.left = new Node(4);
        binarySimpleTree.root.left.right = new Node(5);
        binarySimpleTree.root.right.left = new Node(6);
        binarySimpleTree.root.right.right = new Node(7);

        System.out.println("Inorder Traversal of the binary tree:");
        binarySimpleTree.InorderTraversal(binarySimpleTree.root);
    }
}
