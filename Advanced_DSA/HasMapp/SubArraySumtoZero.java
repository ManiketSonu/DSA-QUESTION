package Advanced_DSA.HasMapp;

import java.util.HashSet;

public class SubArraySumtoZero {
    public static void main(String[] args) {
        int arr[] = {2,5,6,7,0,8};
        System.out.println(SumtoZero(arr));
    }
    public static int SumtoZero(int arr[])
    {
        int n = arr.length;
        int pf[] = new int[n];
        pf[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pf[i] = pf[i - 1] + arr[i];
        }
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (pf[i] == 0 || hs.contains(pf[i])) {
                return 1;
            }
            hs.add(pf[i]);
        }
        return 0;
        //---------------------------------------------------------------------
        // int n = arr.length;
        // int pf[] = new int[n];
        // pf[0] = arr[0];
        // for(int i=1;i<n;i++)
        // {
        //     pf[i] = pf[i-1]+arr[i];
        // }
        // for(int i=0;i<n;i++)
        // {
        //     int sum=pf[i];
        //     for(int j=i;j<n;j++)
        //     {
        //         sum = pf[j]-pf[i];
        //         if(sum==0)
        //         {
        //             return 1;
        //         }
        //     }
        // }
        // return 0;
        //---------------------------------------------------------------------
        // int n = arr.length;
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=i;j<n;j++)
        //     {
        //         int sum = 0;
        //         for(int k=i;k<=j;k++)
        //         {
        //             sum = sum+arr[k];
        //         }
        //         if(sum==0)
        //         {
        //             return 1;
        //         }
        //     }
        // }
        // return 0;
        //---------------------------------------------------------------------
    }
}
