package LeetCode150;

public class SubarrayProductlessK {
    public static void main(String[] args) {
        int arr[] = {10,5,2,6};
        int k = 100;
        System.out.println(ProductSubarray(arr, k));
    }
    public static int ProductSubarray(int arr[], int k)
    {
        // int n = arr.length;
        // int count = 0;
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=i;j<n;j++)
        //     {
        //         int product = 1;
        //         for(int s=i;s<=j;s++)
        //         {
        //             product = product*arr[s];
        //         }
        //         if(product<k)
        //         {
        //             count++;
        //         }
        //     }
        // }
        // return count;
        int n = arr.length;
        int count = 0;
        int product = 1;
        int left = 0;
        for(int right=0;right<n;right++)
        {
            product = product*arr[right];
            while(left<=right && product>=k)
            {
                product = product/arr[left];
                left++;
            }
            count = count+(right-left+1);
        }
        return count;
    }
}
