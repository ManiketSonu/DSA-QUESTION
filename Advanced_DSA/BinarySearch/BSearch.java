package Advanced_DSA.BinarySearch;

public class BSearch {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 6};
        int k = 5;
        System.out.println(Bsear(arr, k));
    }
    public static int Bsear(int arr[], int k)
    {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(arr[mid]==k)
            {
                return mid;
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
        return low;
    }
}
