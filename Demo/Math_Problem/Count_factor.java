package Demo.Math_Problem;

import java.util.Scanner;

public class Count_factor {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Cfactor(n);
    }
    public static void Cfactor(int A)
    {
        int count=0;
        for(int i=1;i*i<=A;i++)
        {
            if(A%i==0)
            {
                if(A/i==i)
                {
                    count = count+1;
                }
                else
                {
                    count = count+2;
                }
            }
        }
        System.out.println(count);
    }
}
