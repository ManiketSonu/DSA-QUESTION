package Gotham_City.Array_Gotham;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int target = 6;
        System.out.println(BSearch(arr, target));
    }
    public static int BSearch(int arr[], int target)
    {
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<high)
        {
            int mid = (low+high)/2;
            if(arr[mid]==target)
            {
                return arr[mid];
            }
            else if(arr[mid]<target)
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
