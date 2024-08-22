package Interview.MountBlue;

public class climbingStairs {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(solve(n));
    }
    public static int solve(int n)
    {
        int dp[] = new int[n+1];
        return help(n, dp);
    }
    public static int help(int n, int dp[])
    {
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<=n;i++)
        {
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
