package Advanced_DSA.BitMasking;

public class CheckBit {
    public static void main(String[] args) {
        int A = 5;
        int B=2;
        System.out.println(Checkbitt(A, B));
    }
    public static int Checkbitt(int A, int B)
    {
        int mask = 1<<B;
        if((A&mask)==0)
        {
            return 0;
        }
        return 1;
    }
}
