package Advanced_DSA.BitMasking;

public class Even_Od {
    public static void main(String[] args) {
        int n=11;
        EvenOdd(n);
    }
    public static void EvenOdd(int n)
    {
        // if(n%2==0)
        // {
        //     System.out.println("EVEN");
        // }
        // else
        // {
        //     System.out.println("ODD");
        // }
        if((n & 1)==0)
        {
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }
    }
}
