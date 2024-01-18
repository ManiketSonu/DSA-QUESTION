package Advanced_DSA.BitMasking;

public class Unsetfromright {
    public static void main(String[] args) {
        int A=37;
        int B=3;
        System.out.println(Solve(A, B));
    }
    public static long Solve(int A, int B)
    {
        long mask = -1<<B;
        long ans = A&mask;
        return ans;
    }
}
