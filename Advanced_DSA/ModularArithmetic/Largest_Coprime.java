package Advanced_DSA.ModularArithmetic;

public class Largest_Coprime {
    public static void main(String[] args) {
        int A = 30;
        int B = 12;
        System.out.println(Solve(A, B));
    }
    public static int gcd(int A, int B)
    {
        if(A<0 || B<0)
        {
            return gcd(Math.abs(A),Math.abs(B));
        }
        if(A<B)
        {
            return gcd(B, A);
        }
        if(B==0)
        {
            return A;
        }
        return gcd(B, A%B);
    }
    public static int Solve(int A, int B)
    {
        while(gcd(A, B)!=1)
        {
            A /=gcd(A, B);
        }
        return A;
    }
}
