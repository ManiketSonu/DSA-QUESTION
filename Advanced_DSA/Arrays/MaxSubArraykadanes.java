package Advanced_DSA.Arrays;

public class MaxSubArraykadanes {
    public static void main(String[] args) {
        int arr[] = {-2,3,4,-1,5,-10,7};
        System.out.println(kadanesAlgo(arr));
    }
    public static int kadanesAlgo(int arr[])
    {
        int sum=0;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            ans=Math.max(ans, sum);
            if(sum<0)
            {
                sum=0;
            }
        }
        return ans;
    }
}
