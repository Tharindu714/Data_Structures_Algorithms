package com.tharindu.Data.Structure.Tree.BSTree;

public class Main {
    public static void main(String[] args) {
        BinarySearch bst = new BinarySearch();

        /* Let us create the following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */

        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        System.out.println("Inorder traversal of the given tree");
        bst.inorder();
        System.out.println("\n");

        System.out.println("Preorder traversal of the given tree");
        bst.preorder();
        System.out.println("\n");

        System.out.println("Postorder traversal of the given tree");
        bst.postorder();
        System.out.println("\n");

        // Search for a key
        int keyToSearch = 40;
        if (bst.search(keyToSearch)) {
            System.out.println("Searching key " + keyToSearch + " in the BST.......");
            System.out.println("Key " + keyToSearch + " found in the BST.");
        } else {
            System.out.println("Searching key " + keyToSearch + " in the BST.......");
            System.out.println("Key " + keyToSearch + " not found in the BST.");
        }

        // Delete a key
        int keyToDelete = 20;
        bst.delete(keyToDelete);
        System.out.println("Deleting key " + keyToDelete + " from the BST.......");
        System.out.println("Key " + keyToDelete + " deleted from the BST.");

        // Verify deletion
        if (bst.search(keyToDelete)) {
            System.out.println("Verifying deletion...");
            System.out.println("Key " + keyToDelete + " found in the BST.");
        } else {
            System.out.println("Verifying deletion...");
            System.out.println("Key " + keyToDelete + " not found in the BST.");
        }
        System.out.println("\n");

        bst.inorder();

        System.out.println("New Inorder traversal of the given tree");
        bst.inorder();
        System.out.println("\n");

        System.out.println("New Preorder traversal of the given tree");
        bst.preorder();
        System.out.println("\n");

        System.out.println("New Postorder traversal of the given tree");
        bst.postorder();
    }
}
