package Advanced_DSA.Arrays;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int arr[] = {-3,0,5,2,-8};
        int res = MaxSubArraySumm(arr);
        System.out.println(res);
    }
    public static int MaxSubArraySumm(int arr[])
    {
        int n=arr.length;
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum = sum+arr[j];
                ans = Math.max(ans, sum);
            }
        }
        return ans;
    }
}
