package Capgemini_Practise_Questions.Arrays;

//Given an array, find max-min difference (or similar simple aggregate)

public class Q2 {

    public static int helper(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i : arr){
            max = Math.max(max,i);
            min = Math.min(min,i);
        }
        return max - min;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 1, 9};

        System.out.println(helper(arr));
    }
}
