package Graphs.Questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSortBfs {

    static int[] topoSort(int v, ArrayList<ArrayList<Integer>> adj){
        int indegree[] = new int[v];

        for(ArrayList<Integer> temp : adj){
            for (int i : temp){
                indegree[i]++;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        bfs(adj,indegree,ans);

        int finalans[] = new int[v];

        int i=0;

        for(int j: ans){
            finalans[i++] = j;
        }

        return finalans;
    }


    static void bfs(ArrayList<ArrayList<Integer>> adj,int indegree[] , ArrayList<Integer> ans){
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0;i<indegree.length;i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }

        while(!q.isEmpty()){
            int temp = q.poll();

            ans.add(temp);
            for(int i : adj.get(temp)){
                indegree[i]--;

                if(indegree[i] == 0){
                    q.add(i);
                }
            }
        }

    }

    public static void main(String[] args) {
        int vertex =6;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(vertex);


        for(int i =0;i<vertex;i++){
            adj.add(new ArrayList<>());
        }

        adj.get(5).add(2);
        adj.get(5).add(0);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(2).add(3);
        adj.get(3).add(1);

        int result[] = topoSort(vertex,adj);

        System.out.println("Topological sort order :: ");

        for (int i : result){
            System.out.print(i+" ");
        }
    }
}
