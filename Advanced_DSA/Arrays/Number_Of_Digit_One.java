package Advanced_DSA.Arrays;

public class Number_Of_Digit_One {
    public static void main(String[] args) {
        int n=13;
        System.out.println(CountOne(n));
    }
    public static int CountOne(int n)
    {
        // if(n<=0)
        // {
        //     return 0;
        // }
        // int q=n;
        // int x=1;
        // int ans=0;
        // do{
        //     int digit = q%10;
        //     q /=10;
        //     ans +=q*x;
        //     if(digit==1)
        //     {
        //         ans +=n%x+1;
        //     }
        //     if(digit>1)
        //     {
        //         ans +=x;
        //     }
        //     x *=10;
        // }while(q>0);
        //     return ans;
        if (n <= 0) {
            return 0;
        }
        int ans = 0;
        int x = 1;
        for (int q = n; q > 0; q /= 10, x *= 10) {
            int digit = q % 10;
            ans += (q / 10) * x;
    
            if (digit == 1) {
                ans += n % x + 1;
            } else if (digit > 1) {
                ans += x;
            }
        }
    
        return ans;
    }
}
