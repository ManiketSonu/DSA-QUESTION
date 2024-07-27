package LeetCode150;

public class Smallest_RangeI {
    public static void main(String[] args) {
        int arr[] = {0,10};
        int k = 2;
        System.out.println(SmallRange(arr, k));
    }
    public static int Large(int arr[], int k)
    {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        return max-k;
    }
    public static int Small(int arr[], int k)
    {
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }
        return min+k;
    }
    public static int SmallRange(int arr[], int k)
    {
        int res = Large(arr, k);
        int res1 = Small(arr, k);
        if(res1>=res)
        {
            return 0;
        }
        else
        {
            return res-res1;
        }
    }
}
