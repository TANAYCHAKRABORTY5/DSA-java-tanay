package Maze_Problems;

// what if diagonal paths are also included
// And we are taking D as diagonal and V as vertical and H as horizontal

import java.util.ArrayList;

public class Q3 {

    public static void main(String[] args) {

        System.out.println(pathlist("",3,3));
    }



    static void pathDiagonal(String p ,int r ,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;

        }

        if(r>1 && c>1){
            pathDiagonal(p + 'D' ,r-1,c-1);
        }

        if(r>1){
            pathDiagonal(p +'D',r-1,c);
        }

        if(c>1){
            pathDiagonal(p +'R',r,c-1);
        }
    }

    // in list format

    static ArrayList<String> pathlist(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list =new ArrayList<>();

        if(r>1 && c>1){
            list.addAll(pathlist(p + 'D' ,r-1,c-1));
        }


        if(r>1){
            list.addAll(pathlist(p + 'V',r-1,c));
        }

        if(c>1){
            list.addAll(pathlist(p + 'H',r,c-1));
        }

        return list;
    }
}
