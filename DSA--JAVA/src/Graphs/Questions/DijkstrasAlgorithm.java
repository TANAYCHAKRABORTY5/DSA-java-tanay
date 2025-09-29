package Graphs.Questions;

import javax.swing.*;
import java.util.*;

public class DijkstrasAlgorithm {

    private int vertices;
    private List<List<Node>> adj;

    class Node implements Comparable<Node> {
        int vertex, weight;

        Node(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }

        @Override
        public int compareTo(Node other) {
            return Integer.compare(this.weight, other.weight);
        }
    }

    DijkstrasAlgorithm(int vertices) {
        this.vertices = vertices;
        adj = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }
    }

    void addEdge(int source, int target, int weight) {
        adj.get(source).add(new Node(target, weight));
    }

    void dijkstra(int startVertex) {
        int[] distances = new int[vertices];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[startVertex] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(startVertex, 0));

        while (!pq.isEmpty()) {
            Node current = pq.poll();

            for (Node neighbor : adj.get(current.vertex)) {
                int newDist = distances[current.vertex] + neighbor.weight;

                if (newDist < distances[neighbor.vertex]) {
                    distances[neighbor.vertex] = newDist;
                    pq.add(new Node(neighbor.vertex, newDist));
                }
            }
        }

        printSolution(distances, startVertex);
    }

    void printSolution(int[] distances, int startVertex) {
        System.out.println("Shortest paths from vertex " + startVertex);
        for (int i = 0; i < vertices; i++) {
            System.out.println("To vertex " + i + " is " + distances[i]);
        }
    }

    public static void main(String[] args) {
        DijkstrasAlgorithm graph = new DijkstrasAlgorithm(6);
        graph.addEdge(0, 1, 5);
        graph.addEdge(0, 2, 3);
        graph.addEdge(1, 3, 6);
        graph.addEdge(1, 2, 2);
        graph.addEdge(2, 4, 4);
        graph.addEdge(2, 5, 2);
        graph.addEdge(2, 3, 7);
        graph.addEdge(3, 4, -1);
        graph.addEdge(4, 5, -2);

        graph.dijkstra(0);
    }




}
