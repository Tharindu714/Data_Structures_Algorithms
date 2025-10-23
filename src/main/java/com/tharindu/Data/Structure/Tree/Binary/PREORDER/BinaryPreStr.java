package com.tharindu.Data.Structure.Tree.Binary.PREORDER;

public class BinaryPreStr {
    public NodeStr root;
    private int index = 0; // Keep track of position in a preorder array

    // Build a tree from preorder array where "-1" means null
    public NodeStr buildTree(String[] values) {
        if (index >= values.length || values[index].equals("-1")) {
            index++;
            return null;
        }

        NodeStr newNode = new NodeStr(values[index]);
        index++;

        newNode.left = buildTree(values);  // Build left subtree
        newNode.right = buildTree(values); // Build right subtree

        return newNode;
    }

    // ✅ Preorder Traversal: Root → Left → Right
    public void PreorderTraversal(NodeStr node) {
        if (node != null) {
            System.out.print(node.data + " ");
            PreorderTraversal(node.left);
            PreorderTraversal(node.right);
        }
    }
}
