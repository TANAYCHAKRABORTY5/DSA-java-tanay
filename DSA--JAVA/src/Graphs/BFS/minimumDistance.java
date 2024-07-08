package Graphs.BFS;

import java.util.ArrayList;
import java.util.LinkedList;

public class minimumDistance {

    private static boolean bfs(ArrayList<ArrayList<Integer>> adj,int src,int dest,int v,int pred[],int dist[]){
        LinkedList<Integer> queue = new LinkedList<>();

        boolean visited[]  = new boolean[v];
        for(int i=0;i<v;i++){
            visited[i] = false;
            dist[i] = Integer.MAX_VALUE;
            pred[i] = -1;
        }

        visited[src] = true;
        dist[src] = 0;
        queue.add(src);

        while(!queue.isEmpty()){
            int curr  = queue.remove();
            for(int i = 0;i<adj.get(curr).size();i++){
                int neighbour = adj.get(curr).get(i);
                if(!visited[neighbour]){
                    visited[neighbour] = true;
                    dist[neighbour] = dist[curr] +1;
                    pred[neighbour] = curr;
                    queue.add(neighbour);

                    if(neighbour == dest){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int v= 6;
        int e=8;

        int pred[] = new int[v+1];
        int dist[] = new int[v+1];

        boolean isReached =minimumDistance.bfs(adj,1,6,v,pred,dist);
    }
}
