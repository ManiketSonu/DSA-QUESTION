package Advanced_DSA.Stackk;

import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        String A = "x^y/(a*z)+b";
        System.out.println(solve(A));
    }
    public static int precedence(char operator) {
        switch(operator) {
            case '^':
                return 3;
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                return 0;
        }
    }
    public static String solve(String A) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        
        for (char ch : A.toCharArray()) {
            if (Character.isLetter(ch)) {
                postfix.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop();  // Remove '('
            } else {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)) {
                    postfix.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }
        
        return postfix.toString();
    }
}
