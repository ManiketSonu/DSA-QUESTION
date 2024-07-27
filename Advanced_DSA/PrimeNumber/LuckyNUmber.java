package Advanced_DSA.PrimeNumber;

public class LuckyNUmber {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(LNumber(n));
    }
    public static int LNumber(int n)
    {
        int ans = 0;
        for(int i=1;i<=n;i++)
        {
            int count=0;
            for(int j=1;j<=i;j++)
            {
                if(checkPrime(j) && i%j==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                ans = ans+1;
            }
        }
        return ans;
    }
    public static boolean checkPrime(int n)
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
