package BinarySearch;

//Problem Statement: Given two numbers N and M, find the Nth root of M. The nth root of a number M is defined as a number X when raised to the power N equals M. If the nth root is not an integer, return -1.
//Example 1:
//Input Format: N = 3, M = 27
//Result: 3
//Explanation: The cube root of 27 is equal to 3.

public class nthRoot_m {
    public static void main(String[] args) {
        int n=3,m=27;
        int ans = NthRoot(n,m);
        System.out.println("The answer is : " + ans);
    }
    public static int NthRoot(int n,int m){
        int low =1,high =m;
        while(low <= high){
            int mid = low + (high - low)/2;
            long value = power(mid,n);
            if (value == m){
                return mid;
            }else if(value == 0){
                low = mid+1;
            }else{
                high = mid -1;
            }
        }
        return -1;
    }
    public static long power(int base,int exp){
        long res = 1;
        for(int i=0;i<exp;i++){
            res *= base;
            if(res > Integer.MAX_VALUE) return Long.MAX_VALUE;
        }
        return res;
    }
}
