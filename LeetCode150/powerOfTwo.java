package LeetCode150;

public class powerOfTwo {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(PowerTwo(n));
    }
    public static boolean PowerTwo(int n)
    {
        int ans = 1;
        for(int i=0;i<=30;i++)
        {
            if(ans==n)
            {
                return true;
            }
            if(ans<Integer.MAX_VALUE/2)
            {
                ans = ans*2;
            } 
        }
        return false;
    }
}
