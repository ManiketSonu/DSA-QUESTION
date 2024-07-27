package Dynamic_Programming.OneD;

public class Frog_jump {
    public static void main(String[] args) {
        int A=5;
        int arr[] = {10, 30, 40, 50, 20};
        int res = solve(A, arr);
        System.out.println(res);
    }
    public static int solve(int A, int height[])
    {
        int dp[] = new int[A+1];
        dp[0] = 0;
        for(int i=1;i<A;i++)
        {
            int left = dp[i-1]+Math.abs(height[i]-height[i-1]);
            int right = Integer.MAX_VALUE;
            if(i>1)
            {
                right = dp[i-2]+Math.abs(height[i]-height[i-2]);
            }
            dp[i] = Math.min(left, right);
        }
        return dp[A-1];
    }
}
