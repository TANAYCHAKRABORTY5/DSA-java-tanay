package Capgemini_Practise_Questions.Arrays;

//Find the intersection of two arrays.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Q4 {

    // Easy Way

    public static ArrayList<Integer> helper(int[] a,int[] b){


        ArrayList<Integer> arr = new ArrayList<>();
        for( int c : b){
            if(!arr.contains(c)){
                for(int i : a){
                    if(c == i ){
                        arr.add(c);
                        break;
                    }
                }
            }
        }

        return arr;
    }

    // (n * m) tc better code --->

    public static ArrayList<Integer> optimizedHelper(int[] a, int[] b){
        HashSet<Integer> setA = new HashSet<>();
        for(int num : a){
            setA.add(num);
        }

        HashSet<Integer> result = new HashSet<>();
        for(int num : b){
            if(setA.contains(num)){
                result.add(num);
            }
        }
        return new ArrayList<>(result);
    }

    public static void main(String[] args) {

        int[] a = {1,2,2,1};
        int[] b = {2,2};
//        ArrayList<Integer> result = helper(a,b);
        ArrayList<Integer> result = optimizedHelper(a,b);
        System.out.println(result);
    }
}
