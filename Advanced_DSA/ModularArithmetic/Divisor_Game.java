package Advanced_DSA.ModularArithmetic;

public class Divisor_Game {
    public static void main(String[] args) {
        int A = 12;
        int B = 3;
        int C = 2;
        System.out.println(Solve(A, B, C));
    }
    public static int Solve(int A, int B, int C)
    {
        int lcm = B*C/GCD(B, C);
        return A/lcm;
    }
    public static int GCD(int A, int B)
    {
        if(A<0 || B<0)
        {
            return GCD(Math.abs(A), Math.abs(B));
        }
        if(A<B)
        {
            return GCD(B,A);
        }
        if(B==0)
        {
            return A;
        }
        return GCD(B,A%B);
    }
}
