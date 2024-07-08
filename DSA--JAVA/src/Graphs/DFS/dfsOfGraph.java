package Graphs.DFS;

import java.util.ArrayList;
import java.util.Scanner;

public class dfsOfGraph {
    public ArrayList<Integer> dfsOfGraph(int v,ArrayList<ArrayList<Integer>> adj){
        boolean vis[] = new boolean[v];
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<v;i++){
            if(!vis[i]){
                dfs(i,adj,vis,ans);
            }
        }

        return ans;
    }

    public void dfs(int v,ArrayList<ArrayList<Integer>> adj, boolean[] vis,ArrayList<Integer> ans){
        vis[v] = true;

        ans.add(v);

        for(Integer neighbour : adj.get(v)){
            if(!vis[neighbour]){
                dfs(neighbour,adj,vis,ans);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int v = scanner.nextInt();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(v);
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        System.out.print("Enter number of edges: ");
        int e = scanner.nextInt();

        System.out.println("Enter edges (format: src dest): ");
        for (int i = 0; i < e; i++) {
            int src = scanner.nextInt();
            int dest = scanner.nextInt();
            adj.get(src).add(dest);
            adj.get(dest).add(src); // Comment this line if the graph is directed
        }

        scanner.close();

        dfsOfGraph grp = new dfsOfGraph();
        ArrayList<Integer> result = grp.dfsOfGraph(v, adj);

        System.out.println("DFS traversal of the graph: " + result);
    }
}
