package Gotham_City.Array_Gotham;

import java.util.Arrays;

public class Duplicate_Element {
    public static void main(String arg[])
    {
        int arr[] = {3,1,3,4,2};
        System.out.println(Duplicate(arr));
    }
    public static int Duplicate(int arr[])
    {
        Arrays.sort(arr);
        int n=arr.length;
        int sum=0;
        int res=arr[0];
        for(int i=1;i<n;i++)
        {
            sum=sum+arr[i];
            if(arr[i]==arr[i+1])
            {
                return arr[i];
            }
        }
        return res;
    }
}
