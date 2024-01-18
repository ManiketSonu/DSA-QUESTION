package Advanced_DSA.BitMasking;

public class nthMagicNumber {
    public static void main(String[] args) {
        int n=3;
        System.out.println(nthMagicNumberr(n));
    }
    public static int nthMagicNumberr(int n)
    {
        int ans=0;
        int power = 5;
        while(n>0)
        {
            int r = n%2;
            n=n/2;
            ans = ans+(r*power);
            power = power*5;
        }
        return ans;
    }
}
