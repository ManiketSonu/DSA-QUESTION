package Dynamic_Programming.TwoD;

import java.util.Arrays;

public class MaxPathSumFalling {
    public static void main(String[] args) {
        int A[][] = {{2,1,3},{6,5,4},{7,8,9}};
        int res = solve(A);
        System.out.println(res);
    }
    public static int solve(int A[][])
    {
        int n = A.length;
        int m = A[0].length;
        int dp[][] = new int[n][m];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(dp[i], -1);
        }
        int maxSum = Integer.MIN_VALUE;
        
        for(int j=0;j<m;j++)
        {
            maxSum = Math.max(maxSum, help(n-1, j, A, dp));
        }
        return maxSum;
    }
    public static int help(int i, int j, int A[][], int dp[][])
    {
        // int n = A.length;
        if(j<0 || j>=A[0].length)
        {
            return Integer.MIN_VALUE;
        }

        if(i==0)
        {
            return A[0][j];
        }

        int u = A[i][j] + help(i-1, j, A, dp);
        int ld = A[i][j] + help(i-1, j-1, A, dp);
        int rd = A[i][j] + help(i-1, j-1, A, dp);
        
        return dp[i][j] =  Math.max(u, Math.max(ld, rd));
    }
}
