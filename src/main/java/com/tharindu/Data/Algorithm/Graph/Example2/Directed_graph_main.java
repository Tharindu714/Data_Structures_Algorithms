package com.tharindu.Data.Algorithm.Graph.Example2;

import java.util.ArrayList;

public class Directed_graph_main {
    public static void main(String[] args) {
        int vertices = 5;
        int[][] edges = {
                {1, 0},
                {1, 4},
                {4, 3},
                {3, 2},
                {2, 0},
        };

        // Build the directed graph using edges
        ArrayList<ArrayList<Integer>> adj = Directed_Graph.createGraph(vertices, edges);

        // Print the adjacency matrix
        System.out.println("Directed Graph Adjacency Matrix:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
