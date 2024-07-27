package Dynamic_Programming.TwoD;

public class DungeonsAndPrinces {
    public static void main(String[] args) {
        int arr[][] = {{-2, -3, 3},{-5, -10, 1},{10, 30, -5}};
        System.out.println(calculateMinimumHP(arr));
    }
    public static int calculateMinimumHP(int arr[][])
    {
        int n = arr.length;
        int m = arr[0].length;

        int dp[][] = new int[n+1][m+1];
        int rows = dp.length;
        int cols = dp[0].length;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }

        //This statement sets the minimum initial health required for the knight to reach the bottom-right corner from the cell just to the left of it.
        //It's set to 1 because when the knight is just one step away from the destination (bottom-right corner), it must have at least 1 health point left to reach there.
        dp[n][m-1] = 1;
        dp[n-1][m] = 1;

        for(int i=n-1;i>=0;i--)
        {
            for(int j=m-1;j>=0;j--)
            {
                int miniMumPowerRequired = Math.min(dp[i+1][j], dp[i][j+1])-arr[i][j];
                //agar miniMumPowerRequired -ve ho ja rha hai then get 1 beacuse we need atleast 1 power
                if(miniMumPowerRequired<=0)
                {
                    dp[i][j] = 1;
                }
                else
                {
                    dp[i][j] = miniMumPowerRequired;
                }
            }
        }
        return dp[0][0];
    }
}
