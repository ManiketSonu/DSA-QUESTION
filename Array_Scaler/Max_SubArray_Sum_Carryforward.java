package Array_Scaler;

public class Max_SubArray_Sum_Carryforward {
    public static void main(String[] args) {
        int arr[] = {3,6,0,2,8,9};
        System.out.println(MaxSum(arr));
    }
    public static int MaxSum(int arr[])
    {
        int n=arr.length;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum=sum+arr[j];
                ans=Math.max(ans, sum);
            }
        }
        return ans;
    }
}
