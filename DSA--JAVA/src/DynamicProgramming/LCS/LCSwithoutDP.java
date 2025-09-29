package DynamicProgramming.LCS;

// time complexity = O(2^n)
//use DP for further optimization
public class LCSwithoutDP {

    static int lcs(int m,int n,String a,String b){
        if(m==0 || n==0){
            return 0;
        }

        if(a.charAt(m-1) == b.charAt(n-1)){
            return 1+ lcs(m-1,n-1,a,b);
        }else{
            return Math.max(lcs(m,n-1,a,b),lcs(m-1,n,a,b));
        }

    }

    public static void main(String[] args) {

        int ans = lcs(5,4, "ABCAB", "PBCC");
        System.out.println(ans);
    }
}
