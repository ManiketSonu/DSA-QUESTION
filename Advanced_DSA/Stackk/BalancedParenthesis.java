package Advanced_DSA.Stackk;

import java.util.Stack;

public class BalancedParenthesis {
    public static void main(String[] args) {
        String A = "{([])}";
        System.out.println(solve(A));
    }
    public static int solve(String A)
    {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<A.length();i++)
        {
            if(A.charAt(i)=='(' || A.charAt(i)=='{' || A.charAt(i)=='[')
            {
                st.push(A.charAt(i));
            }
            else if(A.charAt(i)==')' || A.charAt(i)=='}' || A.charAt(i)==']')
            {
                if(st.isEmpty())
                {
                    return 0;
                }
                char top = st.peek();
                st.pop();
                if(A.charAt(i)==')')
                {
                    if(top!='(')
                    {
                        return 0;
                    }
                }
                if(A.charAt(i)=='}')
                {
                    if(top!='{')
                    {
                        return 0;
                    }
                }
                if(A.charAt(i)==']')
                {
                    if(top!='[')
                    {
                        return 0;
                    }
                }
            }
        }
        if(!st.isEmpty())
        {
            return 0;
        }
        return 1;
    }
}
