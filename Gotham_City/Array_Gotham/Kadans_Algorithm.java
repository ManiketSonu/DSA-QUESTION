package Gotham_City.Array_Gotham;

public class Kadans_Algorithm {
    public static void main(String arg[])
    {
        int arr[] = {1,2,3,-2,5};
        System.out.println(Kadan(arr));
    }
    public static int Kadan(int arr[])
    {
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            maxSum=Math.max(maxSum, sum);
            if(sum<0)
            {
                sum=0;
            }
        }
        return maxSum;
    }
}
