package Capgemini_Practise_Questions.DsaTypeQues;


//Find the intersection of two arrays

import java.util.HashSet;

public class Q9 {

    public static HashSet<Integer> intersection(int[] arr1,int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for(int i : arr1){
            set.add(i);
        }

        for(int j : arr2){
            if(set.contains(j)){
                result.add(j);
            }
        }

        return result;
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 2, 1};
        int[] arr2 = {3, 2, 2, 3, 3, 2};

        HashSet<Integer> arr = intersection(arr1,arr2);
        System.out.println(arr);
    }
}
