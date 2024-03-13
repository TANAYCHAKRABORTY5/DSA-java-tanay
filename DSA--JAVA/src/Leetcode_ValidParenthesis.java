
import java.util.Stack;

public class Leetcode_ValidParenthesis {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char openBracket = stack.pop();
                if ((c == ')' && openBracket != '(') ||
                        (c == '}' && openBracket != '{') ||
                        (c == ']' && openBracket != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input1 = "()";
        String input3 = "(]";
        String input4 = "([)]";
        
        System.out.println(isValid(input1));
        System.out.println(isValid(input3));
        System.out.println(isValid(input4));
    }
}
