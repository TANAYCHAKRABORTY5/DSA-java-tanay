import java.util.ArrayList;
import java.util.Arrays;

public class recursion_Permutations {
    public static void main(String[] args) {
        per("","abc");
        ArrayList<String> ans =perm("","abc");
        System.out.println(ans);
    }

    static void per(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for(int i=0;i<=p.length() ;i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            per(f+ch+s,up.substring(1));
        }
    }


    // Array format [.....................] use ArrayList
    static ArrayList<String> perm(String p ,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for (int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            ans.addAll(perm(f+ch+s,up.substring(1)));

        }
        return ans;
    }
}
