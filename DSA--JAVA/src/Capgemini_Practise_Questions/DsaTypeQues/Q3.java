package Capgemini_Practise_Questions.DsaTypeQues;

//Given a string, find the longest substring without repeating characters.


import java.util.HashMap;

public class Q3 {

    public static String longestUniqueSubString(String s){

        HashMap<Character,Integer> map = new HashMap<>();

        int left =0;
        int startIndex =0;
        int maxLength =0;

        for(int right =0;right<s.length();right++){
            char c = s.charAt(right);
            if(map.containsKey(c) && map.get(c) >= left){
                left = map.get(c) +1;
            }

            map.put(c,right);

            if(right - left +1 > maxLength){
                maxLength = right - left +1;
                startIndex = left;
            }
        }

        return s.substring(startIndex,startIndex+maxLength);
    }


    public static void main(String[] args) {
        String s = "abcabcbb";

        String result = longestUniqueSubString(s);

        System.out.println("Longest substring: "+ result);
        System.out.println("Length : "+ result.length());
    }
}
