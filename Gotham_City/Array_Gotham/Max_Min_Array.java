package Gotham_City.Array_Gotham;

public class Max_Min_Array {
    public static void main(String arg[])
    {
        int arr[] = {1,2,3,4};
        MaxMin(arr);
    }
    public static void MaxMin(int arr[])
    {
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<max)
            {
                max=arr[i];
            }
            else if(arr[i]>min)
            {
                min=arr[i];
            }
        }
        System.out.print(max+" ");
        System.out.print(min+" "); 
    }
}
