package Interview.MountBlue;

import java.util.Stack;

public class Evaluate_parenthesis {
    public static void main(String[] args) {
        String s = "(()(()))";
        int res = solve(s);
        System.out.println(res);
    }
    public static int solve(String s)
    {
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(char c:s.toCharArray())
        {
            if(c=='(')
            {
                st.push(0);
            }
            else
            {
                int innerScore = st.pop();
                int outerScore = st.pop();
                int newScore = outerScore + Math.max(2*innerScore,1);
                st.push(newScore);
            }
        }
        return st.pop();
    }
}
