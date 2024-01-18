package Demo.Math_Problem;

import java.util.Scanner;

public class Perfect_Number {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Perfect(n);
    }
    public static void Perfect(int n)
    {
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(n==sum)
        {
            System.out.print("Perfect Number");
        }
        else
        {
            System.out.print("Not perfect number");
        }
    }
}
