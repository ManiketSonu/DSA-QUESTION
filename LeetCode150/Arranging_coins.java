package LeetCode150;

public class Arranging_coins {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(ACoin(n));
    }
    public static int ACoin(int n)
    {
        int res = 0;
        for(int i=1;i<=n;i++)
        {
            n = n-i;
            res = res+1;
        }
        return res;
    }
    // public static int ACoin(int n)
    // {
    //     int i =1;
    //     int res = 0;
    //     while (n>=i) {
    //         n = n-i;
    //         res++;
    //         i++;
    //     }
    //     return res;
    // }
    // public static int ACoin(int n)
    // {
    //     long low = 0;
    //     long high = n;
    //     while (low<=high) {
    //         long mid = low+(high-low)/2;
    //         if(n>=mid*(mid+1)/2)
    //         {
    //             low = mid+1;
    //         }
    //         else
    //         {
    //             high = mid-1;
    //         }
    //     }
    //     return (int) low-1;
    // }
}
