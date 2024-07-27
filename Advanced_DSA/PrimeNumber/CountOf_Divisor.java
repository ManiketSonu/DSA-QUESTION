package Advanced_DSA.PrimeNumber;

public class CountOf_Divisor {
    public static void main(String[] args) {
        int A[] = {8,9,10};
        int res[] = CDivisor(A);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
    public static int[] CDivisor(int A[])
    {
        int n = A.length;
        int ans[] = new int[n];
        int count = 2;
        for(int i=0;i<n;i++)
        {
            if(IsPrime(A[i]))
            {
                ans[i] = 2;
            }
            else{
                count++;
                ans[i] = count;
            }
        }
        return ans;
    }
    public static boolean IsPrime(int n)
    {
        if(n==0 || n==1)
        {
            return false;
        }
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
