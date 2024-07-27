package Advanced_DSA.HasMapp;

import java.util.HashSet;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {9, 10, 7, 10, 9, 1, 5, 1, 5};
        System.out.println(TSum(arr,21));
    }
    public static int TSum(int arr[], int k)
    {
        int n = arr.length;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            int ele = arr[i];
            int compl = k-arr[i];
            if(hs.contains(compl))
            {
                return 1;
            }
            hs.add(ele);
        }
        return 0;
    }
}
