package com.tharindu.Data.Structure.Tree.BSTree;

public class BinarySearch {
    Node nodeRoot;

    public BinarySearch() {
        nodeRoot = null;
    }

    // This method mainly calls insertRec()
    public void insert(int key) {
        nodeRoot = insertRec(nodeRoot, key);
    }

    public Node insertRec(Node nodeRoot, int key) {
        // If the tree is empty, return a new node
        if (nodeRoot == null) {
            nodeRoot = new Node(key);
            return nodeRoot;
        }

        // Otherwise, recur down the tree
        if (key < nodeRoot.key) {
            nodeRoot.left = insertRec(nodeRoot.left, key);
        } else if (key > nodeRoot.key) {
            nodeRoot.right = insertRec(nodeRoot.right, key);
        }

        // Return the (unchanged) node pointer
        return nodeRoot;
    }

    //This method mainly calls SearchRec()
    public boolean search(int key) {
        return searchRec(nodeRoot, key);
    }

    public boolean searchRec(Node nodeRoot, int key) {
        // Base Cases: root is null or key is present at root
        if (nodeRoot == null) {
            return false;
        }
        if (nodeRoot.key == key) {
            return true;
        }

        // Key is greater than root's key
        if (key > nodeRoot.key) {
            return searchRec(nodeRoot.right, key);
        }

        // Key is smaller than root's key
        return searchRec(nodeRoot.left, key);
    }

    //This method mainly calls deleteRec()
    public void delete(int key) {
        nodeRoot = deleteRec(nodeRoot, key);
    }

    public Node deleteRec(Node nodeRoot, int key) {
        // Base Case: If the tree is empty
        if (nodeRoot == null) {
            return null;
        }

        // Otherwise, recur down the tree
        if (key < nodeRoot.key) {
            nodeRoot.left = deleteRec(nodeRoot.left, key);
        } else if (key > nodeRoot.key) {
            nodeRoot.right = deleteRec(nodeRoot.right, key);
        } else {
            // Node with only one child or no child
            if (nodeRoot.left == null)
                return nodeRoot.right;
            else if (nodeRoot.right == null)
                return nodeRoot.left;

            // Node with two children: Get the inorder successor (smallest in the right subtree)
            nodeRoot.key = minValue(nodeRoot.right);

            // Delete the inorder successor
            nodeRoot.right = deleteRec(nodeRoot.right, nodeRoot.key);
        }

        return nodeRoot;
    }

    public int minValue(Node node) {
        int minv = node.key;
        while (node.left != null) {
            minv = node.left.key;
            node = node.left;
        }
        return minv;
    }

    //This method mainly calls inorderRec()
    public void inorder() {
        inorderRec(nodeRoot);
    }

    public void inorderRec(Node nodeRoot) {
        if (nodeRoot != null) {
            inorderRec(nodeRoot.left);
            System.out.print(nodeRoot.key + " ");
            inorderRec(nodeRoot.right);
        }
    }

    //This method mainly calls preorderRec()
    public void preorder() {
        preorderRec(nodeRoot);
    }

    public void preorderRec(Node nodeRoot) {
        if (nodeRoot != null) {
            System.out.print(nodeRoot.key + " ");
            preorderRec(nodeRoot.left);
            preorderRec(nodeRoot.right);
        }
    }

    //This method mainly calls postorderRec()
    public void postorder() {
        postorderRec(nodeRoot);
    }

    public void postorderRec(Node nodeRoot) {
        if (nodeRoot != null) {
            postorderRec(nodeRoot.left);
            postorderRec(nodeRoot.right);
            System.out.print(nodeRoot.key + " ");
        }
    }
}
