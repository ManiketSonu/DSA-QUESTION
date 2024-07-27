package LeetCode150;

public class MaxMinAvg {
    public static void main(String[] args) {
        int arr[] = {4000,3000,1000,2000};
        System.out.println(average(arr));
     }
     public static double average(int arr[])
     {
        int n = arr.length;
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        int sum = 0;
        int count = 0;
        double avg = 0;
        for(int i=0;i<n;i++)
        {
            maximum = Math.max(maximum, arr[i]);
            minimum = Math.min(minimum, arr[i]);
            sum = sum+arr[i];
        }
        sum = sum-maximum;
        sum = sum-minimum;
        count = n-2;
        avg = (double) sum / count;
        return avg;
     }
}
