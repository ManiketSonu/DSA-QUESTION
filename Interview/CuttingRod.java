package Interview;

public class CuttingRod {
    public static void main(String[] args) {
        // int arr[] = {3, 4, 1, 6, 2};
        int arr[] = {1,4,2,3,6};
        System.out.println(solve(arr));
    }
    public static int solve(int arr[])
    {
        int n = arr.length;
        int dp[] = new int[n+1];
        dp[0] = 0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                dp[i] = Math.max(arr[j-1]+dp[i-j], dp[i]);
            }
        }
        return dp[n];
    }
}
