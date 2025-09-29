package Capgemini_Practise_Questions.DsaTypeQues;


//Write a program to rotate an array by k positions.


import java.util.Arrays;

public class Q4 {

    public static int[] rotateArrayKtimes(int[] arr,int k){

        k = k %arr.length;
        rotate(arr,0,arr.length-1);
        rotate(arr,0,k-1);
        rotate(arr,k, arr.length -1);

        return arr;
    }

    public static void rotate(int[] arr,int start , int end){
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }



    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};


        System.out.println(Arrays.toString(rotateArrayKtimes(arr,2)));
    }
}
