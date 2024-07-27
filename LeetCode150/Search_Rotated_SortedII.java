package LeetCode150;

public class Search_Rotated_SortedII {
    public static void main(String[] args) {
        int arr[] = {1,0,1,1,1};
        int target = 0;
        System.out.println(search(arr, target));
    }
    public static boolean search(int arr[], int target)
    {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid]==target)
            {
                return true;
            }
            //it will handle the duplicate
            if(arr[low]==arr[mid] && arr[high]==arr[mid])
            {
                low++;
                high--;
            }
            else if(arr[low]<=arr[mid])
            {
                if(arr[low]<=target && target<=arr[mid])
                {
                    high = mid-1;
                }
                else
                {
                    low = mid+1;
                }
            }
            else
            {
                if(arr[mid]<=target && target<=arr[high])
                {
                    low = mid+1;
                }
                else
                {
                    high = mid-1;
                }
            }
        }
        return false;
    }
}
