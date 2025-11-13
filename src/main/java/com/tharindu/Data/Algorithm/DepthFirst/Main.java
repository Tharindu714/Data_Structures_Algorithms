package com.tharindu.Data.Algorithm.DepthFirst;

public class Main {
    public static void main(String[] args) {
        DFSearch dfSearch = new DFSearch();
        dfSearch.addEdge('A', 'B');
        dfSearch.addEdge('A', 'C');
        dfSearch.addEdge('A', 'D');

        dfSearch.addEdge('B', 'E');
        dfSearch.addEdge('B', 'F');

        dfSearch.addEdge('C', 'G');
        dfSearch.addEdge('C', 'H');

        dfSearch.addEdge('D', 'H');
        dfSearch.dfs('A'); // Starting DFS from node 'A'
    }
}
