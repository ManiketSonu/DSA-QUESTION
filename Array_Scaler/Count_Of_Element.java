package Array_Scaler;

public class Count_Of_Element {
    public static void main(String arg[])
    {
        int arr[] = {5, 5, 3};
        // System.out.println(largest(arr));
        System.out.println(CountElement(arr));
    }
    public static int largest(int arr[])
    {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }
        }
        return largest;
    }
    public static int CountElement(int arr[])
    {
        int count=0;
        int largestElement=largest(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<largestElement)
            {
                count++;
            }
        }
        return count;
    }
}
