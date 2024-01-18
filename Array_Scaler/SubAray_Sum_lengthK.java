package Array_Scaler;

public class SubAray_Sum_lengthK {
    public static void main(String[] args) {
        int arr[] = {-3,4,-2,5,3,-2,8,2,-1,4};
        System.out.println(MaxSubArraySum(arr, 5));
    }
    public static int MaxSubArraySum(int arr[],int k)
    {
        int n=arr.length;
        int start=0;
        int end=k-1;
        int ans=Integer.MIN_VALUE;
        while(end<n)
        {
            int sum=0;
            for(int i=start;i<=end;i++)
            {
                sum=sum+arr[i];
            }
            ans = Math.max(ans, sum);
            start++;
            end++;
        }
        return ans;
    }
}
