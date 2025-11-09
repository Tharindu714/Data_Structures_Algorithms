package com.tharindu.Data.Algorithm.Graph.Example;

import java.util.ArrayList;
import java.util.Collections;

public class Graph {
    static ArrayList<ArrayList<Integer>> createGraph(int vertices, int[][] edges) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        // Initialize the adjacency matrix with zeros
        for (int i = 0; i < vertices; i++) {
            ArrayList<Integer> row = new ArrayList<>(Collections.nCopies(vertices,0));
            graph.add(row);
        }

        //Add edges to the adjacency matrix
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.get(u).set(v, 1);
            graph.get(v).set(u, 1); // For undirected graph
        }
        return graph;
    }
}
