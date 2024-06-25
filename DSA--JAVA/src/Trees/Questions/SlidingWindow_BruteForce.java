package Trees.Questions;

public class SlidingWindow_BruteForce {
    public static void calculate(int[] arr,int k){
        int j,max;

        for(int i =0;i<=arr.length-k;i++){
            max = arr[i];
            for(j=1;j<k;j++){
                if(arr[i+j] > max){
                    max = arr[i+j];
                }
            }
            System.out.print( max + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5,6,2,5,2,1,5,7,9,2,6,6};
        calculate(arr,3);
    }
}
