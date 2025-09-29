package Capgemini_Practise_Questions.matrix;


//Check if two matrices are identical.

public class Q3 {

    public static boolean areIdentical(int[][] mat1,int[][] mat2){
        if(mat1.length != mat2.length || mat1[0].length != mat2[0].length){
            return false;
        }

        int rows = mat1.length;
        int cols = mat1[0].length;

        for(int i=0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                if(mat1[i][j] != mat2[i][j]) return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        int[][] mat1 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] mat2 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] mat3 = {
                {1, 2, 3},
                {7, 8, 9}
        };

        System.out.println("mat1 vs mat2: " + areIdentical(mat1, mat2)); // true
        System.out.println("mat1 vs mat3: " + areIdentical(mat1, mat3)); // false
    }
}
