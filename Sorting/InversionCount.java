package Sorting;

public class InversionCount {
    public static void main(String[] args) {
        int arr[] = {3, 4, 1, 2};
        // System.out.println(solve(arr));
        long res = Inversioncount(arr, 0, arr.length-1);
        System.out.println(res);
    }
    // public static int solve(int arr[])
    // {
    //     int n = arr.length;
    //     int count = 0;
    //     for(int i=0;i<n;i++)
    //     {
    //         for(int j=i+1;j<n;j++)
    //         {
    //             if(i<j && arr[i]>arr[j])
    //             {
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;
    // }
    public static long Inversioncount(int arr[], int l, int r)
    {
        if(l>=r)
        {
            return 0;
        }
        int mid = (l+r)/2;
        long c1 = Inversioncount(arr, l, mid);
        long c2 = Inversioncount(arr, mid+1, r);
        long c3 = merge(arr, l, mid, r);
        return c1+c2+c3;
    }
    public static long merge(int[] arr, int l, int mid, int r) {
        int n1 = mid-l+1;
        int n2 = r-mid;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for(int i=0;i<n1;i++)
        {
            left[i] = arr[l+i];
        }
        for(int j=0;j<n2;j++)
        {
            right[j] = arr[mid+1+j];
        }
        int p1 = 0;
        int p2 = 0;
        int p3 = l;
        long count = 0;
        while(p1<n1 && p2<n2)
        {
            if(left[p1]<=right[p2])
            {
                arr[p3] = left[p1];
                p1++;
                p3++;
            }
            else
            {
                arr[p3] = right[p2];
                count = count+(n1-p1);
                p2++;
                p3++;
            }
        }
        while(p1<n1)
        {
            arr[p3] = left[p1];
            p1++;
            p3++;
        }
        while(p2<n2)
        {
            arr[p3] = right[p2];
            p2++;
            p3++;
        }
        return (int)count;
    }
}
