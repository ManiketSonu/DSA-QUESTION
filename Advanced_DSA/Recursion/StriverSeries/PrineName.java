package Advanced_DSA.Recursion.StriverSeries;

public class PrineName {
    public static void main(String[] args) {
        int n = 3;
        PName(1, n);
    }
    public static void PName(int i, int n)
    {
        if(i>n)
        {
            return;
        }
        System.out.println("Sonu");
        PName(i+1, n);
    }
}
