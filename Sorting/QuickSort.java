package Sorting;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {5,7,1,6,9,2,0,4};
        int n = arr.length;
        qucksortt(arr, 0, n-1);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void qucksortt(int arr[], int l, int r)
    {
        if(l>=r)
        {
            return;
        }
        int index = partion(arr, l, r);
        qucksortt(arr, l, index-1);
        qucksortt(arr, index+1, r);
    }
    public static int partion(int arr[], int l, int r)
    {
        int pivot = arr[l];
        int p1 = l+1;
        int p2 = r;
        while(p1<=p2)
        {
            if(arr[p1]<=pivot)
            {
                p1++;
            }
            else if(arr[p1]>pivot)
            {
                int temp = arr[p1];
                arr[p1] = arr[p2];
                arr[p2] = temp;
                p2--;
            }
        }
        int temp = arr[l];
        arr[l] = arr[p2];
        arr[p2] = temp;
        return p2;
    }
}
