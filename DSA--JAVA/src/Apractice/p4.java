package Apractice;

//Airport security officials have
//confiscated several item of the passengers at
//the security check point. All the items have been
//dumped into a huge box (array). Each item possesses a
//certain amount of risk[0,1,2]. Here, the risk severity
//of the items represent an array[] of N number of integer
//values. The task here is to sort the items based on their
//levels of risk in the array.
//The risk values range from 0 to 2.


import java.util.Scanner;

public class p4 {

    public static void helper(int n,int[] arr){
        int low =0,mid=0;
        int high = n-1;

        while(mid <= high){
            switch(arr[mid]){
                case 0:
                    int temp = arr[mid];
                    arr[mid] = arr[low];
                    arr[low] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    int tempp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = tempp;

                    high--;
                    break;
            }
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Size : ");
        int n = sc.nextInt();

        System.out.println("Array : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        helper(n,arr);

        System.out.println("Sorted arr");

        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
