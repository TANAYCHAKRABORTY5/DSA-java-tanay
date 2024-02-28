import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        System.out.print("Enter the operation :: ");
        char op = io.next().trim().charAt(0);

        if(op == '+' || op=='-' || op == '*' || op == '%' || op == '/'){
            System.out.print("Enter first number :: ");
            int a = io.nextInt();
            System.out.print("Enter second number :: ");
            int b = io.nextInt();
            if ( op == '+'){
                System.out.println("Adding the numbers..........................");
                int c = a+b;
                System.out.println(c);
            }if ( op == '-'){
                System.out.println("Subtracting the numbers..........................");
                int c = a-b;
                System.out.println(c);
            }if ( op == '*'){
                System.out.println("Multiplying the numbers..........................");
                int c = a*b;
                System.out.println(c);
            }if ( op == '%'){
                System.out.println("Remainder the numbers..........................");
                int c = a%b;
                System.out.println(c);
            }if ( op == '/') {
                System.out.println("Division the numbers..........................");
                int c = a / b;
                System.out.println(c);
            }
        }else {
            System.out.println("invalid");
        }
    }
}
