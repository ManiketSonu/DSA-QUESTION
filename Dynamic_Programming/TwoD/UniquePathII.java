package Dynamic_Programming.TwoD;

public class UniquePathII {
    public static void main(String[] args) {
        int arr[][] = {{0,0,0},{0,1,0},{0,0,0}};

        System.out.println(solve(arr));
    }
    public static int solve(int arr[][])
    {
        int n = arr.length;
        int m = arr[0].length;
        int dp[][] = new int[n][m];
        if (arr[0][0] == 0) 
        {
            dp[0][0] = 1;
        } 
        else 
        {
            dp[0][0] = 0;
        }

        // Initialize the first row
        for(int i = 1; i < m; i++) {
            if(arr[0][i] == 0 && dp[0][i-1] == 1) 
            {
                dp[0][i] = 1;
            } 
            else 
            {
                dp[0][i] = 0;
            }
        }

        // Initialize the first column
        for(int i = 1; i < n; i++) 
        {
            if(arr[i][0] == 0 && dp[i-1][0] == 1) 
            {
                dp[i][0] = 1;
            } 
            else 
            {
                dp[i][0] = 0;
            }
        }

        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                if(arr[i][j]==0)
                {
                    dp[i][j] = dp[i-1][j]+dp[i][j-1];
                }
                else
                {
                    dp[i][j] = 0;
                }
            }
        }
        return dp[n-1][m-1];
    }
}
