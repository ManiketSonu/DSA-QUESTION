package LeetCode150;

public class Search_Minimum_ElementII {
    public static void main(String[] args) {
        int arr[] = {3,3,3,1};
        System.out.println(Search(arr));
    }
    public static int Search(int arr[])
    {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] < arr[high]) {
                high = mid;
            } else if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else {
                // Handle duplicates at the end
                high--;
            }
        }
        return arr[low];
        // int n = arr.length;
        // int low = 0;
        // int high = n-1;
        // while(low<high)
        // {
        //     if(arr[low] < arr[high])
        //     {
        //         return arr[low];
        //     }
        //     int mid = (low+high)/2;
        //     int nex = (mid+1)%n;
        //     int prev = (mid+n-1)%n;
        //     if(arr[mid]<=arr[nex] && arr[mid]<=arr[prev])
        //     {
        //         return arr[mid];
        //     }
        //     if (low < mid && arr[low] == arr[mid]) {
        //         low++;
        //     }

        //     if (mid < high && arr[mid] == arr[high]) {
        //         high--;
        //     }
        //     if(arr[mid]<= arr[high])
        //     {
        //         high = mid-1;
        //     }
        //     else if(arr[mid]>=arr[low])
        //     {
        //         low = mid+1;
        //     }
        // }
        // return -1;
    }
}
