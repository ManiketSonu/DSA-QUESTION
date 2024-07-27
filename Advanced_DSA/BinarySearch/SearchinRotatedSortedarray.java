package Advanced_DSA.BinarySearch;

public class SearchinRotatedSortedarray {
    public static void main(String[] args) {
        int arr[] = {1,7,67,133,178};
        int b = 1;
        System.out.println(search(arr, b));
    }
    public static int search(int arr[], int b)
    {
        int n = arr.length;
        int pivot = findpivot(arr);
        if(pivot==-1)
        {
            return binarSearch(arr, 0, n-1, b);
        }
        if(arr[pivot]==b)
        {
            return pivot;
        }
        if(arr[0]<=b)
        {
            return binarSearch(arr, 0, pivot-1, b);
        }
        else
        {
            return binarSearch(arr, pivot+1, n-1, b);
        }
    }
    public static int findpivot(int arr[])
    {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while (low<=high) {
            int mid = low+(high-low)/2;
            if(mid<high && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            if(mid>low && arr[mid]<arr[mid-1])
            {
                return mid-1;
            }
            if(arr[low]>=arr[mid])
            {
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return -1;
    }
    public static int binarSearch(int arr[], int low, int high, int pivot)
    {
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(arr[mid]==pivot)
            {
                return mid;
            }
            if(arr[mid]<pivot)
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        return -1;
    }
}
