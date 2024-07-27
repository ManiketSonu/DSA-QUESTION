package Array_Scaler;

public class LongestSubArraySumZero {
    public static void main(String[] args) {
        int arr[] = {1,-2,1,2};
        System.out.println(solve(arr));
    }
    public static int solve(int arr[])
    {
        int n = arr.length;
        int maxLen = 0;
        for(int i=0;i<n;i++)
        {
            int sum = 0;
            for(int j=i;j<n;j++)
            {
                sum = sum+arr[j];
                if(sum==0 && j-i+1>maxLen)
                {
                    maxLen = j-i+1;
                }
            }
        }
        return maxLen;
    }
}
