package Advanced_DSA.PrimeNumber;

public class Prime_Sum {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(PrimeSum(n));
    }
    public static int PrimeSum(int n)
    {
        int count = 0;
        for(int i=1;i<=n;i++)
        {
            if(checkPrime(i))
            {
                count++;
            }
        }
        int ans[] = new int[count];
        int res = 0;
        int index = 0;
        for(int i=0;i<=n;i++)
        {
            if(checkPrime(i))
            {
                ans[index++] = i;
                res = res+i;
            }
        }
        return res;
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
