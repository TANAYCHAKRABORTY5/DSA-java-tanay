import java.lang.reflect.Array;
import java.util.ArrayList;

public class recursion_Subseq {
    public static void main(String[] args) {
        sub("","abc");
        System.out.println(subret("","abc"));
    }

    static void sub(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        sub(p+ch,up.substring(1));
        sub(p,up.substring(1));
    }


    //using arraylist to store in array [.........]
    static ArrayList<String> subret(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch =up.charAt(0);
        ArrayList<String> left = subret(p+ch,up.substring(1));
        ArrayList<String> right = subret(p,up.substring(1));

        left.addAll(right);
        return left;
    }
}
