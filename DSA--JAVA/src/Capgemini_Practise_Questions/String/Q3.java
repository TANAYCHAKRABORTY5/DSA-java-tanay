package Capgemini_Practise_Questions.String;


//Q3 -> First non‐repeating / duplicate characters in a string. E.g. find the first character in a string that does not repeat. (Also reverse, anagrams, etc.)

import java.util.HashMap;

public class Q3 {

    public static char firstNonRepeat(String sc){
        HashMap<Character,Integer> mp = new HashMap<>();
        for(char c : sc.toCharArray()){
            mp.put(c, mp.getOrDefault(c,0)+1);
        }

        for(char c : sc.toCharArray()){
            if(mp.get(c) == 1){
                return c;
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        String sc= "racecar";

        char result = firstNonRepeat(sc);

        System.out.println(result);

    }
}
