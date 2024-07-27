package Dynamic_Programming.OneD;

public class MaximumSumWithoutAdjecent {
    public static void main(String[] args) {
        int arr[] = {2,1,4,9};
        int res = solve(arr);
        System.out.println(res);
    }
    //space optimisation
    public static int solve(int arr[])
    {
        int n = arr.length;
        int prev = arr[0];
        int prev2 = 0;
        for(int i=0;i<n;i++)
        {
            int tkae = arr[i];
            if(i>1)
            {
                tkae = tkae+prev2;
            }
            int nontkae = 0+prev;
            int curri = Math.max(tkae, nontkae);
            prev2 = prev;
            prev = curri;
        }
        return prev;
    }
    //tabulation
    // public static int solve(int arr[])
    // {
    //     int n = arr.length;
    //     int dp[] = new int[n];
    //     dp[0] = arr[0];
    //     for(int i=1;i<n;i++)
    //     {
    //         int take = arr[i];
    //         if(i>1)
    //         {
    //             take = take+dp[i-2];
    //         }
    //         int nottake = 0+dp[i-1];
    //         dp[i] = Math.max(take, nottake);
    //     }
    //     return dp[n-1];
    // }

    //memoisation
    // public static int solve(int arr[])
    // {
    //     int n = arr.length;
    //     return help(n-1, arr);
    // }
    // public static int help(int i, int arr[])
    // {
    //     if(i==0)
    //     {
    //         return arr[i];
    //     }
    //     if(i<0)
    //     {
    //         return 0;
    //     }

    //     int pick = arr[i]+help(i-2, arr);
    //     int notpick = 0+help(i-1, arr);
    //     return Math.max(pick, notpick);
    // }
}
