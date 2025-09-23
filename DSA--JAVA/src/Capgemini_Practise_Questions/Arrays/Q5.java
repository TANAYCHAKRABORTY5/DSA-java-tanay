package Capgemini_Practise_Questions.Arrays;


//Kadane’s algorithm: largest sum contiguous subarray.

public class Q5 {

    public static int maxValue(int[] arr){
        int result = arr[0];
        int curr= arr[0];

        for(int i=0;i<arr.length;i++){
            curr = Math.max(arr[i],arr[i]+curr);
            result = Math.max(curr,result);

        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int ans = maxValue(arr);
        System.out.println(ans);

    }

}
