package Advanced_DSA.BitMasking;

public class Set_Bit {
    public static void main(String[] args) {
        int A = 3;
        int B = 5;
        System.out.println(SetBit(A, B));
    }
    public static int SetBit(int A, int B)
    {
        int mask = (1<<B);
        int ans = (A|mask);
        return ans;
    }
}
