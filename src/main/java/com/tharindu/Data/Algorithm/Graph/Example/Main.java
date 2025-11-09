package com.tharindu.Data.Algorithm.Graph.Example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int vertices = 5;
        int[][] edges = {
                {0, 1},
                {0, 3},
                {1, 3},
                {1, 2},
                {1, 4},
                {2, 4},
                {3, 4}
        };

        //Build the graph using edges
        ArrayList<ArrayList<Integer>> matrix = Graph.createGraph(vertices, edges);

        //Print the adjacency matrix
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(matrix.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
