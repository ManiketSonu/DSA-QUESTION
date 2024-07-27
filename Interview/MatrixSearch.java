package Interview;

public class MatrixSearch {
    public static void main(String[] args) {
        int arr[][] = {{1,   3,  5,  7},{10, 11, 16, 20},{23, 30, 34, 50}};
        int target = 3;
    }
    public static int solve(int arr[][], int target)
    {
        int n = arr.length;
        int m = arr[0].length;
        for(int i=0;i<n;i++)
        {
            int low = 0;
            int high = m-1;
            while(low<=high)
            {
                int mid = low+(high-low)/2;
                if(arr[i][mid]==target)
                {
                    return 1;
                }
                else if(arr[i][mid]<target)
                {
                    low = mid+1;
                }
                else
                {
                    high = mid-1;
                }
            }
        }
        return 0;
    }
}
