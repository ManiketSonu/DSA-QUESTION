package Advanced_DSA.HasMapp;

import java.util.HashSet;

public class CountDistinctElement {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,1,4};
        System.out.println(DitinctEle(arr));
    }
    public static int DitinctEle(int A[])
    {
        int n = A.length;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            hs.add(A[i]);
        }
        return hs.size();
    }
}
