package Demo.Math_Problem;

public class Range_Sum_Query {
    public static void main(String arg[])
    {
        int arr[] = {-3,6,2,4,5,2,8,-9,3,1};
        int left[] = {1,1,1,2,0};
        int right[] = {4,6,3,4,7};
        RangeSumQuery(arr, left, right);
    }
    public static void RangeSumQuery(int arr[],int left[], int right[])
    {
        int n = arr.length;
        int[] pf = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            int l=left[i];
            int r=right[i];
            int sum=0;  
            // for(int j=l;j<=r;j++)
            // {
                while(l<=r){
                if(l==0){
                     sum=pf[r];
                }else{
                    sum = pf[r] - pf[l-1]; 
                }
            // }
                l++;
                r--;
            }
            System.out.println(sum);
        }
    }
}
