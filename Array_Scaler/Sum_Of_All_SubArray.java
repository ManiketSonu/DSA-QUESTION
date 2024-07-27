package Array_Scaler;

public class Sum_Of_All_SubArray {
    public static void main(String[] args) {
        int arr[] = {2,1,3,5};
        System.out.println(SumofAllSubarray(arr));
    }
    public static int SumofAllSubarray(int arr[])
    {
        int ans=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum=sum+arr[j];
                ans=ans+sum;
            }
        }
        return ans;
    }
}
