package Dynamic_Programming.OneD;


import java.util.Scanner;

public class fibonacci {
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static int dp[] = new int[n+1];
    public static void main(String[] args) {
        // Arrays.fill(dp, -1);
        // int res = solve(n);
        // System.out.println(res);

        //Bottom up aproach
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2;i<=n;i++)
        {
            dp[i] = dp[i-1]+dp[i-2];
        }
        System.out.println(dp[n]);
    }
    //Memoisation or Top down approach
    // public static int solve(int n)
    // {
    //     if(n==0)
    //     {
    //         return n;
    //     }
    //     if(n==1)
    //     {
    //         return n;
    //     }
    //     if(dp[n]!=-1)
    //     {
    //         return dp[n];
    //     }
    //     dp[n] = solve(n-1)+solve(n-2);
    //     return dp[n];
    // }
}
