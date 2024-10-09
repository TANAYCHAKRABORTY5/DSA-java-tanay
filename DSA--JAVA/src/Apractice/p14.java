package Apractice;

import java.util.Scanner;

public class p14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder sb= new StringBuilder();

        if(str.length() > 0){
            sb.append(Character.toUpperCase(str.charAt(0)));

            for(int i=1;i<str.length();i++){

                sb.append(str.charAt(i));
                if(str.charAt(i) == ' ' && i-1>=0 && str.charAt(i-1) != ' '){
                    sb.setCharAt(i-1,Character.toUpperCase(str.charAt(i-1)));
                }

                if(i+1 < str.length() && str.charAt(i) == ' ' &&  str.charAt(i+1) != ' '){
                    sb.setCharAt(i+1,Character.toUpperCase(str.charAt(i+1)));
                }

            }
        }


        if(str.length() > 0 && str.charAt(str.length() -1) != ' '){
            sb.setCharAt(str.length()-1,Character.toUpperCase(str.charAt(str.length()-1)));
        }

        System.out.println(sb.toString());

    }
}
