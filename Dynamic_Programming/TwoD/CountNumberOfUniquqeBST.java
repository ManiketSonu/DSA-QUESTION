package Dynamic_Programming.TwoD;

public class CountNumberOfUniquqeBST {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(solve(n));
    }
    public static int solve(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        int cn[] = new int[n+1];
        cn[0] = 1;
        cn[1] = 1;
        for(int i=2;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                cn[i] = cn[i]+cn[j]*cn[i-1-j];
            }
        }
        return cn[n];
    }
}
