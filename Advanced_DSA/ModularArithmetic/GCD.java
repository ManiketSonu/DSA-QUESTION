package Advanced_DSA.ModularArithmetic;

public class GCD {
    public static void main(String[] args) {
        int A = 6;
        int B = 7;
        System.out.println(gcd(A, B));
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
}
