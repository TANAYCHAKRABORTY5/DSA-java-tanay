package Apractice;


//An intelligence agency has received reports about some
//threats. The reports consist of numbers in a mysterious
//method. There is a number “N” and another number “R”.
//Those numbers are studied thoroughly and it is concluded
//that all digits of the number ‘N’ are summed up and this
//action is performed ‘R’ number of times. The resultant is
//also a single digit that is yet to be deciphered. The task
//here is to find the single-digit sum of the given number
//        ‘N’ by repeating the action ‘R’ number of times.
//
//If the value of ‘R’ is 0, print the output as ‘0’.

import java.util.Scanner;

public class p9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print("number of times : ");
        int a= sc.nextInt();

        int sum =0;
        while(n >0){
            sum += n%10;
            n=n/10;
        }

        sum = sum*a;
        int ans=0;
        while(sum >0){
            ans += sum%10;
            sum = sum/10;
        }

        System.out.println(ans);
    }
}
