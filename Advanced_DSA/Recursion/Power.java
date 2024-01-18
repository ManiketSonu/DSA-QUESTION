package Advanced_DSA.Recursion;


public class Power {
    public static void main(String[] args) {
        int n=5;
        System.out.println(Powerr(2, n));
    }
    // public static int Power(int a, int n)
    // {
    //     if(n==0)
    //     {
    //         return 1;
    //     }
    //     int ans = Power(a, n-1)*a;
    //     return ans;
    // }
    // public static int Power(int a, int n)
    // {
    //     int ans=0;
    //     if(n==0)
    //     {
    //         return 1;
    //     }
    //     if(n%2==0)
    //     {
    //         ans = Power(a, n/2)*Power(a, n/2);
    //     }
    //     else
    //     {
    //         ans = Power(a, n/2)*Power(a, n/2)*a;
    //     }
    //     return ans;
    // }
    public static int Powerr(int a, int n)
    {
        int ans=0;
        if(n==0)
        {
            return 1;
        }
        int he = Powerr(a, n/2);
        if(n%2==0)
        {
            ans =  he*he;
        }
        else
        {
            ans =  he*he*a;
        }
        return ans;
    }
}
