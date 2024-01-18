package Advanced_DSA.BitMasking;

public class SetAndUnset {
    public static void main(String[] args) {
        int n=43;
        int i=1;
        SETUNSET(n, i);
    }
    public static void SETUNSET(int n, int i)
    {
        int mask = 1<<i;
        if((n&mask)==0)
        {
            System.out.println("UNSET");
        }
        else
        {
            System.out.println("SET");
        }
    }
}
