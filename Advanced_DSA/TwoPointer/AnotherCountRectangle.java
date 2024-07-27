package Advanced_DSA.TwoPointer;

public class AnotherCountRectangle {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5};
        int b = 5;
        System.out.println(solve(arr, b));
    }
    public static int solve(int arr[], int b)
    {
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int count = 0;
        while(left<n && right>=0)
        {
            int area = arr[left]*arr[right];
            if(area<b)
            {
                count = count+right+1;
                left++;
            }
            else
            {
                right--;
            }
        }
        return count;
    }
    // public static int solve(int arr[], int b)
    // {
    //     int n = arr.length;
    //     int count = 0;
    //     for(int i=0;i<n;i++)
    //     {
    //         for(int j=i;j<n;j++)
    //         {
    //             if(arr[j]*arr[i]<b)
    //             {
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;
    // }
}
