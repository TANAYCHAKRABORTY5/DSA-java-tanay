package Capgemini_Practise_Questions.DsaTypeQues;


//Find the leaders in an array (elements greater than all elements to their right).

import java.util.*;

public class Q6 {

    public static ArrayList<Integer> isLeader(int[] arr){

        ArrayList<Integer> arl = new ArrayList<>();

        int n = arr.length ;
//        int curr = arr[n];
        int leader = arr[n-1];
        arl.add(leader);

        for(int i = n-2;i>=0;i--){
            if(  arr[i] >= leader ){
                leader = arr[i];
                arl.add(leader);
            }
        }

        Collections.reverse(arl);

        return arl;

    }

    public static void main(String[] args) {
        int[] A = {16, 17, 4, 3, 5, 2};



        System.out.println(isLeader(A));
    }
}
