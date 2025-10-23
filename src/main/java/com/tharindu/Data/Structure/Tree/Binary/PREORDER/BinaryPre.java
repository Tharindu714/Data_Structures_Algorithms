package com.tharindu.Data.Structure.Tree.Binary.PREORDER;

public class BinaryPre {
    public Node root;
    private int index = 0; // Keep track of position in a preorder array

    // Build a tree from a preorder array where -1 means null
    public Node buildTree(int[] values) {
        if (index >= values.length || values[index] == -1) {
            index++;
            return null;
        }

        Node newNode = new Node(values[index]);
        index++;

        newNode.left = buildTree(values);  // Build left subtree
        newNode.right = buildTree(values); // Build right subtree

        return newNode;
    }

    // ✅ Preorder Traversal: Root → Left → Right
    public void PreorderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            PreorderTraversal(node.left);
            PreorderTraversal(node.right);
        }
    }
}