package Advanced_DSA.BinarySearch;

public class SearchForARange {
    public static void main(String[] args) {
        int arr[] = {5, 17, 100, 111};
        int B = 3;
        int result[] = solve(arr, B);
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
    public static int[] solve(int arr[], int B)
    {
        int res[] = new int[2];
        res[0] = firstOccurence(arr, B);
        res[1] = lastoccurence(arr, B);
        return res;
    }

    public static int lastoccurence(int arr[], int B)
    {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int ans = -1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(arr[mid]==B)
            {
                ans = mid;
                low = mid+1;
            }
            else if(arr[mid]>B)
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
    public static int firstOccurence(int arr[], int B)
    {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int ans = -1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(arr[mid]==B)
            {
                ans = mid;
                high = mid-1;
            }
            else if(arr[mid]>B)
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
