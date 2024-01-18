package LeetCode150;

public class Reverse_Integer {
    public static void main(String[] args) {
        int x=123;
        System.out.println(reverse(x));
    }
    public static int reverse(int x)
    {
        int ans=0;
        while (x!=0)
        {
            int digit = x%10;
            if((ans>Integer.MAX_VALUE/10) || (ans<Integer.MIN_VALUE/10))
            {
                return 0;
            }
            ans = ans*10+digit;
            x=x/10;
        }
        return ans;
    }
}
