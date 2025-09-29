package Capgemini_Practise_Questions.String;

// Anangram of a String

import java.util.HashMap;

public class Q4 {

    public static boolean helper(String a,String b){
        if(a.length() != b.length()) return false;

        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : a.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(char c : b.toCharArray()){
            if(!map.containsKey(c)) return false;
            map.put(c,map.get(c)-1);
            if(map.get(c) == 0) map.remove(c);
        }

        return map.isEmpty();
    }

    public static void main(String[] args) {
        String a =  "laaisten";
        String b = "sileaant";

        boolean c = helper(a , b);

        if(c) System.out.println("Both are anagrams of each other");
        else System.out.println(" Not anagrams ");
    }
}
