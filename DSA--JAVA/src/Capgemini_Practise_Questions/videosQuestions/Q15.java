package Capgemini_Practise_Questions.videosQuestions;

import java.util.HashSet;

class Pangram{
    public int minimumAlphabet(String str){
        HashSet<Character> mp = new HashSet<>();
        str = str.toLowerCase();
        for(char c : str.toCharArray()){
            if(c>= 'a' && c<= 'z'){
                mp.add(c);
            }
        }
        return 26 - mp.size();
    }

}


public class Q15 {

    public static void main(String[] args) {
        Pangram p = new Pangram();
        String str = "acdfghijklmnopqrsTuvxyz";
        System.out.println(p.minimumAlphabet(str));
    }
}
