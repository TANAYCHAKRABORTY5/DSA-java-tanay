package Capgemini_Practise_Questions.DsaTypeQues;

//Write a program to merge two sorted arrays into one sorted array.


import java.util.Arrays;

public class Q7 {

    public static int[] mergeArrays(int[] arr1,int[] arr2){

        int i=0,j=0,k=0;
        int n1 = arr1.length,n2 = arr2.length;
        int[] merged = new int[n1+n2];

        while(i < n1 && j < n2){
            if(arr1[i] < arr2[j]){
                merged[k++] = arr1[i++];
            }else{
                merged[k++] = arr2[j++];
            }

        }

        while(i < n1){
            merged[k++] = arr1[i];
            i++;
        }
        while(j < n2){
            merged[k++] = arr1[j];
            j++;
        }


        return merged;

    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 3, 6, 8};

        int[] merged = mergeArrays(arr1,arr2);
        System.out.println(Arrays.toString(merged));
    }
}
