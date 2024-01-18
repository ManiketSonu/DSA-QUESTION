package Advanced_DSA.BitMasking;

public class Set {
    public static void main(String[] args) {
        int A=43;
        int B=2;
        System.out.println(UnsetIthBit(A, B));
    }
    public static int UnsetIthBit(int A, int B)
    {
        // int mask = (1 << B);
        // int mask1 = (1<<A);
        // int ans = 0 | mask | mask1;
        // return ans; 
        int mask = 1<<B;
        int ans =  (A|mask);
        return ans;
    }
}
