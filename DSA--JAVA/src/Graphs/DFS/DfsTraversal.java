package Graphs.DFS;

import Graphs.BFS.BfsTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DfsTraversal {
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

        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,2));
    }

    public static void dfs(ArrayList<Edge> graph[],int curr,boolean vis[]){
        System.out.print(curr + " ");
        vis[curr] = true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph,e.dest,vis);
            }
        }
    }




    public static void main(String[] args) {
        int v =7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);

        boolean vis[] = new boolean[v];
        for(int i =0;i<v;i++){
            if(vis[i] == false){
                dfs(graph,i,vis );
            }
        }
        System.out.println();
    }
}
