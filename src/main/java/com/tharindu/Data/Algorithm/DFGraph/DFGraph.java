package com.tharindu.Data.Algorithm.DFGraph;

import java.util.LinkedList;

public class DFGraph {
    private final LinkedList<Integer>[] adjLists;
    private final boolean[] visited;

    public DFGraph(int vertices) {
        adjLists = new LinkedList[vertices + 1];
        visited = new boolean[vertices + 1];

        for (int i = 0; i <= vertices; i++) {
            adjLists[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination) {
        adjLists[source].add(destination);
        adjLists[destination].add(source); // For undirected graph
    }

    public void dfs(int vertex) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int neighbor : adjLists[vertex]) {
            if (!visited[neighbor]) {
                dfs(neighbor);
            }
        }
    }
}
