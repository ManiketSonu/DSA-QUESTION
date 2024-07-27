package Advanced_DSA.HasMapp;

import java.util.ArrayList;
import java.util.HashMap;

public class CommonElement {
    public static void main(String[] args) {
        int arr[] = {2, 1, 4, 10};
        int arr1[] = {3, 6, 2, 10, 10};
        int result[] = commonElement(arr, arr1);
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
    public static int[] commonElement(int A[], int B[])
    {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<A.length;i++)
        {
            int num = A[i];
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int i = 0; i < B.length; i++) {
            int num = B[i];
            if (map.containsKey(num) && map.get(num) > 0) {
                result.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }
        
        return res;
        // int n = arr.length;
        // int m = arr1.length;
        // int res[] = new int[n];
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<m;j++)
        //     {
        //         if(arr[i]==arr1[j])
        //         {
        //             res[i] = arr[i];
        //         }
        //     }
        // }
        // return res;
    }
}
