package Array_Scaler;

public class Second_Largest {
    public static void main(String arg[])
    {
        int arr[] = {1,2,3};
        // int res1 = SecondLargest(arr);
        // System.out.println(res1);
        System.out.println(secondMax(arr));
    }
    // public static int SecondLargest(int arr[])
    // {
    //     int n=arr.length;
    //     if(n<2)
    //     {
    //         return -1;
    //     }
    //     int largestNumber=Integer.MIN_VALUE;
    //     int SecondLrgestNumber=Integer.MIN_VALUE;
    //     for(int i=0;i<n;i++)
    //     {
    //         if(arr[i]>largestNumber)
    //         {
    //             SecondLrgestNumber=largestNumber;
    //             largestNumber=arr[i];
    //         }
    //         else if(arr[i]>SecondLrgestNumber && arr[i]<largestNumber)
    //         {
    //             SecondLrgestNumber=arr[i];
    //         }
    //     }
    //     return SecondLrgestNumber;
    // }
    public static int findMax(int arr[])
    {
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
    public static int secondMax(int arr[])
    {
        int max=findMax(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==max)
            {
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secMax=findMax(arr);
        return secMax;
    }
}
