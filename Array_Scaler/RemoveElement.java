package Array_Scaler;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int arr[] = {2,1};
        System.out.println(RemoElement(arr));
    }
    public static int RemoElement(int arr[])
    {
        int n = arr.length;
        Arrays.sort(arr);
        Reverse(arr);
        int c = 0;
        for(int i=0;i<n;i++)
        {
            if(n==1)
            {
                return arr[i];
            }
            c = c+arr[i]*(i+1);
        }
        return c;
    }
    public static void Reverse(int arr[])
    {
        int n = arr.length;
        int start = 0;
        int end = n-1;
        while(start<=end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
