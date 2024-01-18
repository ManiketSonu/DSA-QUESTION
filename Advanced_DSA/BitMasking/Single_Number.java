package Advanced_DSA.BitMasking;

public class Single_Number {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 1};
        System.out.println(SinleNumber(arr));
    }
    public static int SinleNumber(int arr[])
    {
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            ans = ans^arr[i];
        }
        return ans;
    }
}
