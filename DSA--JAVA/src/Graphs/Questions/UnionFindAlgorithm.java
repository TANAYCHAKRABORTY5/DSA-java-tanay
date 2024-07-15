package Graphs.Questions;

public class UnionFindAlgorithm {
    int[] rank,parent;
    int n;

    public UnionFindAlgorithm(int n){
        rank = new int[n];
        parent = new int[n];

        this.n = n;
        for(int i=0;i<n;i++){
            parent[i] = i;
        }
    }

    int find(int x){
        if(parent[x] != x){
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }


    void union(int x,int y){
        int xRoot = find(x), yRoot = find(y);

        if(xRoot == yRoot){
            return;
        }

        if(rank[xRoot] < rank[yRoot]){
            parent[xRoot] = yRoot;
        }else if(rank[yRoot] < rank[xRoot]){
            parent[yRoot] = xRoot;
        }else {
            parent[yRoot] = xRoot;
            rank[xRoot] = rank[xRoot]+1;
        }
    }

    public static void main(String[] args) {
        int n=10;
        UnionFindAlgorithm ufa = new UnionFindAlgorithm(n);

        ufa.union(0, 1);
        ufa.union(1, 2);
        ufa.union(3, 4);
        ufa.union(4, 5);
        ufa.union(6, 7);
        ufa.union(7, 8);
        ufa.union(8, 9);



        System.out.println("Find 0: " + ufa.find(0));
        System.out.println("Find 1: " + ufa.find(1));
        System.out.println("Find 2: " + ufa.find(2));
        System.out.println("Find 3: " + ufa.find(3));
        System.out.println("Find 4: " + ufa.find(4));
        System.out.println("Find 5: " + ufa.find(5));
        System.out.println("Find 6: " + ufa.find(6));
        System.out.println("Find 7: " + ufa.find(7));
        System.out.println("Find 8: " + ufa.find(8));
        System.out.println("Find 9: " + ufa.find(9));


        System.out.println("Are 0 and 2 in the same set? " + (ufa.find(0) == ufa.find(2)));
        System.out.println("Are 3 and 5 in the same set? " + (ufa.find(3) == ufa.find(5)));
        System.out.println("Are 6 and 9 in the same set? " + (ufa.find(6) == ufa.find(9)));
        System.out.println("Are 0 and 3 in the same set? " + (ufa.find(0) == ufa.find(3)));
    }
}
