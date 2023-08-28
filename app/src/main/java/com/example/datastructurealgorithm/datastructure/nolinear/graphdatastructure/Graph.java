package com.example.datastructurealgorithm.datastructure.nolinear.graphdatastructure;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

// Generic Graph class
class Graph {
    private Map<Integer, List<Integer>> adjacencyList;

    // Constructor to initialize the graph with a given number of vertices
    public Graph(int vertices) {
        adjacencyList = new HashMap<>();

        // Initialize adjacency lists for each vertex
        for (int i = 0; i < vertices; i++) {
            // We're using Integer.valueOf(i) as generic keys
            adjacencyList.put(i, new LinkedList<>());
        }
    }

    // Method to add an edge between source and destination vertices
    public void addEdge(Integer source, Integer destination) {
        // Add destination to source's adjacency list
        adjacencyList.get(source).add(destination);

        // For an undirected graph, add source to destination's adjacency list
        adjacencyList.get(destination).add(source);
    }

    // Method to print the adjacency list of the graph
    public void printGraph() {
        for (Map.Entry<Integer, List<Integer>> entry : adjacencyList.entrySet()) {
            Integer vertex = entry.getKey();
            List<Integer> neighbors = entry.getValue();

            System.out.print("Vertex " + vertex + " is connected to: ");
            for (Integer neighbor : neighbors) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}