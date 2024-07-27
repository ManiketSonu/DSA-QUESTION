package Array_Scaler;

public class EachSubArraySum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        EacSum(arr);
    }
    public static void EacSum(int arr[])
    {
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int sum = 0;
                for(int k=i;k<=j;k++)
                {
                    sum = sum+arr[k];
                }
                System.out.println(sum);
            }
        }
    }
}
