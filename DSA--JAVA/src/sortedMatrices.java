import java.util.Arrays;

public class sortedMatrices {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(search(arr,9)));
    }

    static int[] binarysearch(int[][] matrix, int row ,int cstart,int cend,int target){
        while(cstart <= cend){
            int mid = cstart +(cend-cstart)/2;

            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid]<target){
                cstart = mid +1;
            }else {
                cend =mid-1;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] search(int[][] matrix,int target){
        int rows= matrix.length;
        int cols= matrix[0].length;

        if(rows==1){
            return binarysearch(matrix,0,0,cols-1, target);
        }

        int rstart = 0;
        int rend = rows-1;
        int cmid = cols/2;


        while(rstart < (rend-1)){
            int mid =rstart +(rend -rstart)/2;
            if(matrix[mid][cmid]==target){
                return new int[]{mid,cmid};
            }
            if(matrix[mid][cmid] <target){
                rstart =mid;
            }else {
                rend = mid;
            }
        }

        if(matrix[rstart][cmid] == target){
            return new int[]{rstart,cmid};
        }
        if(matrix[rstart+1][cmid] == target){
            return new int[]{rstart+1,cmid};
        }

        if(target <=matrix[rstart][cmid-1] ){
            return binarysearch(matrix,rstart,0,cmid-1,target);
        }

        if(target >=matrix[rstart][cmid+1] && target<= matrix[rstart][cols-1] ){
            return binarysearch(matrix,rstart,cmid+1,cols-1,target);

        }

        if(target <=matrix[rstart+1][cmid-1] ){
            return binarysearch(matrix,rstart+1,0,cmid-1,target);

        }else {
            return binarysearch(matrix,rstart+1,cmid+1,cols-1,target);

        }

    }
}
