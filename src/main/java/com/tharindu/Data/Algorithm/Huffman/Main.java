package com.tharindu.Data.Algorithm.Huffman;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        System.out.println("Huffman Coding Algorithm");
        String text = "Hey David";

        //Step 1: Calculate the frequency of each character
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : text.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        //Step 2: Create a priority queue to store the nodes of the Huffman tree
        PriorityQueue<Huffman_Node> queue = new PriorityQueue<>(freqMap.size(), new MyComparator());

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            Huffman_Node HuffmanNode = new Huffman_Node();
            HuffmanNode.c = entry.getKey();
            HuffmanNode.data = entry.getValue();
            HuffmanNode.left = null;
            HuffmanNode.right = null;
            queue.add(HuffmanNode);
        }

        //Step 3: Build the Huffman tree
        Huffman_Node  root = null;
        while (queue.size() > 1) {
            Huffman_Node x = queue.poll();
            Huffman_Node y = queue.poll();

            Huffman_Node sum = new Huffman_Node();
            assert y != null;
            sum.data = x.data + y.data;
            sum.c = '-';
            sum.left = x;
            sum.right = y;
            root = sum;

            queue.add(sum);
        }

        //Step 4: Generate Huffman codes
        Map<Character, String> HuffmanCodeMap = new HashMap<>();
        Huffman_Code.generate_Huffman_Codes(root, "", HuffmanCodeMap);
        System.out.println("Huffman Codes: " + HuffmanCodeMap);

        for (Map.Entry<Character, String> entry : HuffmanCodeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        //Step 5: Encode the input text
        String encodedString = Huffman_Code.encode(text, HuffmanCodeMap);
        System.out.println("\nOriginal String: " + text);
        System.out.println("Encoded String: " + encodedString);

        //Step 6: Decode the encoded string
        String decodedString = Huffman_Code.decode(encodedString, root);
        System.out.println("Decoded String: " + decodedString);
    }
}
