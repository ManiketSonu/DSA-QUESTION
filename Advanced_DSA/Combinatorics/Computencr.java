package Advanced_DSA.Combinatorics;

public class Computencr {
    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        int c = 13;
        System.out.println(Compute(n, r, c));
    }
    public static int Compute(int n, int r, int m)
    {
        int c[][] = new int[n+1][r+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=Math.min(i, r);j++)
            {
                if(j==0 || j==i)
                {
                    c[i][j] = 1;
                }
                else
                {
                    c[i][j] = c[i-1][j-1]+c[i-1][j];
                }
            }
        }
        return c[n][r]%m;
    }
}
