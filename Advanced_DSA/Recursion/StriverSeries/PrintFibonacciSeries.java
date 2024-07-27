package Advanced_DSA.Recursion.StriverSeries;

public class PrintFibonacciSeries {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(fiboPrint(n));
        // for(int i=0;i<n;i++)
        // {
        //     System.out.print(fiboPrint(i)+" ");
        // }
    }
    public static int fiboPrint(int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        int fib[] = new int[n+1];
        fib[0] = 0;
        fib[1] = 1;
        for(int i=2;i<=n;i++)
        {
            fib[i] = fiboPrint(i-1)+fiboPrint(i-2);
        }
        return fib[n];
    }
}
