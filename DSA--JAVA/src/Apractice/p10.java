package Apractice;


//Particulate matters are the biggest contributors
//to Delhi pollution. The main reason behind the increase in the concentration of PMs include vehicle emission by applying Odd Even concept for all types of vehicles. The vehicles with the odd last digit in the registration number will be allowed on roads on odd dates and those with even last digit will on even dates.
//
//Given an integer array a[], contains the last
//digit of the registration number of N vehicles
//traveling on date D(a positive integer). The task
//is to calculate the total fine collected by the
//traffic police department from the vehicles violating
//the rules.
//
//Note : For violating the rule, vehicles would
//be fined as X Rs.

import java.util.Scanner;

public class p10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Array of vehicle : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Date : ");
        int date = sc.nextInt();

        System.out.print("Fine : ");
        int fine = sc.nextInt();

        int ans =0;

        if(date%2 == 0){
            for(int i=0;i<n;i++){
                if(arr[i] % 2 !=0){
                    ans += fine;
                }
            }
        }else{
            for(int i=0;i<n;i++){
                if(arr[i] %2 ==0){
                    ans += fine;
                }
            }
        }


        System.out.println(ans);
    }
}
