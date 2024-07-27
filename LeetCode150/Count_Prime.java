package LeetCode150;

public class Count_Prime {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(CountPrime(n));
    }
    public static int CountPrime(int n)
    {
        if(n<=1)
        {
            return 0;
        }
        int count=0;
        for(int i=2;i<n;i++)
        {
            if(CheckPrime(i))
            {
                count++;
            }
        }
        return count;
    }
    public static boolean CheckPrime(int n)
    {
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
