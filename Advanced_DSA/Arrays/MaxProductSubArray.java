package Advanced_DSA.Arrays;

public class MaxProductSubArray {
    public static void main(String[] args) {
        int arr[] = {-3, 0, -5, 0};
        System.out.println(solve(arr));
    }
    public static int solve(int arr[])
    {
        int product = 1;
        int n = arr.length;
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            product = product*arr[i];
            ans = Math.max(ans, product);
            if(product<1)
            {
                product = 1;
            }
        }
        return ans;
    }
}
