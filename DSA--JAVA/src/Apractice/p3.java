package Apractice;


/* jack is always excited about sunday. It is favourite
day, when he gets to play all day. And goes to cycling
with his friends.

So every time when the months starts he
counts the number of sundays he will get to enjoy.
Considering the month can start with any day, be it Sunday
, Monday…. Or so on.

Count the number of Sunday jack will get within
n number of days. */


import java.util.Scanner;

public class p3 {

    public static int dayhelp(String day){
        switch(day.toLowerCase()){
            case "sunday":
                return 0;
            case "monday":
                return 1;
            case "tuesday":
                return 2;
            case "wednesday":
                return 3;
            case "thursday":
                return 4;
            case "friday":
                return 5;
            case "saturday":
                return 6;
            default:
                throw new IllegalArgumentException("Invalid day: " + day);
        }
    }


    public static int helper(String day,int tday){
        int sun =0;
        int curr = dayhelp(day);

        for(int i=0;i<tday;i++){
            if(curr == 0){
                sun++;
            }
            curr = (curr + 1) %7;
        }
        return sun;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Starting day : ");
        String day = sc.next();

        System.out.print("Number of days :");
        int totaldays = sc.nextInt();

        int result = helper(day,totaldays);

        System.out.println("Number of sundays :" + result);
    }
}
