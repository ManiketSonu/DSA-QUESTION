package LeetCode150;

public class first_last_element {
    public static void main(String[] args) {
        // int arr[] = {5,7,7,8,8,10};
        int arr[] = {};
        int target = 6;
        int res[] = searchRange(arr, target);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
    public static int[] searchRange(int arr[], int target)
    {
        int n = arr.length;
        int res[] = new int[2];
        if(n==0)
        {
            res[0] = -1;
            res[1] = -1;
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]==target)
            {
                res[0] = i;
                break;
            }
            else
            {
                res[0] = -1;
            }
        }
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]==target)
            {
                res[1] = i;
                break;
            }
            else
            {
                res[1] = -1;
            }
        }
        return res;
    }
}
