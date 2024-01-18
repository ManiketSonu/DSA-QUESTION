package Array_Scaler;

public class PrefixSum {
    public static void main(String arg[])
    {
        int arr[] = {1,2,3,4,5};
        int res[] = PFSum(arr);
        for(int i=0;i<res.length;i++)
        {
            System.out.println(res[i]+" ");
        }
    }
    public static int[] PFSum(int arr[])
    {
        int n=arr.length;
        int pref[] = new int[n];
        pref[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            pref[i]=pref[i-1]+arr[i];
        }
        return pref;
    }
}
