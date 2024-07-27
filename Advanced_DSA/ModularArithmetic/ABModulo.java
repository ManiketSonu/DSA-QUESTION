package Advanced_DSA.ModularArithmetic;

public class ABModulo {
    public static void main(String[] args) {
        int A = 5;
        int B = 10;
        System.out.println(Abmod(A, B));
    }
    public static int Abmod(int A, int B)
    {
        int M = Math.abs(A-B);
        return M;
    }
}
