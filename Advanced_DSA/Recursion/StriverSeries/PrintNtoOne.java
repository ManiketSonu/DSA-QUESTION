package Advanced_DSA.Recursion.StriverSeries;

public class PrintNtoOne {
    public static void main(String[] args) {
        int n = 4;
        NtoOne(n, 1);
    }
    public static void NtoOne(int n, int i)
    {
        if(i>n)
        {
            return;
        }
        NtoOne(n, i+1);
        System.out.print(i+" ");
    }
}
