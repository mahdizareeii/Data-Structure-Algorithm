package com.example.datastructurealgorithm.datastructure.nolinear.graphdatastructure;

public class GraphDataStructure {
    public static void main(String[] args) {


//          Graph:
//          1---2
//         /|\ /|\
//        | | X | |
//         \|/ \|/
//          3---4
//           \ /
//            5


        // Create a graph with generic vertices (String in this case)
        Graph<Integer> graph = new Graph<>(5);

        // Add edges to the graph
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);
        graph.addEdge(3, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);


        // Print the adjacency list of the graph
        System.out.println("Graph adjacency list:");
        graph.printGraph();

        // Adjacency List:
        // Vertex 0 is connected to: 1 - 2
        // Vertex 0 is connected to: 1 - 3
        // Vertex 0 is connected to: 1 - 4
        // Vertex 0 is connected to: 2 - 4
        // Vertex 0 is connected to: 2 - 5
        // Vertex 0 is connected to: 3 - 4
        // Vertex 0 is connected to: 3 - 5
        // Vertex 0 is connected to: 4 - 5
    }

}