package Advanced_DSA.BinarySearch;

public class LocalMinima {
    public static void main(String[] args) {
        // int arr[] = {9,8,7,10,6,4,1,5};
        int arr[] = {3,6,1,0,9,15,8};
        System.out.println(lminima(arr));
    }
    public static int lminima(int arr[])
    {
        int n = arr.length;
        if(n==1)
        {
            return arr[0];
        }
        if(arr[0]<arr[1])
        {
            return arr[0];
        }
        if(arr[n-1]<arr[n-2])
        {
            return arr[n-1];
        }
        int low = 0;
        int high = n-1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(arr[mid]<arr[mid+1]&&arr[mid]<arr[mid-1])
            {
                return arr[mid];
            }
            else if(arr[mid]>arr[mid+1])
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
