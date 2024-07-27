package Advanced_DSA.BinarySearch;

public class PainterPartition {
    public static void main(String[] args) {
        int arr[] = {1,10,3,10,2};
        int A = 3;
        int B = 1;
        System.out.println(paint(arr, A, B));
    }
    public static int paint(int arr[], int A, int B)
    {
        int low = maximum(arr);
        int high = sum(arr);
        int ans = 0;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(search(arr, mid, A))
            {
                ans = mid;
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return (int)((long)ans * B % 10000003);
    }
    public static boolean search(int C[], int mid, int c)
    {
        int n = C.length;
        int w = 1;
        int currentwork = 0;
        for(int i=0;i<n;i++)
        {
            // if(C[i]>mid)
            // {
            //     return false;
            // }
            if(currentwork+C[i]<=mid)
            {
                currentwork +=C[i];
            }
            else
            {
                w++;
                currentwork = C[i];
            }
        }
        // return w<=c;
        if(w<=c)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static int sum(int[] arr) {
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            sum = sum+arr[i];
        }
        return sum;
    }
    public static int maximum(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        return max;
    }
}
