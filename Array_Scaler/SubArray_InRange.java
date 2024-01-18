package Array_Scaler;

public class SubArray_InRange {
    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 6};
        int result[] = Range(arr, 1, 3);
        for(int i=0;i<result.length;i++)
        {
            System.out.println(result[i]+" ");
        }
    }
    public static int[] Range(int arr[], int l, int r)
    {
        // int n=arr.length;
        int subArraySize = r-l+1;
        int[] res = new int[subArraySize];
        int j=0;
        for(int i=l;i<=r;i++)
        {
            res[j] = arr[i];
            j++;
        }
        return res;
    }
}
