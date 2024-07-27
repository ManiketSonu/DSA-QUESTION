package Advanced_DSA.Queuee;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int arr[] = {1,8,5,6,7,4,2,0,3};
        int k = 4;
        int result[] = solve(arr, k);
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
    public static int[] solve(int arr[], int k)
    {
        int n = arr.length;
        if(n==0 || k>n)
        {
            return new int[0];
        }
        int res[] = new int[n-k+1];
        for(int i=0;i<=n-k;i++)
        {
            int max = arr[i];
            for(int j=i+1;j<i+k;j++)
            {
                if(arr[j]>max)
                {
                    max = arr[j];
                }
            }
            res[i] = max;
        }
        return res;
    }
}
