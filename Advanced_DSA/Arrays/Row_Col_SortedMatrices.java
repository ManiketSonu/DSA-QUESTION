package Advanced_DSA.Arrays;

public class Row_Col_SortedMatrices {
    public static void main(String[] args) {
        int arr[][] = {{5,10,15,20},{6,12,18,24},{7,14,21,28},{8,16,24,34}};
        // int arr[][] = {{1,2},{3,3}};
        System.out.println(RowColmSorted(arr, 16));
    }
    public static int RowColmSorted(int arr[][], int k)
    {
        int n=arr.length;
        int m=arr[0].length;
        int i=0;
        int j=m-1;
        int min=Integer.MAX_VALUE;
        while(i<n && j>=0)
        {
            if(arr[i][j]==k)
            {
                // min = Math.min(min, (i+1)*1009+(j+1));
                // j--;
                return j;
            }
            else if(arr[i][j]<k)
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        if(min==Integer.MAX_VALUE)
            return -1;
        else
            return min;
    }
    // public static int SortedK(int arr[][], int k)
    // {
    //     int n=arr.length;
    //     int m=arr.length;
    //     for(int i=0;i<n;i++)
    //     {
    //         for(int j=0;j<m;j++)
    //         {
    //             if(arr[i][j]==k)
    //             {
    //                 return 1;
    //             }
    //         }
    //     }
    //     return 0;
    // }
}
