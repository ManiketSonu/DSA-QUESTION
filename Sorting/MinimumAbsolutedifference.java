package Sorting;

import java.util.Arrays;

public class MinimumAbsolutedifference {
    public static void main(String[] args) {
        int arr[] = {5,17,100,11};
        System.out.println(solve(arr));
    }
    public static int solve(int arr[])
    {
        int n = arr.length;
        int ans = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++)
        {
            int diff = Math.abs(arr[i]-arr[i+1]);
            if(diff<ans)
            {
                ans = diff;
            }
        }
        return ans;
    }
    // public static int solve(int arr[])
    // {
    //     int n = arr.length;
    //     Arrays.sort(arr);
    //     int res = 0;
    //     int ans = Integer.MAX_VALUE;
    //     for(int i=0;i<n-1;i++)
    //     {
    //         for(int j=i+1;j<n;j++)
    //         {
    //             res =  arr[j]-arr[i];
    //             ans = Math.min(res,ans);
    //         }
    //     }
    //     return ans;
    // }
}
