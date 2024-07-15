package Graphs.Questions;


import java.security.spec.ECField;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Edge implements Comparable<Edge>{
    int src,dest,wt;

    Edge(int src,int dest,int wt){
        this.src = src;
        this.dest= dest;
        this.wt = wt;
    }

    public int compareTo(Edge that){
        return this.wt - that.wt;
    }
}

public class KrushklsAlgorithm {
    static int p[],rank[];

    static void union(int x,int y){
        int rx = find(x);
        int ry= find(y);
        if(rx == ry) return;
        p[ry] = rx;

    }

    static int find(int x){
        if(p[x] == x) return x;
        return find(p[x]);
    }



    static int spannningTree(int v, ArrayList<ArrayList<ArrayList>> adj){
        boolean[][] added = new boolean[v][v];
        ArrayList<Edge> edges = new ArrayList<>();
        
        
        for(int i=0;i< adj.size();i++){
            for (int j = 0; j < adj.get(i).size(); j++) {
                ArrayList<Integer> cur = adj.get(i).get(j);
                if(!added[i][cur.get(0)]){
                    added[i][cur.get(0)] = true;
                    added[cur.get(0)][i] = true;
                    edges.add(new Edge(i,cur.get(0),cur.get(1)));
                }
            }
        }

        p = new int[v];
        for(int i=0;i<v;i++){
            p[i] = i;

        }

        Collections.sort(edges);
        int count = 1;
        int ans =0;

        for(int i =0;count<v;i++){
            Edge edge = edges.get(i);
            int rx = find(edge.src);
            int ry = find(edge.dest);

            if(rx != ry){
                union(rx,ry);
                count++;
                ans += edge.wt;
            }
        }

        return ans;
    }
}
