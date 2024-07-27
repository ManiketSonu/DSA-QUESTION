package Dynamic_Programming.TwoD;

import java.util.Arrays;

public class MinPathSumFalling {
    public static void main(String[] args) {
        int A[][] = {{2,1,3},{6,5,4},{7,8,9}};
        int res = solve(A);
        System.out.println(res);
    }
    public static int solve(int matrix[][])
    {
        int n = matrix.length;
        int minSum = Integer.MAX_VALUE;
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
            minSum = Math.min(minSum, matrix[0][i]);
        }
        
        // Start from each element in the first row
        for (int j = 0; j < n; j++) {
            minSum = Math.min(minSum, help(matrix, n - 1, j, dp));
        }
        return minSum;
    }
    public static int help(int[][] matrix, int i, int j, int[][] dp) {
        int n = matrix.length;
        if (j < 0 || j >= n) {
            return Integer.MAX_VALUE;
        }
        if (i == 0) {
            return matrix[0][j];
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        
        int u = matrix[i][j] + help(matrix, i - 1, j, dp);
        int ld = matrix[i][j] + help(matrix, i - 1, j - 1, dp);
        int rd = matrix[i][j] + help(matrix, i - 1, j + 1, dp);
        
        return dp[i][j] = Math.min(u, Math.min(ld, rd));
    }
}
