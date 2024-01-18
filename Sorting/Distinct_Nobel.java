package Sorting;

import java.util.Arrays;

public class Distinct_Nobel {
    public static void main(String arg[])
    {
        int arr[] = {-3,0,2,5};
        System.out.println(Distinct(arr));
    }
    public static int Distinct(int arr[])
    {
        Arrays.sort(arr);
        Reverse(arr);
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            if(i==arr[i])
            {
                ans++;
            }
        }
        return ans;
    }
    public static void Reverse(int arr[])
    {
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
