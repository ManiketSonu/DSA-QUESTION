package Array_Scaler;

public class Equilibrium_Index {
    public static void main(String arg[])
    {
        int arr[] = {-7,1,5,2,-4,3,0};
        int res1 = EQIndex(arr);
        System.out.println(res1);
    }
    public static int EQIndex(int arr[])
    {
        int n=arr.length;
        int sum=0;
        int leftSum=0;
        int righSum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        righSum=sum;
        for(int i=0;i<n;i++)
        {
            righSum=righSum-arr[i];
            if(leftSum==righSum)
            {
                return i;
            }
            leftSum=leftSum+arr[i];
        }
        return -1;
    }
}
