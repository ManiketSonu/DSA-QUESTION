package Advanced_DSA.HasMapp;

import java.util.HashMap;

public class FirstRepeatingElement {
    public static void main(String[] args) {
      //  int A[] = {10, 5, 3, 4, 3, 5, 6,10};
      int[] A = {1,2,3,1,2,5};
        System.out.println(Rep(A));
    }
    
    public static int Rep(int A[])
    {
        int n = A.length;
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
            if(hs.get(A[i])==hs.get(A[i+1]))
            {
                return A[i];
            }
        }
        return -1;
    }
}
