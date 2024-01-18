package Demo.Math_Problem;

public class Reverse_Number {
    public static void main(String[] args) {
        int n=321;
        // System.out.println(Reve(n));
        System.out.println(isPalindrome(n));
    }
    public static int Reve(int n)
    {
        int res=0;
        while(n>0)
        {
            int ld=n%10;
            res=res*10+ld;
            n=n/10;
        }
        return res;
    }
    public static boolean isPalindrome(int n)
    {
        int res=Reve(n);
        if(res==n)
        {
            return true;
        }
        return false;
    }
}
