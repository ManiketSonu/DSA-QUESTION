package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {3,1,7,6,2,5};
        InsertioSortt(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void InsertioSortt(int arr[])
    {
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            int j=i-1;
            int currelement = arr[i];
            while(j>=0 && arr[j]>currelement)
            {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                j--;
            }
        }
    }
}
