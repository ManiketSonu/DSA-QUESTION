package Demo.Math_Problem;

public class Range_Sum_On {
    public static void main(String arg[])
    {
        int arr[] = {1,0,3,6};
        int arr1[] = RangeSum(arr);
        for(int i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]+" ");
        }
    }
    public static int[] RangeSum(int arr[])
    {
        int n=arr.length;
        int pf[] = new int[n];
        pf[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            pf[i]=pf[i-1]+arr[i];
        }
        return pf;
    }
}
