package Sorting;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {3,10,6,8,15,2,12,18,17};
        int result[] = sortedArray(arr, 0, arr.length-1);
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
    public static int[] sortedArray(int arr[], int l, int r)
    {
        if(l==r)
        {
            int res[] = new int[1];
            res[0] = arr[l];
            return res;
        }
        
        int mid = (l+r)/2;
        int left[] = sortedArray(arr, l, mid);
        int right[] = sortedArray(arr, mid+1, r);
        return merge(left, right);
    }
    public static int[] merge(int left[], int right[])
    {
        int n = left.length;
        int m = right.length;
        int res[] = new int[n+m];
        int p1 = 0, p2 = 0, p3 = 0;
        while(p1<n && p2<m)
        {
            if(left[p1]<=right[p2])
            {
                res[p3] = left[p1];
                p1++;
                p3++;
            }
            else
            {
                res[p3] = right[p2];
                p2++;
                p3++;
            }
        }
        while(p1<n)
        {
            res[p3] = left[p1];
            p1++;
            p3++;
        }
        while(p2<m)
        {
            res[p3] = right[p2];
            p2++;
            p3++;
        }
        return res;
    }
}
