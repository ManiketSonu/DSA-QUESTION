package Advanced_DSA.Recursion.Bactracking;

import java.util.ArrayList;
public class Generate_Parenthesis {
    public static void main(String[] args) {
        int n=3;
        String result[] = generateParenthesis(n);
        for(int i=0;i<result.length;i++)
        {
            System.out.println(result[i]);
        }
    }
    public static String[] generateParenthesis(int A)
    {
        if(A<=0)
        {
            return new String[]{};
        }
        ArrayList<String> result = new ArrayList<>();
        Prenethesis("", A, 0, 0, result);
        return result.toArray(new String[0]);
    }
    public static void Prenethesis(String str, int n, int open, int close, ArrayList<String> result)
    {
        if(open==n && close==n)
        {
            result.add(str);
            return;
        }
        if(open<n)
        {
            Prenethesis(str+"(", n, open+1, close, result);
        }
        if(close<open)
        {
            Prenethesis(str+")", n, open, close+1, result);
        }
    }
}
