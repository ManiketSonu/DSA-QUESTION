package Sorting;

public class ReversePair {
    public static void main(String[] args) {
        int arr[] = {4, 1, 2};
        // System.out.println(ReversePairr(arr));
        int res = Reversepair(arr, 0, arr.length-1);
        System.out.println(res);
    }
    // public static int ReversePairr(int arr[])
    // {
    //     int n = arr.length;
    //     int count = 0;
    //     for(int i=0;i<n-1;i++)
    //     {
    //         for(int j=i+1;j<n;j++)
    //         {
    //             if(arr[j]>2*arr[i])
    //             {
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;
    // }
    public static int Reversepair(int arr[], int l, int r)
    {
        if(l>=r)
        {
            return 0;
        }
        int mid = (l+r)/2;
        int count = 0;
        int c1 = Reversepair(arr, l, mid);
        int c2 = Reversepair(arr, mid+1, r);
        int i = l;
        int j = mid+1;
        while(i<=mid && j<=r)
        {
            if((long)arr[i]>2*(long)arr[j])
            {
                count = count+mid-i+1;
                j++;
            }
            else
            {
                i++;
            }
        }
        merge(arr, l, mid, r);
        return (c1+c2+count);
    }
    public static void merge(int[] arr, int l, int mid, int r) {
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
    }
}
