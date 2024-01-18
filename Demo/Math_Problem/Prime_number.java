package Demo.Math_Problem;

import java.util.Scanner;

public class Prime_number {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Prime(n);
    }
    public static void Prime(int n)
    {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println("Prime Number");
        }
        else
        {
            System.out.println("Not a prime number");
        }
    }
}
