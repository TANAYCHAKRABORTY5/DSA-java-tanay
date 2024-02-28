import java.util.Scanner;

public class armstrong_no {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number :: ");
        int a = sc.nextInt();

        System.out.println(arm(a));
    }

    static boolean arm(int num){
        int org = num;
        int result =0;
        while(num >0){
            int b =num%10;
            num =num/10;
            result = result + b*b*b;


        }
        return result==org;
    }
}
// 153 = 1^3 + 5^3 + 3^3