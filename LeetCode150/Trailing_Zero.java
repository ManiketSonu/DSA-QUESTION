package LeetCode150;

public class Trailing_Zero {
    public static void main(String[] args) {
        int n = 13;
        System.out.println(solve(n));
    }
    public static int solve(int n)
    {
        int result = 0;
        while(n>0)
        {
            n = n/5;
            result = result+n;
        }
        return result;
    }
    // public static int TrZero(int n)
    // {
    //     if(n==0)
    //     {
    //         return 0;
    //     }
    //     int f = fact(n);
    //     int count=0;
    //     while(f>0)
    //     {
    //         if(f%10==0)
    //         {
    //             count++;
    //             f = f/10;
    //         }
    //         else
    //         {
    //             break;
    //         }
    //     }
    //     return count;
    // }
    // public static int fact(int n)
    // {
    //     int fact = 1;
    //     for(int i=1;i<=n;i++)
    //     {
    //         fact = fact*i;
    //     }
    //     return fact;
    // }
}
