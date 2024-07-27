package Advanced_DSA.TwoPointer;

public class TwoSumWithoutDuplicates {
    public static void main(String[] args) {
        int arr[] = {-3,0,1,3,6,8,11,14,18,25};
        int k  = 12;
        System.out.println(solve(arr, k));
    }
    public static int solve(int arr[], int k)
    {
        int n = arr.length;
        int i = 0;
        int j = n-1;
        int ans = 0;
        while(i<j)
        {
            if(arr[i]+arr[j]==k)
            {
                ans++;
                i++;
                j--;
            }
            else if(arr[i]+arr[j]<k)
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return ans;
    }
}
