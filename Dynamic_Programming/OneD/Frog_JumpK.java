package Dynamic_Programming.OneD;

public class Frog_JumpK {
    public static void main(String[] args) {
        int A=5;
        int k = 3;
        int arr[] = {10, 30, 40, 50, 60, 10};
        int res = solve(A, k, arr);
        System.out.println(res);
    }
    public static int solve(int A, int k, int arr[])
    {
        int dp[] = new int[A+1];
        dp[0] = 0;
        for(int i=1;i<=A;i++)
        {
            int minSteps = Integer.MAX_VALUE;
            for(int j=1;j<=k;j++)
            {
                if(i-j>=0)
                {
                    int jump = dp[i-j]+Math.abs(arr[i]-arr[i-j]);
                    minSteps = Math.min(minSteps, jump);
                }
            }
            dp[i] = minSteps;
        }
        return dp[A-1];
    }
}
