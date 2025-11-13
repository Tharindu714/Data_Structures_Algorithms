package com.tharindu.Data.Algorithm.Dijkstra;

public class Dijkstra {
    static final int V = 9; // Number of vertices in the graph

    // A utility function to find the vertex with the minimum distance value
    static int minDistance(int dist[], Boolean sptSet[]) {
        // Initialize min value
        int min = Integer.MAX_VALUE, min_index = -1;

        for (int v = 0; v < V; v++) {
            if (sptSet[v] == false && dist[v] <= min) {
                min = dist[v];
                min_index = v;
            }
        }
        return min_index;
    }

    // Function that implements Dijkstra's single source the shortest path algorithm
    static void printSolution(int dist[]) {
        System.out.println("Vertex \t Distance from Source");
        for (int i = 0; i < V; i++) {
            System.out.println(i + " \t\t " + dist[i]);
        }
    }

    //Dijkstra's algorithm for a graph represented using adjacency matrix representation
    static void dijkstra(int graph[][], int src) {
        int dist[] = new int[V]; // The output array dist[i] holds the shortest distance from src to j

        // sptSet[i] will be true if vertex i is included in the shortest path tree
        Boolean sptSet[] = new Boolean[V];

        // Initialize all distances as INFINITE and sptSet[] as false
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }

        // Distance from source to itself is always 0
        dist[src] = 0;

        // Find the shortest path for all vertices
        for (int count = 0; count < V - 1; count++) {
            // Pick the minimum distance vertex from the set of vertices not yet processed
            int u = minDistance(dist, sptSet);

            // Mark the picked vertex as processed
            sptSet[u] = true;

            // Update the value of the adjacent vertices of the picked vertex
            for (int v = 0; v < V; v++) {
                // Update dist[v] if and only if it is not in sptSet, there is an edge from u to v,
                // and the total weight of a path from src to v through u is smaller than the current value of dist[v]
                if (!sptSet[v] && graph[u][v] != 0 &&
                    dist[u] != Integer.MAX_VALUE &&
                    dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }

        // Print the constructed distance array
        printSolution(dist);
    }

}
