package Gotham_City.Array_Gotham;

import java.util.Arrays;

public class Kth_MaxMin_Element {
    public static void main(String arg[])
    {
        int arr[] = {1,5,6,9,2};
        System.out.println(MINMAX(arr, 0, 5, 3));
    }
    public static int MINMAX(int arr[], int l, int r, int k)
    {
        Arrays.sort(arr);
        int res=arr[0];
        for(int i=l;i<=r;i++)
        {
            res=arr[k-1];
        }
        return res;
    }
}
