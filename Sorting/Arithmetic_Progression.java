package Sorting;

import java.util.Arrays;

public class Arithmetic_Progression {
    public static void main(String[] args) {
        int arr[] = {3, 5, 1};
        System.out.println(AP(arr));
    }
    public static int AP(int arr[])
    {
        int n = arr.length;
        Arrays.sort(arr);
        int commondifference = arr[1]-arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]-arr[i-1]!=commondifference)
            {
                return 0;
            }
        }
        return 1;
    }
}
