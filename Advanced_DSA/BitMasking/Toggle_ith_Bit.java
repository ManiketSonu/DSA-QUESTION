package Advanced_DSA.BitMasking;

public class Toggle_ith_Bit {
    public static void main(String[] args) {
        int A=4;
        int B=1;
        System.out.println(solve(A, B));
    }
    public static int solve(int A, int B)
    {
        int mask = 1<<B;
        int ans = A^mask;
        return ans;
    }
}
