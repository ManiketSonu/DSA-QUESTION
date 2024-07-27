package Advanced_DSA.BinarySearch;

public class FirstOccurence {
    public static void main(String[] args) {
        int arr[] = {-5,-5,-3,0,0,1,1,5,5,5,5,5,5,5,8,10,15,15};
        int k = 5;
        System.out.println(foccurence(arr, k));
    }
    public static int foccurence(int arr[], int k)
    {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int ans = -1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(arr[mid]==k)
            {
                ans = mid;
                high = mid-1;
            }
            else if(arr[mid]>k)
            {
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return ans;
    }
}
