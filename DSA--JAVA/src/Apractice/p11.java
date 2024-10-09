package Apractice;

import java.util.Scanner;

public class p11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<str.length();i++){
            char a = str.charAt(i);

            if((a >= 'a' && a<='z') || (a>='A' && a<='Z')){
                sb.append(str.charAt(i));
            }
        }

        System.out.println(sb);

    }
}
