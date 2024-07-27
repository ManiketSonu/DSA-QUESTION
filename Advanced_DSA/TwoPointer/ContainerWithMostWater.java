package Advanced_DSA.TwoPointer;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        // int arr[] = {1, 5, 4, 3};
        int arr[] = {1,2,3};
        System.out.println(solve(arr,10));
    }
    public static int solve(int arr[], int B)
    {
        int n = arr.length;
        if(n==1)
        {
            return 0;
        }
        int low = 0;
        int high = n-1;
        int ans = 0;
        while(low<high)
        {
            ans = Math.max(ans,(high-low)*Math.min(arr[low],arr[high]));
            if(arr[low]>arr[high])
            {
                high--;
            }
            if(arr[low]<arr[high])
            {
                low++;
            }
            else
            {
                low++;
                high++;
            }
        }
        return ans-B;
    }
}
