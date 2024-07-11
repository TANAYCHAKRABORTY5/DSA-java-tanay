package Graphs.Questions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class minimumSpaning {
    class Pair implements Comparable<Pair>{
        int vertex,weight;

        Pair(int vertex,int weight){
            this.vertex=vertex;
            this.weight=weight;
        }

        public int compareTo(Pair other){
            return this.weight - other.weight;
        }
    }

    int spanningTree(int v, int E, List<List<int[]>> adj){
        boolean[] vis = new boolean[v];

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        pq.add(new Pair(0,0));
        int mstWeight =0;

        while(!pq.isEmpty()){
            Pair curr = pq.poll();

            int u =curr.vertex;
            int w=curr.weight;

            if(vis[u]) continue;

            vis[u] = true;

            mstWeight += w;

            for(int[] neighbor : adj.get(u)){
                if(!vis[neighbor[0]]){
                    pq.add(new Pair(neighbor[0],neighbor[1]));
                }
            }
        }
        return mstWeight;
    }


    public static void main(String[] args) {
        
    }
}
