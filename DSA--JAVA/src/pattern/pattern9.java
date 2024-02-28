package pattern;

public class pattern9 {
    public static void main(String[] args) {
        int n=4;
        int a=n;
        n=2*n;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                int atidx =a-Math.min(Math.min(i,j),Math.min(n-i,n-j));
                System.out.print(atidx+" ");
            }
            System.out.println();
        }
    }
}
