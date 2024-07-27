package LeetCode150;

public class ThreeDivisor {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(theeDivi(n));
    }
    public static boolean theeDivi(int n)
    {
        int res = CountDivisor(n);
        if(res==3)
        {
            return true;
        }
        return false;
    }
    public static int CountDivisor(int n)
    {
        int count = 0;
        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
                if(n/i==i)
                {
                    count++;
                }
                else
                {
                    count = count+2;
                }
            }
        }
        return count;
    }
}
