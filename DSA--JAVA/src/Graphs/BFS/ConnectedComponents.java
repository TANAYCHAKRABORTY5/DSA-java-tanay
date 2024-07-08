package Graphs.BFS;

import java.util.LinkedList;

public class ConnectedComponents {
    private int vertices;
    private LinkedList<Integer>[] adjList;

    ConnectedComponents(int vertices){
        this.vertices= vertices;
        adjList = new LinkedList[vertices];

        for(int i=0;i<vertices;++i){
            adjList[i] = new LinkedList<>();
        }
    }

    void addEdge(int v,int w){
        adjList[v].add(w);
        adjList[w].add(v);
        System.out.println("Added edge between " + v + " and "+w);

    }

    void DFs(int v,boolean[] visited){
        visited[v] = true;
        System.out.println("Visited vertx "+v);
        for(int n : adjList[v]){
            if(!visited[n]){
                System.out.println("Going to vertex "+n+" from vertex " +v);
                DFs(n,visited);
            }
        }

    }

    int connectedComponents(){
        boolean[] visited = new boolean[vertices];
        int count= 0;
        for(int v=0;v<vertices;++v){
            if(!visited[v]){
                System.out.println("Starting new DFS from vertex"+v);
                DFs(v,visited);
                count++;
                System.out.println("Component completed, incremented count to " + count);
            }

        }
        return count;
    }


    public static void main(String[] args) {
        ConnectedComponents g =new ConnectedComponents(5);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(3,4);


        System.out.println("Number of connected components : "+g.connectedComponents());
    }

}
