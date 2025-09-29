package ApracticeAccenture;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of Rats : ");
        int r = sc.nextInt();
        System.out.print("Number of Units : ");
        int u = sc.nextInt();
        System.out.print("Size : ");
        int n = sc.nextInt();
        System.out.println("Array : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int requiredFood = r * u;

        int sum= 0;

        for(int i =0;i<n;i++){
            sum += arr[i];
            if(sum >= requiredFood){
                System.out.println(i + 1);
                break;
            }
        }

        if(sum < requiredFood){
            System.out.println(0);
        }
    }
}
