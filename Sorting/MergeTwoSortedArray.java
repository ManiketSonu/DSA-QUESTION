package Sorting;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int A[] = {1,2,3,0,0,0};
        int B[] = {2,5,6};
        int n = A.length;
        int m = B.length;
        // int res[] = new int[n+m];
        MergetwoSorter(A, B, n, m);
        // for(int i=0;i<res.length;i++)
        // {
        //     System.out.print(res[i]+" ");
        // }
        // int result[] = mergetwoSortedArr(A, B);
        // for(int i=0;i<result.length;i++)
        // {
            // System.out.print(result[i]+" ");
        // }
    }
    public static void MergetwoSorter(int A[], int B[], int n, int m)
    {
        int res[] = new int[n+m];
        int p1 = 0, p2 = 0, p3 = 0;
        while(p1<n && p2<m)
        {
            if(A[p1]<=B[p2])
            {
                res[p3] = A[p1];
                p1++;
            }
            else
            {
                res[p3] = B[p2];
                p2++;
            }
            p3++;
        }
        while(p1<n)
        {
            res[p3] = A[p1];
            p1++;
            p3++;
        }
        while(p2<m)
        {
            res[p3] = B[p2];
            p2++;
            p3++;
        }
        for (int i = 0; i < n + m; i++) {
            System.out.print(res[i] + " ");
        }
    }
    // public static int[] mergetwoSortedArr(int A[], int B[])
    // {
    //     int n = A.length;
    //     int m = B.length;
    //     int res[] = new int[n+m];
    //     int p1 = 0, p2=0, p3=0;
    //     while(p1<n && p2<m)
    //     {
    //         if(A[p1]<=B[p2])
    //         {
    //             res[p3] = A[p1];
    //             p1++;
    //             p3++;
    //         }
    //         else
    //         {
    //             res[p3] = B[p2];
    //             p2++;
    //             p3++;
    //         }
    //     }
    //     while(p1<n)
    //     {
    //         res[p3] = A[p1];
    //         p1++;
    //         p3++;
    //     }
    //     while(p2<m)
    //     {
    //         res[p3] = B[p2];
    //         p2++;
    //         p3++;
    //     }
    //     return res;
    // }
}
