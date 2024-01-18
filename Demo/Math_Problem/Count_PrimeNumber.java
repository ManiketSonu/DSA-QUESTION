package Demo.Math_Problem;

import java.util.Scanner;

public class Count_PrimeNumber {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Count(n));
    }
    public static int Count(int n)
    {
        int count=0;
        if(n<=1)
        {
            return 0;
        }
        for(int i=1;i<=n;i++)
        {
            if(IsPrime(i))
            {
                count++;
            }
        }
        return count;
    }
    public static boolean IsPrime(int n)
    {
        if(n<=1)
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
