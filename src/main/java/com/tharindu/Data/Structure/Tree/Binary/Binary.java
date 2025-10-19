package com.tharindu.Data.Structure.Tree.Binary;

import java.util.LinkedList;
import java.util.Queue;

public class Binary {
    public Node root;

    public Node buildTree(int[] values) {
        if (values.length == 0) {
            return null;
        }

        root = new Node(values[0]);
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        int index = 1;
        while (!queue.isEmpty() && index < values.length) {
            Node current = queue.poll();

            // Left child
            if (values[index] != -1) {
                current.left = new Node(values[index]);
                queue.add(current.left);
            }
            index++;

            // Right child
            if (index < values.length && values[index] != -1) {
                current.right = new Node(values[index]);
                queue.add(current.right);
            }
            index++;
        }

        return root;
    }


    public void InorderTraversal(Node node) {
        if (node != null) {
            InorderTraversal(node.left);
            System.out.print(node.data + " ");
            InorderTraversal(node.right);
        }
    }
}