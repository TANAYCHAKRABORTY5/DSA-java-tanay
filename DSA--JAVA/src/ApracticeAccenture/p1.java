package ApracticeAccenture;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();



        int sum = str.charAt(0) - '0';
        for(int i=1;i<str.length();i += 2){
            char val  = str.charAt(i);
            int nextval = str.charAt(i+1) - '0';
            if(val == 'A'){
                sum = sum & nextval;
            }else if(val == 'B'){
                sum = sum | nextval;
            }else if( val == 'C'){
                sum = sum ^ nextval;
            }
        }

        System.out.println(sum);
    }
}
