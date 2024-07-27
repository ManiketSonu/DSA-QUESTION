package Dynamic_Programming.TwoD;

public class MaximumSubSequqence {
    public static void main(String[] args) {
        int arr[] = {5,3,2,10,4,1,2};
        System.out.println(solve(arr));
    }
    public static int solve(int arr[])
    {
        int n = arr.length;
        int dp[] = new int[n];
        dp[0] = arr[0];
        dp[1] = Math.max(dp[0], arr[1]);
        for(int i=2;i<n;i++)
        {
            dp[i] = Math.max(arr[i]+dp[i-2], dp[i-1]);
        }
        return dp[n-1];
    }
    // public static int solve(int arr[])
    // {
    //     int n = arr.length;
    //     int sum = 0;
    //     for(int i=0;i<n;i++)
    //     {
    //         if(arr[i]<0)
    //         {
    //             continue;
    //         }
    //         sum = sum+arr[i];
    //     }
    //     return sum;
    // }
}
