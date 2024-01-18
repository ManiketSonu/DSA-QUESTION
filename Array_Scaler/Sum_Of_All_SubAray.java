package Array_Scaler;

public class Sum_Of_All_SubAray {
    public static void main(String arg[])
    {
        int arr[] = {2,1,3,5};
        System.out.println(subArraySum(arr));
    }
    public static int subArraySum(int arr[])
    {
        // int sum=0;
        // for(int i=0;i<arr.length;i++)
        // {
        //     sum=sum+arr[i]*(i+1)*(arr.length-i);
        // }
        // return sum;
            int sum=0;
            for(int i=0;i<arr.length;i++)
            {
                for(int j=i;j<arr.length;j++)
                {
                    for(int k=i;k<=j;k++)
                    {
                        sum=sum+arr[k];
                    }
                }
            }
            return sum;
    }
}
