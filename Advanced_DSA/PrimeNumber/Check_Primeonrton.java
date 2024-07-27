package Advanced_DSA.PrimeNumber;

public class Check_Primeonrton {
    public static void main(String[] args) {
        int n = 12;
        int res[] = printPrime(n);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
    public static int[] printPrime(int n)
    {
        int count = 0;
        for(int i=1;i<=n;i++)
        {
            if(checkPrime(i))
            {
                // ans[count] = i;
                count++;
            }
        }
        int ans[] = new int[count];
        int res = 0;
        for(int i=0;i<=n;i++)
        {
            if(checkPrime(i))
            {
                ans[res] = i;
                res++;
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
