package LeetCode150;

public class Perfect_Number {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(checNumber(n));
    }
    public static boolean checNumber(int n)
    {
        if(n==0 || n==1)
        {
            return false;
        }
        int sum = 0;
        for(int i=2; i*i<n; i++)
        {
            if(n%i==0)
            {
                sum  += i+n/i;
            }
        }
        return n==sum+1;
    }
}
