import java.util.ArrayList;
import java.util.List;

public class fibonanci_series {
    public static int  helper(int n){
        if(n<=1) return 1;
        return helper(n-1) + helper(n-2);
    }
    public static void main(String[] args) {
        int n =10;
        for(int i=0;i<n;i++){
            System.out.print(helper(i) + " ");
        }

//        List<Integer> arr = new ArrayList<>();
//        int n = 50;
//        int a =5;
//        int b=5;
//       arr.add(a);
//       arr.add(b);
//        for(int i=2;i<n;i++){
//            int ans = a+b;
//            arr.add(ans);
//            a=b;
//            b=ans;
//        }
//        System.out.println(arr);
//        System.out.println(arr);
        
    }
}
