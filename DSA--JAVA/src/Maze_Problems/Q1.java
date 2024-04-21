package Maze_Problems;

// How many steps it would take to move from point A to B
public class Q1 {

    public static void main(String[] args) {
        int a  = count(3,3);
        System.out.println(a);
    }

    static int count(int r , int c){
        if(r== 1 || c==1){
            return 1;
        }

        int left = count(r-1,c);
        int right = count(r,c-1);

        return left + right;
    }
}
