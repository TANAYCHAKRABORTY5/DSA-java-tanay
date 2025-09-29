package Graphs.StronglyConnectedComponents;

import Graphs.MinimumSpanningTree.PrimsAlgo;
import Graphs.Questions.TopologicalSort11;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Stack;

public class KosarajusAlgo {
    static class Edge{
        int src;
        int dest;


        public Edge(int src,int dest){
            this.src = src;
            this.dest =dest;

        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph [0].add(new Edge ( 0,  2));
        graph [0].add(new Edge ( 0,  3));
        graph [1].add(new Edge ( 1,  0));
        graph [2].add(new Edge( 2 , 1));
        graph [3].add(new Edge ( 3,  4));
    }

    public static void topSort(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> stack){
        vis[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);

            if(!vis[e.dest]){
                topSort(graph,e.dest,vis,stack);
            }
        }

        stack.push(curr);
    }

    public static void dfs(ArrayList<Edge> graph[], boolean vis[], int curr) {
        vis[curr] = true;
        System.out.print(curr+" ");
        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]) {
                dfs(graph, vis, e.dest);
            }
        }
    }
    public static void kosraju(ArrayList<Edge> graph[],int V){
        Stack<Integer> s = new Stack<>();
        boolean vis[] = new boolean[V];
        for(int i =0;i<V;i++){
            if(!vis[i]){
                topSort(graph,i,vis,s);
            }
        }

        ArrayList<Edge> transpose[] = new ArrayList[V];
        for(int i =0;i<graph.length;i++){
            transpose[i] =new ArrayList<Edge>();
        }

        for(int i=0;i<V;i++){
            vis[i] =false;
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                transpose[e.dest].add(new Edge(e.dest,e.src));
            }
        }

        while(!s.isEmpty()){
            int curr =s.pop();
            if(!vis[curr]){
                System.out.print("SCC : ");
                dfs(transpose,vis,curr);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int v =6;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);

        kosraju(graph,v);
    }
}
