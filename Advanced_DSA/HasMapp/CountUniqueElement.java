package Advanced_DSA.HasMapp;

import java.util.HashMap;

public class CountUniqueElement {
    public static void main(String[] args) {
        int A[] = {3, 4, 3, 6, 6};
        System.out.println(Solve(A));
    }
    public static int Solve(int A[])
    {
        int n = A.length;
        int Ans = 0;
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(hs.containsKey(A[i]))
            {   
                int count = hs.get(A[i]);
                hs.put(A[i], count+1);
            }
            else
            {
                hs.put(A[i], 1);
            }
        }
        for(int i=0;i<n;i++)
        {
            if(hs.get(A[i])==1)
            {
                Ans++;
            }
        }
        return Ans;
    }
}
