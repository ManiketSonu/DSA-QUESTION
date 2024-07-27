package LeetCode150;

public class SQRT {
    public static void main(String[] args) {
        int n = 36;
        System.out.println(Squareroot(n));
    }
    public static int Squareroot(int n)
    {
        // int ans = 1;
        // for(int i=1;i<=n;i++)
        // {
        //     if(i*i<=n)
        //     {
        //         ans = i;
        //     }
        //     else
        //     {
        //         break;
        //     }
        // }
        // return ans;
        int ans = 1;
        int low = 1;
        int high = n;
        while(low<=high)
        {
            long mid = low+(high-low)/2;
            if(mid*mid<=n)
            {
                ans = (int) mid;
                low = (int) (mid+1);
            }
            else
            {
                high = (int) (mid-1);
            }
        }
        return ans;
    }
}
