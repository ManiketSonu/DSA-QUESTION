package Advanced_DSA.TwoPointer;

import java.util.Arrays;

public class ThreeSumCloset {
    public static void main(String[] args) {
        int arr[] = {3,4,5};
        int b = 8;
        System.out.println(solve(arr, b));
    }
    public static int solve(int arr[], int b)
    {
        int n = arr.length;
        Arrays.sort(arr);
        int closetSum = arr[0]+arr[1]+arr[2];
        for(int i=0;i<n;i++)
        {
            int left = i+1;
            int right = n-1;
            while(left<right)
            {
                int sum = arr[i]+arr[left]+arr[right];
                if(Math.abs(sum-b)<Math.abs(closetSum-b))
                {
                    closetSum = sum;
                }
                if(sum<b)
                {
                    left++;
                }
                else if(sum>b)
                {
                    right--;
                }
                else
                {
                    return closetSum;
                }
            }
        }
        return closetSum;
    }
}
