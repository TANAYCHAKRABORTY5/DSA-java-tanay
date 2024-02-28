import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Array size");
        int n= sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array :: ");
        for(int i = 0; i<n; i++){
            arr[i]=sc.nextInt();
        }


        System.out.println("Enter the value you want to search:: ");
        int ele=sc.nextInt();

        System.out.println(linearsearch(n,arr,ele));

        System.out.println(minimum(arr,n));
    }

    static int linearsearch( int n, int[] arr,int ele){

        for (int i=0;i<n;i++){

            if(arr[i]==ele){
                return i;
            }
        }
        return -1;
    }

    static int minimum(int[] arr,int n){
        int ans =arr[0];
        for (int i=0;i<n;i++){
            if(arr[i] < ans){
                ans=arr[i];
            }
        }
        System.out.println("the minimum value of the array is ::: ");
        return ans;
    }
}
