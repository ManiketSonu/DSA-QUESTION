package Advanced_DSA.HasMapp;

import java.util.HashMap;

public class FirstNonRepetingElement {
    public static void main(String[] args) {
        int A[] = {4,3,1,2,5,6,4,5,3};
        System.out.println(NonRep(A));
    }
    public static int NonRep(int A[])
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
            if(hs.get(A[i])==1)
            {
                return A[i];
            }
        }
        return -1;
    }
}
