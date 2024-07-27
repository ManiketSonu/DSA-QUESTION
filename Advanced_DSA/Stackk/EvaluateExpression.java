package Advanced_DSA.Stackk;

import java.util.Stack;

public class EvaluateExpression {
    public static void main(String[] args) throws IllegalAccessException {
        String A[] = {"2", "1", "+", "3", "*"};
        System.out.println(solve(A));
    }
    public static int solve(String A[]) throws IllegalAccessException
    {
        int n = A.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++)
        {
            String token = A[i];
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/"))
            {
                if(st.size()<2)
                {
                    throw new IllegalArgumentException("Invalid Expression"); 
                }
                int opreand2 = st.pop();
                int opreand1 = st.pop();
                int result;
                switch (token) 
                {
                    case "+":
                        result = opreand1+opreand2;
                        break;
                    case "-":
                        result = opreand1-opreand2;
                        break;
                    case "*":
                        result = opreand1*opreand2;
                        break;
                    case "/":
                        if(opreand2==0)
                        {
                            throw new ArithmeticException("Division byt zero");
                        }
                        result = opreand1/opreand2;
                        break;
                    default:
                        throw new IllegalAccessException("Invalid opreator"+token);
                }
                st.push(result);
            }
            else
            {
                st.push(Integer.parseInt(token));
            }
        }
        if(st.size()!=1)
        {
            throw new IllegalArgumentException("Invalid expression");
        } 
        return st.pop(); 
    }
}
