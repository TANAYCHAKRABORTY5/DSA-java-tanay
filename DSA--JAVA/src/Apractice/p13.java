package Apractice;

import java.util.Scanner;


//Sum of the numbers in a String

public class p13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int count =0;
        int ans=0;
        boolean w=false;

        for(int i=0;i<str.length();i++){
            char s = str.charAt(i);
            if(Character.isDigit(s)){
                count = count *10 + (s - '0');
                w=true;
            }else{
                if(w){
                    ans += count;
                    count=0;
                    w=false;
                }
            }
        }

        if(w){
            ans += count;
        }

        System.out.println(ans);
    }
}
