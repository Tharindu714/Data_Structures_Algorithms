package com.tharindu.Data.Algorithm.Huffman;

import java.util.Comparator;

public class MyComparator implements Comparator<Huffman_Node> {
    public int compare(Huffman_Node x, Huffman_Node y) {
        return x.data - y.data;
    }
}
