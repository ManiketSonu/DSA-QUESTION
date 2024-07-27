package LeetCode150;

public class Minimum_Size_SubarraySum {
    public static void main(String[] args) {
        int arr[] = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(SubArraySum(arr, target));
    }
    public static int SubArraySum(int arr[], int target)
    {
        int n = arr.length;
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            sum = sum+arr[i]*(i+1)*(n-1);
        }
        if(sum==target)
        {
            return n;
        }
        return 0;
    }
}
