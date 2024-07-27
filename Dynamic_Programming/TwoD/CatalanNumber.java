package Dynamic_Programming.TwoD;

public class CatalanNumber {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(solve(n));
    }
    public static int solve(int n)
    {
        int cn[] = new int[n+1];
        cn[0] = 1;
        cn[1] = 1;
        for(int i=2;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                cn[i] += cn[j]*cn[i-1-j];
            }
        }
        return cn[n];
    }
}
