package Advanced_DSA.Recursion;

public class Fibonacci_Series {
    public static void main(String[] args) {
        int n=9;
        // System.out.println(FibonacciSeries(n));
        for(int i=0;i<n;i++)
        {
            System.out.print(FibonacciSeries(i)+" ");
        }
    }
    public static int FibonacciSeries(int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        return FibonacciSeries(n-1)+FibonacciSeries(n-2);
    }
}
