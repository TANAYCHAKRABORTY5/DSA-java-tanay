public class Ntol {
    public static void main(String[] args) {
        fun(5);
        Revfun(5);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
    static void Revfun(int n){
        if(n==0){
            return;
        }
        fun(n-1);
        System.out.println(n);
    }
}
