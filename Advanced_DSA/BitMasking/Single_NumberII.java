package Advanced_DSA.BitMasking;

public class Single_NumberII {
    public static void main(String[] args) {
        int arr[] = {5,7,5,9,7,11,11,7,5,11};
        System.out.println(SingltNumberII(arr));
    }
    public static int SingltNumberII(int A[])
    {
        int n = A.length;
        int ans=0;
        for(int i=0;i<32;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(checkIthBit(A[j], i))
                {
                    count++;
                }
            }
            if(count%3!=0)
            {
                ans = SetBit(ans, i);
            }
        }
        return ans;
    }
    public static boolean checkIthBit(int A, int B)
    {
        int mask = 1<<B;
        if((A&mask)==0)
        {
            return false;
        }
        return true;
    }
    public static int SetBit(int A, int B)
    {
        int mask = (1<<B);
        int ans = (A|mask);
        return ans;
    }
}
