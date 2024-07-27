package Advanced_DSA.HasMapp;

import java.util.HashMap;

public class SubarraySumequaltoK {
    public static void main(String[] args) {
        int arr[] = {3, 5, 1, 2};
        System.out.println(SumequaltoK(arr, 4));
    }
    public static int SumequaltoK(int arr[], int k)
    {
        int n = arr.length;
        int pf[] = new int[n];
        pf[0] = arr[0];
        for(int i=1;i<n;i++)
        {
            pf[i] = pf[i-1]+arr[i];
        }
        int count = 0;
        HashMap<Integer,Integer> hs = new HashMap<>();
        hs.put(0,1);
        for(int i=0;i<n;i++)
        {
            int ele = pf[i];
            int target = ele-k;
            if(hs.containsKey(target))
            {
                count = count+hs.get(target);
            }
                hs.put(ele, hs.getOrDefault(ele, 0)+1);
        }
        return count;
    }
}
