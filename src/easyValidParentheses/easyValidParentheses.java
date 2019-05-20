package easyValidParentheses;

import java.util.Stack;

public class easyValidParentheses {
    public boolean isValid(String s) {


        Stack<Character> stack = new Stack<>();
        char[] str = s.toCharArray();
        for (char ch : str) {
            if (ch == '{') {
                stack.push('}');
            } else if (ch == '[') {
                stack.push(']');
            } else if (ch == '(') {
                stack.push(')');
            } else if (stack.isEmpty() || (stack.pop() != ch)) return false;
        }
        return stack.isEmpty();

    }
}
