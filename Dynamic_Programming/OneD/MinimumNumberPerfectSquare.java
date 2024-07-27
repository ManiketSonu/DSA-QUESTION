package Dynamic_Programming.OneD;

public class MinimumNumberPerfectSquare {
    public static void main(String[] args) {
        int A = 12;
        int res = solve(A);
        System.out.println(res);
    }
    public static int solve(int A)
    {
        int dp[] = new int[A+1];
        return help(A, dp);
    }
    public static int help(int A, int dp[])
    {
        dp[0] = 0;
        for(int i=1;i<=A;i++)
        {
            int ans = Integer.MAX_VALUE;
            for(int j=1;j*j<=i;j++)
            {
                ans = Math.min(ans, dp[i-j*j]);
            }
            dp[i] = ans+1;
        }
        return dp[A];
    }
}
