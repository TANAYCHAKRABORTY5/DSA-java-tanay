package Maze_Problems;

//Its a different approach for the maze from path A to B
//it just shows the path D is down and R is right

import java.util.ArrayList;

public class Q2 {
    public static void main(String[] args) {
        path("",3,3);
        System.out.println(pathlist("",3,3));
    }



    static void path(String p ,int r ,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;

        }

        if(r>1){
            path(p +'D',r-1,c);
        }

        if(c>1){
            path(p +'R',r,c-1);
        }
    }

    // in list format

    static ArrayList<String> pathlist(String p,int r,int c){
        if(r==1 && c==1){
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list =new ArrayList<>();

        if(r>1){
            list.addAll(pathlist(p + 'D',r-1,c));
        }

        if(c>1){
            list.addAll(pathlist(p + 'R',r,c-1));
        }

        return list;
    }
}
