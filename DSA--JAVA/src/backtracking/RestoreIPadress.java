package backtracking;

import javax.swing.text.Segment;
import java.util.ArrayList;
import java.util.List;

public class RestoreIPadress {

    public List<String> restore(String s){
        List<String> result = new ArrayList<>();
        if(s.length()< 4 || s.length()>12){
            return result;
        }

        backtrack(s,0,new ArrayList<>(),result);
        return result;
    }
    private void backtrack(String s,int start,List<String> seg,List<String> result){
        if(seg.size() == 4){
            if(start == s.length()){
                result.add(String.join(".",seg));
            }
            return;
        }

        for(int i=1;i<=3;i++){
            if(start + i > s.length()){
                break;
            }

            String segment = s.substring(start,start+i);

            if(isValid(segment)){
                seg.add(segment);
                backtrack(s,start+i,seg,result);
                seg.remove(seg.size()-1);
            }
        }
    }

    private boolean isValid(String seg){
        if(seg.length()>1 && seg.startsWith("0")) return false;
        int val = Integer.parseInt(seg);
        return val>=0 && val <=255;
    }

    public static void main(String[] args) {

        RestoreIPadress sol = new RestoreIPadress();
        String s = "25525511135";
        List<String> ip = sol.restore(s);
        System.out.println(ip);
    }
}
