package Advanced_DSA.HasMapp;

import java.util.HashMap;

public class CountPairSum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 2};
        System.out.println(CPairSum(arr, 3));
    }
    public static int CPairSum(int arr[], int k)
    {
        int n = arr.length;
        int ans = 0;
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int ele = arr[i];
            int compl = k-arr[i];
            if(hs.containsKey(compl))
            {
                ans = ans+hs.get(compl);
            }
            if(hs.containsKey(ele))
            {
                hs.put(ele, hs.get(ele)+1);
            }
            else
            {
                hs.put(ele, 1);
            }
        }
        return ans;
    }
}
