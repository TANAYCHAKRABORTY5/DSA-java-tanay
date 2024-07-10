package Graphs.Questions;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort {

    static int[] topoSort(int v, ArrayList<ArrayList<Integer>> adj){
        boolean[] vis = new boolean[v];
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<v;i++){
            if(!vis[i]){
                dfs(adj,i,stack,vis);
            }
        }

        int ans[] = new int[v];
        int i=0;
        while(!stack.isEmpty()){
            ans[i++] = stack.pop();
        }

        return ans;
    }


    static void dfs(ArrayList<ArrayList<Integer>> adj,int v,Stack<Integer> stack,boolean[] vis){
        vis[v] = true;

        for(int neighbor : adj.get(v)){
            if(!vis[neighbor]){
                dfs(adj,neighbor,stack,vis);
            }
        }
        stack.push(v);
    }

    public static void main(String[] args) {
        int v=6;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(v);
        for(int i =0;i<v;i++){
            adj.add(new ArrayList<>());
        }

        adj.get(5).add(2);
        adj.get(5).add(0);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(2).add(3);
        adj.get(3).add(1);

        int[] result = topoSort(v,adj);

        System.out.println("Topological sort :: ");
        for(int i : result){
            System.out.print(i+" ");
        }
    }
}
