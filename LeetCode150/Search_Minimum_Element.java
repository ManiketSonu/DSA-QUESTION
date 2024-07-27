package LeetCode150;

public class Search_Minimum_Element {
    public static void main(String[] args) {
        int arr[] = {3,1,3};
        System.out.println(SeachMinimumElementInSortedArray(arr));
    }
    public static int SeachMinimumElementInSortedArray(int arr[])
    {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low<=high)
        {
            if(arr[low] <= arr[high])
            {
                return arr[low];
            }
            int mid = (low+high)/2;
            int nex = (mid+1)%n;
            int prev = (mid+n-1)%n;
            if(arr[mid]<=arr[nex] && arr[mid]<=arr[prev])
            {
                return arr[mid];
            }
            if(arr[mid]<= arr[high])
            {
                high = mid-1;
            }
            else if(arr[mid]>=arr[low])
            {
                low = mid+1;
            }
        }
        return -1;
    }
}
