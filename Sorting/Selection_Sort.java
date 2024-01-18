package Sorting;

public class Selection_Sort {
    public static void main(String[] args) {
        int arr[] = {2, 1, 4, 3, 2};
        // System.out.println(KSmallest(arr,3));
        SelectionSort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void SelectionSort(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            int minIndex=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[minIndex])
                {
                    minIndex=j;
                }
            }
            int temp=arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    // public static int KSmallest(int arr[], int k)
    // {
    //     int n=arr.length;
    //     for(int i=0;i<k;i++)
    //     {
    //         int miniIndex=i;
    //         for(int j=i+1;j<arr.length;j++)
    //         {
    //             if(arr[j]<arr[miniIndex])
    //             {
    //                 miniIndex=j;
    //             }
    //         }
    //         int temp = arr[miniIndex];
    //         arr[miniIndex] = arr[i];
    //         arr[i] = temp;
    //     }
    //     return arr[k-1];
    // }
}
