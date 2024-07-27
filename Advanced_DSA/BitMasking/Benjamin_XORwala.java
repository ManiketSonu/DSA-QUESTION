package Advanced_DSA.BitMasking;

public class Benjamin_XORwala {
    public static void main(String[] args) {
        int A[] = {1,2,3};
        int B[] = {0,1};
        int result[] = Benjamin(A, B);
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
    public static int[] Benjamin(int A[], int B[])
    {
        int ans[]=new int[B.length];
        for(int i=0;i<B.length;i++)
        {
            int index = B[i];
            int set=0;
            int unset=0;
            for(int j=0;j<A.length;j++)
            {
                if((A[j]&(1<<index))==0)
                {
                    unset++;
                }
                else
                {
                    set++;
                }
            }
            ans[i] = set*unset;
        }
        return ans;
    }
}
