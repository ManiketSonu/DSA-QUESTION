package Advanced_DSA.BitMasking;

public class Count_Set_Bit {
    public static void main(String[] args) {
        int n=12;
        System.out.println(countbit(n));
    }
    public static int countbit(int n)
    {
        int count=0;
        while(n>0)
        {
            if((n&1)==1)
            {
                count++;
            }
            n = n>>1;
        }
        return count;
    }
}
