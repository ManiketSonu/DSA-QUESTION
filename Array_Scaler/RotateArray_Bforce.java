package Array_Scaler;

public class RotateArray_Bforce {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Rorate(arr, 3);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void Rorate(int arr[], int k)
    {
        int n=arr.length;
        k=k%n;
        for(int i=0;i<k;i++)
        {
            int temp=arr[n-1];
            for(int j=n-1;j>=1;j--)
            {
                arr[j]=arr[j-1];
            }
            arr[0]=temp;
        }
    }
}
