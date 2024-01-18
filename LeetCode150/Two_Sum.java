package LeetCode150;

public class Two_Sum {
    public static void main(String[] args) {
        int arr[] = {3,2,3};
        // System.out.println(TwoSumm(arr, 0));
        int res[] = TwoSumm(arr, 6);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
    public static int[] TwoSumm(int arr[], int target)
    {
        int n=arr.length;
        int arr1[] = new int[2];
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]+arr[i+1]==target)
            {
                arr1[0] = i;
                arr1[1] = i+1;
            }
        }
        return arr1;
        // int n=arr.length;
        // int arr1[] = new int[2];
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=i+1;j<n;j++)
        //     {
        //         if(arr[i]+arr[j]==target)
        //         {
        //             arr1[0] = i;
        //             arr1[1] = j;
        //         }
        //     }
        // }
        // return arr1;
    }
}
