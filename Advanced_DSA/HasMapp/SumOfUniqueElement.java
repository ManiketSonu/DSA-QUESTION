package Advanced_DSA.HasMapp;

import java.util.HashMap;

public class SumOfUniqueElement {
    public static void main(String[] args) {
        int arr[] = {3, 4, 3, 6, 6};
        System.out.println(SumUnique(arr));
    }
    public static int SumUnique(int A[])
    {
        int n = A.length;
        int sum = 0;
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
                hs.put(A[i],1);
            }
        }
        for(int i=0;i<n;i++)
        {
            if(hs.get(A[i])==1)
            {
                sum = sum+A[i];
            }
        }
        return sum;
    }
}
