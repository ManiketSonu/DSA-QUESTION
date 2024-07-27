package LeetCode150;

public class Find_Peak_Element {
    public static void main(String[] args) {
        // int arr[] = {1,2,1,3,5,6,4};
        // int arr[] = {1};
        int arr[] = {2,1};
        System.out.println(PeakElement(arr));
    }
    public static int PeakElement(int arr[])
    {
        // int max = Integer.MIN_VALUE;
        // for(int i=0;i<arr.length;i++)
        // {
        //     if(max<arr[i])
        //     {
        //         max = i;
        //     }
        // }
        // return max;
        int n = arr.length;
        if(n==1)
        {
            return 0;
        }
        if(arr[0]>arr[1])
        {
            return 0;
        }
        if(arr[n-1]>arr[n-2])
        {
            return n-1;
        }
        int low = 1;
        int high = n-2;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            else if(arr[mid]>arr[mid-1])
            {
                low = mid+1;
            }
            else if(arr[mid]>arr[mid+1])
            {
                high = mid-1;
            }
        }
        return -1;
    }
}
