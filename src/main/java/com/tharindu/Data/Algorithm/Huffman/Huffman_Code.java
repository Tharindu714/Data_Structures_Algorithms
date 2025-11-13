package com.tharindu.Data.Algorithm.Huffman;

import java.util.Map;

public class Huffman_Code {

    //Recursive function to generate the huffman codes
    public static void generate_Huffman_Codes(Huffman_Node root, String code, Map<Character, String> HuffmanCodeMap) {
        if (root == null) {
            return;
        }

        //If this is a leaf node, then it contains one of the input characters
        if (root.left == null && root.right == null) {
            HuffmanCodeMap.put(root.c, code);
            return;
        }

        //Traverse the left subtree
        generate_Huffman_Codes(root.left, code + "0", HuffmanCodeMap);
        //Traverse the right subtree
        generate_Huffman_Codes(root.right, code + "1", HuffmanCodeMap);
    }

    public static String encode(String text, Map<Character, String> HuffmanCodeMap) {
        StringBuilder encodedString = new StringBuilder();
        for (char c : text.toCharArray()) {
            encodedString.append(HuffmanCodeMap.get(c));
        }
        return encodedString.toString();
    }

    // Function to decode the encoded string
    public static String decode(String encodedString, Huffman_Node root) {
        StringBuilder decodedString = new StringBuilder();
        Huffman_Node currentNode = root;
        for (char bit : encodedString.toCharArray()) {
            if (bit == '0') {
                currentNode = currentNode.left;
            } else {
                currentNode = currentNode.right;
            }

            // If we reach a leaf node, append the character to the decoded string
            assert currentNode != null;
            if (currentNode.left == null && currentNode.right == null) {
                decodedString.append(currentNode.c);
                currentNode = root; // Go back to the root for the next character
            }
        }
        return decodedString.toString();
    }
}
