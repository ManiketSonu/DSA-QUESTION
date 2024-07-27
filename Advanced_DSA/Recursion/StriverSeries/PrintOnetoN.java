package Advanced_DSA.Recursion.StriverSeries;

public class PrintOnetoN {
    public static void main(String[] args) {
        int n=4;
        PonetoN(n, 1);
    }
    public static void PonetoN(int n, int i)
    {
        if(i>n)
        {
            return;
        }
        System.out.print(i+" ");
        PonetoN(n, i+1);
    }
}
