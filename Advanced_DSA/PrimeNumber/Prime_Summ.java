package Advanced_DSA.PrimeNumber;

public class Prime_Summ {
    public static void main(String[] args) {
        int n = 8;
        int res[] = PSum(n);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
    public static int[] PSum(int n)
    {
        for(int i=1;i<=n;i++)
        {
            int otherNumber = n-i;
            if(isPrime(i) && isPrime(otherNumber))
            {
                return new int[]{i,otherNumber};
            }
        }
        return new int[]{};
    }
    public static boolean isPrime(int n)
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
