package Dynamic_Programming.TwoD;

import java.util.Arrays;

public class MinPathSumTraingle {
    public static void main(String[] args) 
    {
        int A[][] = {{2},{3,4},{6,5,7},{4,1,8,3}};
        int res = solve(A);
        System.out.println(res);
    }
    public static int solve(int A[][])
    {
        int n = A.length;
        int dp[][] = new int[n][n];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(dp[i], -1);
        }

        return help(0, 0, A, dp);
    }
    public static int help(int i, int j, int A[][], int dp[][])
    {
        int n = A.length;
        if(i==n-1)
        {
            return A[n-1][j];
        }
        
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int d = A[i][j]+help(i+1, j, A, dp);
        int diag = A[i][j]+help(i+1, j+1, A, dp);
        
        dp[i][j] = Math.min(d, diag);
        return dp[i][j];
    }
}
