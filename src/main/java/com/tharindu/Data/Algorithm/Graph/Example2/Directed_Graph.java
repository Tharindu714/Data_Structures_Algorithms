package com.tharindu.Data.Algorithm.Graph.Example2;

import java.util.ArrayList;
import java.util.Collections;

public class Directed_Graph {
    static ArrayList<ArrayList<Integer>> createGraph(int vertices, int[][] edges) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        //initialize the matrix with empty arraylists
        for (int i = 0; i < vertices; i++) {
            ArrayList<Integer> Directed_row = new ArrayList<>(Collections.nCopies(vertices, 0));
            graph.add(Directed_row);
        }

        //add edges to the graph
        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            graph.get(from).set(to, 1); // Directed edge from 'from' to 'to'
        }
        return graph;
    }
}
