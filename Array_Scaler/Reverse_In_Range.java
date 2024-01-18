package Array_Scaler;

public class Reverse_In_Range {
    public static void main(String arg[])
    {
        int arr[] = {3,6,2,9,4};
        ReverseArray(arr, 1, 3);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
    public static int ReverseArray(int arr[], int i, int j)
    {
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return j;
    }
}
