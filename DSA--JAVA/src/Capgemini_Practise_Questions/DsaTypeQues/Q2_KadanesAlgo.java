package Capgemini_Practise_Questions.DsaTypeQues;

//maximum sum subarray


public class Q2_KadanesAlgo {

    public static int maximumSubArray(int[] arr){
        int currentCount =0;
        int maxSum = 0;

        for(int i=0;i<arr.length;i++){
            currentCount = Math.max(arr[i],arr[i] + currentCount);
            maxSum = Math.max(currentCount,maxSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println("maximum sum is  : "+maximumSubArray(arr));
    }
}
