public class reverse_recursion {
    static int sum = 0;
    static void reverse(int n){
        if(n==0){
            return;
        }
        int rem =n%10;
        sum = sum * 10 +rem;
        reverse(n/10);
    }

    public static void main(String[] args) {
        reverse(1234);
        System.out.println(sum);
    }
}
