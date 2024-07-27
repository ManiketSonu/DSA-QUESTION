package Advanced_DSA.PrimeNumber;

public class Sieve_Theorem {
    public static void main(String[] args) {
        int n = 8;
        boolean res[] = Sieve(n);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
    public static boolean[] Sieve(int A)
    {
        boolean[] isPrime = new boolean[A+1];
        
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i=2;i<=A;i++)
        {
            // isPrime[i] = true;
            if(isPrime(A)==false)
        {
            continue;
        }
        }
        
        for(int i=2;i<=A;i++)
        {
            if(isPrime(A))
            {
                for(int j = i*i;j<=A;j++)
                {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }
    private static boolean isPrime(int a) {
        if(a==0||a==1)
        {
            return false;
        }
        for(int i=2;i*i<=a;i++)
        {
            if(a%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
