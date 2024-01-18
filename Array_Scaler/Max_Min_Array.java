package Array_Scaler;

public class Max_Min_Array {
    public static void main(String arg[])
    {
        int arr[] = {-2, 1, -4, 5, 3};
        int res1 = maximum(arr);
        int res2 = minimum(arr);
        System.out.println(res1+res2);
    }
    public static int maximum(int arr[])
    {
        int maximum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(maximum<arr[i])
            {
                maximum=arr[i];
            }
        }
        return maximum;
    }
    public static int minimum(int arr[])
    {
        int minimum=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(minimum>arr[i])
            {
                minimum=arr[i];
            }
        }
        return minimum;
    }
}
