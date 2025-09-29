package DynamicProgramming;

public class fiibonacciseriesBottomUp {

    public static int[] fib(int n){
        int A[] =new int[n+1];
        A[0] = 0;A[1] = 1;
        for(int i=2;i<=n;i++){
            A[i] = A[i-1] + A[i-2];
        }
        return A;
    }
    private static void printfib(int n,int[] A){
        for (int i = 0; i <= n; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 10;

        int[] a= fib(n);
        printfib(n,a);
    }
}
