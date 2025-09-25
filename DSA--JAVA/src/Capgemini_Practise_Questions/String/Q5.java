package Capgemini_Practise_Questions.String;



//Balanced parentheses in a string

import java.util.HashMap;

public class Q5 {

    public static boolean balancedParentheses(String ans){

        int count =0;

        for(char c : ans.toCharArray()){
            if(c == '(') count++;
            else if(c == ')') {
                count--;
                if(count < 0) return false;
            }
        }

        return count == 0 ;
    }

    public static void main(String[] args) {
        System.out.println(balancedParentheses("(()())"));
        System.out.println(balancedParentheses("())("));
        System.out.println(balancedParentheses("((()))")); 
        System.out.println(balancedParentheses("((())"));
    }
}
