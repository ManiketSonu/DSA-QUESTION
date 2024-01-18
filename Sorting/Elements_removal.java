package Sorting;

import java.util.Arrays;

public class Elements_removal {
    public static void main(String arg[])
    {
        int arr[] = {8,0,10};
        System.out.println(Rmoval(arr));
    }
    public static int Rmoval(int arr[])
    {
        Arrays.sort(arr);
        reverseArray(arr);
        int cost=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr.length==1)
            {
                return arr[i];
            }
            cost=cost+arr[i]*(i+1);
        }
        return cost;
    }
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
