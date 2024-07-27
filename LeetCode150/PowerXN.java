package LeetCode150;

public class PowerXN {
    public static void main(String[] args) {
        double x = 2.00000;
        int n = 10;
        System.out.println(Power(x, n));
    }
    public static int Power(double x, int n)
    {
        if(n==0)
        {
            return 1;
        }
        double A = Power(x, n-1);
        double B = x*A;
        return (int) B;
    }
}
