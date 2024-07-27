package LeetCode150;

public class HighestAltitude {
    public static void main(String[] args) {
        int arr[] = {-4,-3,-2,-1,4,3,2};
        System.out.print(highestalti(arr));
    }
    public static int highestalti(int arr[])
    {
        int res[] = lAltitude(arr);
        int max = Integer.MIN_VALUE;
        for(int i=0;i<res.length;i++)
        {
            if(res[i]>max)
            {
                max = res[i];
            }
        }
        return max;
    }
    public static int[] lAltitude(int arr[])
    {
        int n = arr.length;
        int pf[] = new int[n+1];
        pf[0] = 0;
        for(int i=1;i<=n;i++)
        {
            pf[i] = pf[i-1]+arr[i-1];
        }
        return pf;
    }
}
