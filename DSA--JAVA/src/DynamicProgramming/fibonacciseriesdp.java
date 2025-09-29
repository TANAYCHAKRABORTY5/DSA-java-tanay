package DynamicProgramming;

import java.util.Arrays;

public class fibonacciseriesdp {
    private int[] memo;

    public fibonacciseriesdp(int n){
        memo = new int[n+1];
        Arrays.fill(memo,-1);
    }

    public int fib(int n){
        if( n == 0) return 0;
        if( n == 1) return 1;

        if(memo[n] != -1) return memo[n];

        memo[n] = fib(n-1) + fib(n-2);

        return memo[n];
    }

    // to print the series not sum

    public void printfib(int n){
        for (int i =0;i<=n ;i++){
            System.out.print(fib(i) + " ");
        }
    }
    public static void main(String[] args) {
        int n =10;

        fibonacciseriesdp fb  =new fibonacciseriesdp(n);

        System.out.println(fb.fib(n));

        fb.printfib(n);
    }
}
