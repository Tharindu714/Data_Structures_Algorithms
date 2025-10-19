package com.tharindu.Data.Structure.Tree.Binary.Inorder_Example1;

import com.tharindu.Data.Structure.Tree.Binary.Node;

public class Binary_simple {
    Node root;

    public void InorderTraversal(Node node) {
        if (node == null) {
            return;
        }
        InorderTraversal(node.left);
        System.out.print(node.data + " ");
        InorderTraversal(node.right);
    }
}
