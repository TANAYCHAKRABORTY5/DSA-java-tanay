import java.util.Arrays;
import java.util.Scanner;

public class Arraysss {

    public static void main(String[] args) {
        //continuous memory aloocation
         //in java arrays may not be continuous due to jvm

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the length of the array::: ");
        int n =sc.nextInt();

        int[] arr =new int[n];
        System.out.println("Enter the Elements");
        for (int i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));


        System.out.println("Enter the element u want to change at 3rd index ::: ");
        int j=sc.nextInt();



    }
}
