package com.tharindu.Data.Algorithm.Breadth;

import java.util.*;

public class Breadth_First {
    private final Map<Character, List<Character>> abjCharacterListMap;

    public Breadth_First() {
        abjCharacterListMap = new HashMap<>();

        //Build the graph (based on the image)
        abjCharacterListMap.put('A', Arrays.asList('B', 'C', 'D'));
        abjCharacterListMap.put('B', Arrays.asList('E', 'F'));
        abjCharacterListMap.put('C', Arrays.asList('G', 'H'));
        abjCharacterListMap.put('D', List.of('H')); // Cycle Edge
    }

    public void BreadthFirstSearch(Character root) {
        Queue<Character> queue = new LinkedList<>();
        Set<Character> visited = new HashSet<>();

        queue.add(root);
        visited.add(root);

        System.out.println("Breadth First Search Traversal Started: ");
        while (!queue.isEmpty()) {
            char current = queue.poll();
            System.out.println(current + " ");

            for (char neighbour : abjCharacterListMap.getOrDefault(current, new ArrayList<>())) {
                if (!visited.contains(neighbour)) {
                    visited.add(neighbour);
                    queue.add(neighbour);
                }
            }
        }
    }
}
