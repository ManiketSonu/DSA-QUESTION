package Demo.Math_Problem;

public class Equilibrium_Element {
    public static void main(String arg[])
    {
        int arr[] = {-7,1,5,2,-4,3,0};
        Euilibrium(arr);
    }
    public static void Euilibrium(int arr[])
    {
        int n=arr.length;
        int sum=0;
        int leftSum=0;
        int rightSum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        rightSum=sum;
        for(int i=0;i<n;i++)
        {
            rightSum=rightSum-arr[i];
            if(leftSum==rightSum)
            {
                System.out.print(arr[i]);
                // System.out.println(i);
                break;
            }
            leftSum=leftSum+arr[i];
        }
    }
}
