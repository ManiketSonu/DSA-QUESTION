package LeetCode150;

public class MaximumAvgSum {
    public static void main(String[] args) {
        // int arr[] = {1,12,-5,-6,50,3};
        int arr[] = {5};
        // int k = 4;
        int k = 1;  
        System.out.println(MaximumAvg(arr, k));
    }
    public static double MaximumAvg(int arr[], int k)
    {
        int n = arr.length;
        double sum = 0;
        for(int i=0;i<k;i++)
        {
            sum = sum+arr[i];
        }
        double windowsSum = sum;
        for(int i=k;i<n;i++)
        {
            windowsSum = windowsSum+arr[i]-arr[i-k];
            sum = Math.max(windowsSum, sum);
        }
        return sum/k;
    }
}
