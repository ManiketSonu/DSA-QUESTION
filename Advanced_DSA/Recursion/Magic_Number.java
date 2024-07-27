package Advanced_DSA.Recursion;

public class Magic_Number {
    public static void main(String[] args) {
        int A = 83557;
        System.out.println(MagicNumber(A));
    }
    public static int MagicNumber(int A)
    {
        while(A>9)
        {
            int sum=0;
            while(A>0)
            {
                sum += A%10;
                A = A/10; 
            }
            A=sum;
        }
        return isMagicNumber(A);
    }
    public static int isMagicNumber(int A)
    {
        if(A==1)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
