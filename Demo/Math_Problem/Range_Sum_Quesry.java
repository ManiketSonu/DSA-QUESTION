package Demo.Math_Problem;

public class Range_Sum_Quesry {
    public static void main(String arg[])
    {
        int arr[] = {-3,6,2,4,5,2,8,-9,3,1};
        int left[] = {1,1,1,2,0};
        int right[] = {4,6,3,4,7};
        RangeSumQuery(arr, left, right);
    }
    public static void RangeSumQuery(int arr[],int left[], int right[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int l=left[i];
            int r=right[i];
            int sum=0;  
            for(int j=l;j<=r;j++)
            {
                sum=sum+arr[j];
            }
            System.out.println(sum);
        }
    }
}
