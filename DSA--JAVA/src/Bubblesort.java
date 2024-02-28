import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr = {6,9,7,4,8,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean swapped;

        for(int i=0;i< arr.length;i++){
            swapped=false;
            for (int j=1;j<arr.length-i;j++){
                if(arr[j] <arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] =temp;
                    swapped=true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }
}
