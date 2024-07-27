package Sorting;

import java.util.Arrays;

public class WaveArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int res[] = wave(arr);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
    public static int[] wave(int arr[])
    {
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n-1;i=i+2)
        {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        return arr;
    }
}
