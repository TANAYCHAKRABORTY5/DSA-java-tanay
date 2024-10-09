package Apractice;

//A furnishing company is manufacturing a new
//collection of curtains. The curtains are of two
//colors aqua(a) and black (b). The curtains color
//is represented as a string(str) consisting of a’s
//and b’s of length N. Then, they are packed (substring)
//into L number of curtains in each box. The box with the
//maximum number of ‘aqua’ (a) color curtains is labeled.
//The task here is to find
//the number of ‘aqua’ color curtains in the labeled box.


import java.util.Scanner;

public class p7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.print("Size :");
        int n = sc.nextInt();

        int count =0;
        int max=0;
        for(int i=0;i<str.length();i++){

            if(i%n == 0){
                max = Math.max(count,max);
                count=0;
            }

            if(str.charAt(i) == 'a') {
                count++;
            }
        }
        max = Math.max(max,count);
        System.out.println(max);
    }

}
