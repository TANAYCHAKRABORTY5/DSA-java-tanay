package Capgemini_Practise_Questions.Arrays;


//Count frequency of elements in an array. E.g. input array, output how many times each integer appears.

import java.util.HashMap;
import java.util.TreeMap;

public class Q1 {


    public static TreeMap<Integer, Integer> helper(int[] arr){
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        return map;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,7,8,4,6,2,4,6,0,9,8,7,2,1};



        System.out.println(helper(arr));

    }
}
