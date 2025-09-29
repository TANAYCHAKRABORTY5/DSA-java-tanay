package ApracticeAccenture;

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Num : ");
        int num =sc.nextInt();

        System.out.println("Diff : ");
        int diff = sc.nextInt();

        int count =0;
        for(int i=0;i<n;i++){
            int a = num -2;
            int b = num +2;
            if(a <= arr[i] && arr[i] <= b){
                count ++;
            }
        }
        System.out.println(count);
    }
}
