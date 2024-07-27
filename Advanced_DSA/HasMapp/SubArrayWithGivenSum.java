package Advanced_DSA.HasMapp;

import java.util.HashMap;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int k = 5;
        int res[] = solve(arr, k);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
    public static int[] solve(int A[], int B)
    {
        //Given an array of positive integers A and an integer B, find and return first continuous subarray which adds to B.
        //If the answer does not exist return an array with a single integer "-1".
        //first sub-array means the sub-array for which starting index in minimum.
        int n = A.length;
        long sum = 0;
        HashMap<Long, Integer> hs = new HashMap<>();
        hs.put(0l,-1);
        int s = -1, e = -1;
        for(int i=0;i<n;i++)
        {
            sum = sum+A[i];
            if(hs.containsKey(sum-B)==true)
            {
                s = hs.get(sum-B)+1;
                e=i;
                break;
            }
            hs.put(sum, i);
        }
        if(s==-1)
        {
            int ans[] = {-1};
            return ans;
        }
        int ans[] = new int[e-s+1];
        int k = 0;
        for(int i=s;i<=e;i++)
        {
            ans[k] = A[i];
            k++;
        }
        return ans;
    }
    //------------------------------------------------------O(n^2--sollution)
    // public static int[] solve(int arr[], int target)
    // {
    //     int n = arr.length;
    //     int res[] = new int[2];
    //     for(int i=0;i<n;i++)
    //     {
    //         int sum = 0;
    //         for(int j=i;j<n;j++)
    //         {
    //             sum = sum+arr[j];
    //             if(sum == target && i!=j)
    //             {
    //                 res[0] = arr[i];
    //                 res[1] = arr[j];
    //             }
    //         }
    //     }
    //     return res;
    // }
    //------------------------------------------------------O(n^3--sollution)
    // public static void solve(int arr[], int target)
    // {
    //     int n = arr.length;
    //     for(int i=0;i<n;i++)
    //     {
    //         for(int j=i;j<n;j++)
    //         {
    //             int sum = 0;
    //             for(int k=i;k<=j;k++)
    //             {
    //                 sum = sum+arr[k];
    //             }
    //             if(sum==target && i!=j)
    //             {
    //                 System.out.print(arr[i]+" "+arr[j]);
    //             }
    //         }
    //     }
    // }
}
