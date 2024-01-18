package Array_Scaler;

public class Array_Rotation {
    public static void main(String arg[])
    {
        int arr[] = {1,2,3,4,5,6,7};
        leftrotate(arr, 3);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+ " ");
        }
    }
    public static void reverse(int arr[], int l, int r)
    {
        while(l<r)
        {
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
    public static void leftrotate(int[] arr, int d)
    {
        int n = arr.length;
        reverse(arr,0,n-1);
        reverse(arr,0,(d-1));
        reverse(arr,d,n-1);
    }
}
