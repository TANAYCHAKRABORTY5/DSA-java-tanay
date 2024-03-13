public class palindrome2 {
    public static void main(String[] args) {
        System.out.println(ispalindrome(-1));
    }
    public static boolean ispalindrome(int x){
        if (x<0){
            return false;
        }

        int reversed = 0;
        int temp = x;

        while(temp != 0){
            int digit =(int)(temp%10);
            reversed = reversed *10+digit;
            temp/=10;
        }
        return (reversed == x);
    }
}
