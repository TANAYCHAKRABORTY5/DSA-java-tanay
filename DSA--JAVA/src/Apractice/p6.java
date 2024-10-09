package Apractice;


//A supermarket maintains a pricing format for
//all its products. A value N is printed on each product.
//When the scanner reads the value N on the item, the product
//of all the digits in the value N is the price of the item.
//The task here is to design the software such that given the
//code of any item N the product (multiplication)
//of all the digits of value should be computed(price).

import java.util.Scanner;

public class p6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 1;
        while(n  > 0){
            count *=n%10;
            n=n/10;
        }
        System.out.println(count);
    }

}
