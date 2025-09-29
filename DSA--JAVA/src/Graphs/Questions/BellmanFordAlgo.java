package Graphs.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BellmanFordAlgo {


    int source,destination,weight;

    BellmanFordAlgo(int source,int destination,int weight){
        this.source=source;
        this.destination=destination;
        this.weight=weight;
    }
}


class Graph{
    int vertices,edges;
    List<BellmanFordAlgo> edgeList;


    Graph(int vertices,int edges){
        this.vertices = vertices;
        this.edges= edges;
        edgeList = new ArrayList<>();
    }

    void addEdge(int source,int destination,int weight){
        edgeList.add(new BellmanFordAlgo(source,destination,weight));
    }

    void bellmanFord(int source){
        int[] dist = new int[vertices];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[source] = 0;

        for(int i=1;i<vertices;++i){
            for(BellmanFordAlgo edge : edgeList){
                int u = edge.source;
                int v = edge.destination;
                int weight =edge.weight;


                if(dist[u] != Integer.MAX_VALUE && dist[u] +weight < dist[v]){
                    dist[v] =dist[u] + weight;
                }
            }
        }

        for(BellmanFordAlgo edge : edgeList){
            int u = edge.source;
            int v = edge.destination;
            int weight =edge.weight;

            if(dist[u] != Integer.MAX_VALUE && dist[u] + weight <dist[v]){
                System.out.println("Graph contains negative weight cycle ");
                return;
            }
        }

        printDistance(dist);
    }

    void printDistance(int[] dist){
        System.out.println("Vertex distance from source ");
        for(int i=0;i<vertices;++i){
            System.out.println(i+"\t\t"+ dist[i]);
        }
    }

    public static void main(String[] args) {
        int vertices = 5; // Number of vertices in the graph
        int edges = 8; // Number of edges in the graph

        Graph graph = new Graph(vertices, edges);

        // Add edges
        graph.addEdge(0, 1, -1);
        graph.addEdge(0, 2, 4);
        graph.addEdge(1, 2, 3);
        graph.addEdge(1, 3, 2);
        graph.addEdge(1, 4, 2);
        graph.addEdge(3, 2, 5);
        graph.addEdge(3, 1, 1);
        graph.addEdge(4, 3, -3);

        int source = 0; // Source vertex

        // Run the Bellman-Ford algorithm from the given source vertex
        graph.bellmanFord(source);
    }
}

