package Capgemini_Practise_Questions.Arrays;

//Rotate an array by k steps.
//Input: arr[] = [1, 2, 3, 4, 5, 6], k = 2
//Output: [5, 6, 1, 2, 3, 4]

import java.util.Arrays;

public class Q3 {

    public static void reverse(int[] arr,int i , int n){
        while(i < n){
            int temp = arr[i];
            arr[i] = arr[n];
            arr[n] = temp;
            i++;
            n--;
        }
    }

    public static int[] helper(int[] arr,int k){
        int n = arr.length;
        k = k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6}; int k = 2;

        System.out.println(Arrays.toString(helper(arr,k)));
    }
}
