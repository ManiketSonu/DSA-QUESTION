package Advanced_DSA.Recursion;

public class SumOfN {
    public static void main(String[] args) {
        int n=5;
        System.out.println(Sum(n));
    }
    public static int Sum(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return Sum(n-1)+n;
    }
}
