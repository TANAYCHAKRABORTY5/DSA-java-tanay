import java.util.Scanner;
import java.util.regex.Pattern;

//Pattern
//   *
//  ***
// *****
//*******

public class Pattern_1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("number of star ::: ");
        int n= sc.nextInt();
        for (int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k < 2 *i +1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
