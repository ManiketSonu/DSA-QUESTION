package Advanced_DSA.HasMapp;

import java.util.HashSet;

public class CheckPair_Sum {
    public static void main(String[] args) {
        int arr[] = {9, 10, 7, 10, 9, 1, 5, 1, 5};
        int b = 21;
        System.out.println(solve(arr, b));
    }
    public static int solve(int arr[], int b)
    {
        int n = arr.length;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            int ele = arr[i];
            int compl = b-arr[i];
            if(hs.contains(compl))
            {
                return 1;
            }
            hs.add(ele);
        }
        return 0;
    }
    //Brute force approach
    // public static int pairSum(int arr[], int b)
    // {
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         for(int j=0;j<arr.length;j++)
    //         {
    //             if(arr[i]+arr[j]==b)
    //             {
    //                 return 1;
    //             }
    //         }
    //     }
    //     return 0;
    // }
}
