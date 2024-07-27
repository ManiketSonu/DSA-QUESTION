package LeetCode150;

public class MontotonicArray {
    public static void main(String[] args) {
        // int arr[] = {1,2,2,3};
        // int arr[] = {6,5,4,4};
        int arr[] = {1,3,2};
        System.out.println(MonotnicA(arr));
    }
    public static boolean MonotnicA(int arr[])
    {
        int n = arr.length;
        boolean increasing = true;
        boolean decreasing = true;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>arr[i-1])
            {
                decreasing = false;
            }
            else if(arr[i]<arr[i-1])
            {
                increasing = false;
            }
            if(!increasing && !decreasing)
            {
                return false;
            }
        }
        return true;
    }
}
