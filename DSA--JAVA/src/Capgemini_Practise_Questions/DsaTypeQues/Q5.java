package Capgemini_Practise_Questions.DsaTypeQues;

//Implement a program to check balanced parentheses using Stack.


import java.util.Stack;

public class Q5 {

    public static boolean validParentheses(String s){
        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '(' || c =='{' || c == '[') st.push(c);
            else if(c == ')' || c == '}' || c == ']'){
                if(st.isEmpty()) return false;
                char top = st.pop();

                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')
                ) {
                    return false;
                }
            }
        }


        return st.isEmpty();
    }


    public static void main(String[] args) {
        String s = "({[()})";
        System.out.println("the parentheses is balanced : " + validParentheses(s));
    }
}
