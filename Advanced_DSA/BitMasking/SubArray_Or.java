package Advanced_DSA.BitMasking;

public class SubArray_Or {
    public static void main(String[] args) {
        int arrr[] = {1,2,3};
        int res[]=SubArrayOR(arrr);
        for(int i=0;i<res.length;i++)
        {
            System.out.println(res[i]);
        }
    }
    public static int[] SubArrayOR(int arrr[])
    {
        int n = arrr.length;
        int pf[] = new int[n];
        pf[0] = arrr[0];
        for(int i=1;i<n;i++)
        {
            pf[i] = pf[i-1]+arrr[i];
        }
        return pf;
    }
    // public static int AddSubArayOR(int arr[])
    // {
    //     // int n=arr.length;
    //     int res[] = SubArrayOR(arr);
    //     int sum=0;
    //     for(int i=0;i<res.length;i++)
    //     {
    //         sum = sum+res[i];
    //     }
    //     return sum;
    // }
}
