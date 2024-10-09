package Apractice;


 /* Problem Statement –

Joseph is learning digital logic subject
which will be for his next semester. He usually
tries to solve unit assignment problems before the
lecture. Today he got one tricky question. The problem
statement is “A positive integer has been given as an
input. Convert decimal value to binary representation.
Toggle all bits of it after the most significant bit
including the most significant bit. Print the positive
integer value after toggling all bits”. */


import java.util.Scanner;

public class p2 {

    public static int toggle(int num){
        int bitl = Integer.toBinaryString(num).length();
        int mask = (1 << bitl) -1;

        int togglenum = num ^ mask;

        return togglenum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number : ");
        int num = sc.nextInt();

        int result = toggle(num);

        System.out.println("Number after : " + result);
    }
}
