package com.tharindu.Data.Structure.Tree.Binary.INORDER.Inorder_Example1;

import com.tharindu.Data.Structure.Tree.Binary.INORDER.Node;

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
