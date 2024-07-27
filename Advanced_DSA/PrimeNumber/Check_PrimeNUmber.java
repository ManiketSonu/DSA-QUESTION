package Advanced_DSA.PrimeNumber;

public class Check_PrimeNUmber {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(checkPrime(n));
    }
    public static int checkPrime(int n)
    {
        int count = 0;
        for(int i=1;i*i<n;i++)
        {
            if(n%i==0)
            {
                if(n/i==i)
                {
                    count++;
                }
                else
                {
                    count = count+2;
                }
            }
        }
        if(count==2)
        {
            System.out.println("It is prime:");
        }
        else
        {
            System.out.println("It is not prime:");
        }
        return count;
    }
}
