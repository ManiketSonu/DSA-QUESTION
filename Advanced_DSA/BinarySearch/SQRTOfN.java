package Advanced_DSA.BinarySearch;

public class SQRTOfN {
    public static void main(String[] args) {
        int A = 10;
        System.out.println(sqrtt(A));
    }
    public static int sqrtt(int A)
    {
        int i = 1;
        int ans = 1;
        while(i*i<=A)
        {
            ans=i;
            i++;
        }
        return ans;
    }
    // public static int sqrtt(int A)
    // {
    //     int low = 1;
    //     int high = A;
    //     int ans = 1;
    //     while(low<=high)
    //     {
    //         int mid = low+(high-low)/2;
    //         if(mid*mid<=A)
    //         {
    //             ans = mid;
    //             low = mid+1;
    //         }
    //         else
    //         {
    //             high = mid-1;
    //         }
    //     }
    //     return ans;
    // }
}
