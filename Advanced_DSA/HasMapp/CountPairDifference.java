package Advanced_DSA.HasMapp;

import java.util.HashMap;

public class CountPairDifference {
    public static void main(String[] args) {
        int arr[] = {3, 5, 1, 2};
        System.out.println(solve(arr, 4));
    }
    public static int solve(int arr[], int k)
    {
        int n = arr.length;
        int ans = 0;
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int ele = arr[i];
            int compl = ele+k;
            if(hs.containsKey(compl))
            {
                ans = ans+hs.get(compl);
            }
            if(hs.containsKey(ele-k))
            {
                ans = ans+hs.get(ele-k);
            }
            hs.put(ele, hs.getOrDefault(ele, 0)+1);
        }
        return ans;
    }
}
