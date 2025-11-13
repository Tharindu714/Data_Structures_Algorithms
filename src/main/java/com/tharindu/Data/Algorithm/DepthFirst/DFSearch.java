package com.tharindu.Data.Algorithm.DepthFirst;

import java.util.*;

public class DFSearch {
    private final Map<Character, List<Character>> listMap = new HashMap<>();
    private final Set<Character> visited = new HashSet<>();

    public void addEdge(char source, char destination) {
        listMap.putIfAbsent(source, new ArrayList<>());
        listMap.putIfAbsent(destination, new ArrayList<>());
        listMap.get(source).add(destination);
        listMap.get(destination).add(source);
    }

    public void dfs(char node) {
        visited.add(node);
        System.out.print(node + " ");
        for (char neighbor : listMap.get(node)) {
            if (!visited.contains(neighbor)) {
                dfs(neighbor);
            }
        }
    }
}
