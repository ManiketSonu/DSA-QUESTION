package Advanced_DSA.Combinatorics;

public class Consequitive_Sum {
    public static void main(String[] args) {
        int A = 1;
        System.out.println(CSum(A));
    }
    public static int CSum(int A)
    {
        int count=0;
        for(int k=1;k*k<2*A;k++)
        {
            int T = (A-k*(k-1)/2);
            if(T%k==0)
            {
                count++;
            }
        }
        return count;
    }
}
