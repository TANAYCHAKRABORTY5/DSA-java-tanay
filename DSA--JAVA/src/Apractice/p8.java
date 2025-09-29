package Apractice;


//An international round table conference will
//be held in india. Presidents from all over
//the world representing their respective countries will
//be attending the conference. The task is to find the
//possible number of ways(P) to make the N members sit
//around the circular table such that.
//
//The president and prime
//minister of India will always sit next to each other.

import java.util.Scanner;

public class p8 {

    public static int helper(int n){
        if(n ==0 || n==1 ) return 1;

//        int result =1;
//
//        for(int i=2;i<=n;i++){
//            result *= i;
//        }



        return n * helper(n-1);
    }

    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.print("Total members : ");
        int n = sc.nextInt();

        if(n<2){
            System.out.println("no way");
        }else{
            int ans = helper(n-1);

            int total = 2*ans;

            System.out.println("Total ways " + total);
        }


    }
}
