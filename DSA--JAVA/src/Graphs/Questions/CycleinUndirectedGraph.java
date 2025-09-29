package Graphs.Questions;

import java.util.ArrayList;

public class CycleinUndirectedGraph {
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here

        boolean[] vis = new boolean[V];
        for(int i = 0;i<V;i++){
            if(!vis[i]){
                if(dfs(i,adj,vis,-1)) return true;
            }
        }
        return false;
    }

    public boolean dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean[] vis, int parent){
        vis[v] = true;


        for(Integer neighbor : adj.get(v)){
            if(!vis[neighbor]){
                if(dfs(neighbor,adj,vis,v)){
                    return true;
                }
            }else if(parent != neighbor){
                return true;
            }
        }

        return false;
    }

}
