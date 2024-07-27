package Advanced_DSA.HasMapp;

import java.util.HashMap;

public class LongestSubArrayZeroSum {
    public static void main(String[] args) {
        int arr[] = {1, -2, 1, 2};
        System.out.println(solve(arr));
    }
    public static int solve(int arr[])
    {
        int n = arr.length;
        int maxlength = 0;
        HashMap<Integer, Integer> hs = new HashMap<>();
        int sum = 0;
        for(int i=0;i<n;i++)
        {   
            sum = sum+arr[i];
            if(arr[i]==0 && maxlength==0)
            {
                maxlength = 1;
            }
            if(sum==0)
            {
                maxlength = Math.max(maxlength, i + 1);
            }
            if(hs.containsKey(sum))
            {
                maxlength = Math.max(maxlength,i-hs.get(sum));
            }
            else
            {
                hs.put(sum, i);
            }
        }
        return maxlength;
    }
}
