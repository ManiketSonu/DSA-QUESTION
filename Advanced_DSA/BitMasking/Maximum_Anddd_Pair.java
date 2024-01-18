package Advanced_DSA.BitMasking;

public class Maximum_Anddd_Pair {
    public static void main(String[] args) {
        int arr[] = {38, 44, 84, 12};
        System.out.println(MaximumAndPair(arr));
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
    public static int MaximumAndPair(int arr[])
    {
        int n=arr.length;
        int ans=0;
        for(int i=31;i>=0;i--)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(checkIthBit(arr[j], i))
                {
                    count++;
                }
            }
            if(count>=2)
            {
                ans = SetBit(ans, i);
                for(int j=0;j<n;j++)
                {
                    if(checkIthBit(arr[j], i))
                    {
                        continue;
                    }
                    arr[j] = 0;
                }
            }
        }
        return ans;
    }
}
