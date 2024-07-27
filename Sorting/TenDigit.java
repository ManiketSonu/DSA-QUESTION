package Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class TenDigit {
    public static void main(String[] args) {
        int arr[] = {15, 11, 7, 19};
        int res[] = solve(arr);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
    public static int[] solve(int arr[])
    {
        Integer[] res = new Integer[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            res[i] = arr[i];
        }
        Arrays.sort(res, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b)
            {
                int tenA = (a/10)%10;
                int tenB = (b/10)%10;
                if(tenA==tenB)
                {
                    return Integer.compare(b, a);
                }
                return Integer.compare(tenA, tenB);
            }
            
        });
        int result[] = new int[res.length];
        for(int i=0;i<result.length;i++)
        {
            result[i] = res[i];
        }
        return result;
    }
}
