package Array_Scaler;

import java.util.Arrays;

public class Sliding_Window {
    public static void main(String arg[])
    {
        int arr[] = {1,12,14,26,10,3};
        int k=3;
        System.out.println(SlidingWindow(arr, k));
    }
    public static int SlidingWindow(int arr[], int k)
    {
        Arrays.sort(arr);
        int n=arr.length;
        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum=sum+arr[i];
        }
        int windowsSum=sum;
        for(int i=k;i<n;i++)
        {
            windowsSum=windowsSum+arr[i]-arr[i-k];
            sum=Math.min(windowsSum, sum);
        }
        return sum;
        // Arrays.sort(arr);
        // int n = arr.length;
        // long minDiff = Long.MAX_VALUE;
        // // Iterate through the array with a sliding window of size k
        // for (int i = 0; i + k - 1 < n; i++) {
        //     long currentDiff = arr[i + k - 1] - arr[i];
        //     minDiff = Math.min(minDiff, currentDiff);
        // }
        // return (int)minDiff;
    }
}
