package Demo.Math_Problem;

import java.util.Scanner;

public class Fibonaccie {
    public static void main(String arg[])
    {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter a number");
        // int n=sc.nextInt();
        int n=10;
        Fibonacci(n);
    }
    public static void Fibonacci(int n)
    {
        int firstNUM=0; 
        int secondNUM=1;
        for(int i=0;i<n;i++)
        {
            System.out.println(firstNUM);
            int nextTerm=firstNUM+secondNUM;
            firstNUM=secondNUM;
            secondNUM=nextTerm;
        }
    }
}
