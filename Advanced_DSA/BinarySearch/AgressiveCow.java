package Advanced_DSA.BinarySearch;

import java.util.Arrays;

public class AgressiveCow {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,7};
        System.out.println(solve(arr, 3));
    }
    public static boolean checkfunction(int arr[], int m, int mid)
    {
        int lastplacedcow = arr[0];
        int cow = 1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]-lastplacedcow>=mid)
            {
                cow++;
                lastplacedcow = arr[i];
            }
            if(cow==m)
            {
                return true;
            }
        }
        return false;
    }
    public static int solve(int arr[], int m)
    {
        Arrays.sort(arr);
        int n = arr.length;
        int low = 1;
        int high = arr[n-1]-arr[0];
        int ans = 0;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(checkfunction(arr, m, mid))
            {
                ans = mid;
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        return ans;
    }
}
