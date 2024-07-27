package Advanced_DSA.Stackk;

import java.util.Stack;

public class RedundentBraces {
    public static void main(String[] args) {
        String A = "((a+b))";
        System.out.println(solve(A));
    }
    public static int solve(String A)
    {
        int n = A.length();
        Stack<Character> st =new Stack<>();
        for(int i=0;i<n;i++){
            char ch = A.charAt(i);
            if(ch==')')
            {
                char top = st.pop();
                boolean isredundent = true;
                while(top!='(')
                {
                    if(top=='+' || top=='-' || top=='*' || top=='/')
                    {
                        isredundent = false;
                    }
                    top = st.pop();
                }
                if(isredundent)
                {
                    return 1;
                }
            }
            else
            {
                st.push(ch);
            }
        }
        return 0;
    }
}
