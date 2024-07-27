package Advanced_DSA.TwoPointer;

public class SubArraywithgivenSumK {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int B = 5;
        int result[] = solve(arr, B);
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
    public static int[] solve(int A[], int B)
    {
        int n = A.length;
        int start = 0;
        int end = 0;
        int sum = 0;
        while(end<n)
        {
            sum = sum+A[end];
            while(sum>B && start<=end)
            {
                sum = sum-A[start];
                start++;
            }
            if(sum==B)
            {
                int res[] = new int[end-start+1];
                for(int i=start;i<=end;i++)
                {
                    res[i-start] = A[i];
                }
                return res;
            }
            end++;
        }
        return new int[]{-1};
        // int n = arr.length;
        // int result[] = new int[]{-1};
        // for(int i=0;i<n;i++)
        // {
        //     int sum = 0;
        //     for(int j=i;j<n;j++)
        //     {
        //         sum = sum+arr[j];
        //         if(sum==b)
        //         {
        //             int []subarray = new int[j-i+1];
        //             for(int k=i;k<=j;k++)
        //             {
        //                 subarray[k-i] = arr[k];
        //             }
        //             return subarray;
        //         }
        //     }
        // }
        // return result;
    }
}
