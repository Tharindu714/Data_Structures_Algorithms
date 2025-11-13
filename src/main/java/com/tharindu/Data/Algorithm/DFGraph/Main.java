package com.tharindu.Data.Algorithm.DFGraph;

public class Main {
    public static void main(String[] args) {
        DFGraph graph = new DFGraph(5);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);

        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);

        graph.addEdge(3, 5);

        graph.addEdge(4, 5);

        System.out.println("Depth-First Traversal starting from vertex 1:");
        graph.dfs(1);
    }
}
