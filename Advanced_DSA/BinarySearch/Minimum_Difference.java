package Advanced_DSA.BinarySearch;

public class Minimum_Difference {
    public static void main(String[] args) {
        int arr[][] = {{8, 4},{6, 8}};
        int A = 2;
        int B = 2;
        System.out.println(solve(arr, A, B));
    }
    public static int solve(int C[][], int A, int B)
    {
        int dp[][] = new int[A][B];
        for(int j=0;j<B;j++)
        {
            dp[0][j] = C[0][j];
        }
        for(int i=1;i<A;i++)
        {
            for(int j=0;j<B;j++)
            {
                dp[i][j] = Integer.MAX_VALUE;
                for(int k=0;k<B;k++)
                {
                    int cost = Math.abs(C[i][j]-C[i-1][k])+dp[i-1][k];
                    dp[i][j] = Math.min(dp[i][j], cost);
                }
            }
        }
        int mincost = Integer.MAX_VALUE;
        for(int j=0;j<B;j++)
        {
            mincost = Math.min(mincost, dp[A-1][j]);
        }
        return mincost;
    }
}
