package Dynamic_Programming.OneD;

public class ClimbingStairs {
    public static void main(String[] args) {
        int a = 6;
        int res = solve(a);
        System.out.println(res);
    }
    public static int solve(int A){
        int dp[] = new int[A+1];
        return help(A, dp);
    }
    public static int help(int A, int dp[])
    {
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<=A;i++)
        {
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[A];
    }
}
