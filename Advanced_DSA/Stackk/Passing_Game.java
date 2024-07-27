package Advanced_DSA.Stackk;

import java.util.Stack;

public class Passing_Game {
    public static void main(String[] args) {
        int C[] = {23,0,2,0,39,28,19,0,0,0};
        int A = 10;
        int B = 38;
        System.out.println(solve(A, B, C));
    }
    public static int solve(int A, int B, int C[])
    {
        Stack<Integer> hs = new Stack<>();
        hs.push(B);
        for(int i=0;i<A;i++)
        {
            if(C[i]==0)
            {
                hs.pop();
            }
            else
            {
                hs.push(C[i]);
            }
        }
        return hs.peek();
    }
}
