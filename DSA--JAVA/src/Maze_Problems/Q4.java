package Maze_Problems;

//Maze with problems or obstacles in its path
//and if you land on obstacles stop the  recursion and skip that path

public class Q4 {
    public static void main(String[] args) {
        boolean[][] board ={
                {true,true,true},
                {true,false,true},
                {true,true,true},
        };
        pathobtstacle("",board,0,0);
    }

    static void pathobtstacle(String p,boolean[][] maze,int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;

        }

        if(r< maze.length-1){
            pathobtstacle(p+'D',maze,r+1,c);
        }

        if(c < maze[0].length-1){
            pathobtstacle(p+'R',maze,r,c+1);
        }


    }
}
