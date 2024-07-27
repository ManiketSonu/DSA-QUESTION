package Array_Scaler;

import java.util.Arrays;

public class kth_SmallestElement {
    public static void main(String[] args) {
        int arr[] = {2, 1, 4, 3, 2};
        int k = 3;
        System.out.println(KSmall(arr, k));
    }
    public static int KSmall(int arr[], int k)
    {
        Arrays.sort(arr);
        int res = 0;
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            res = arr[k-1];
        }
        return res;
    }
}
