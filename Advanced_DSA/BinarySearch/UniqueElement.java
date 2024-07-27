package Advanced_DSA.BinarySearch;

public class UniqueElement {
    public static void main(String[] args) {
        int arr[] = {2, 3, 3};
        System.out.println(unique(arr));
    }
    public static int unique(int arr[])
    {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(mid==0 && arr[mid]!=arr[mid+1])
            {
                return arr[mid];
            }
            if(mid==n-1 && arr[mid]!=arr[mid-1])
            {
                return arr[mid];
            }
            if(arr[mid]!=arr[mid+1] && arr[mid]!=arr[mid-1])
            {
                return arr[mid];
            }
            int firsOccur = 0;
            if(arr[mid]==arr[mid-1])
            {
                firsOccur = mid-1;
            }
            else
            {
                firsOccur = mid;
            }
            if(firsOccur%2==0)
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        return 0;
    }
}
