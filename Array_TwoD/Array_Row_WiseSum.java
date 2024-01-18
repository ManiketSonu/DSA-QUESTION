package Array_TwoD;

public class Array_Row_WiseSum {
    public static void main(String arg[])
    {
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int res1[] = RowWiseSum(arr);
        for(int i=0;i<res1.length;i++)
        {
            System.out.println(res1[i]+" ");
        }
    }
    public static int[] RowWiseSum(int arr[][])
    {
        int row=arr.length;
        int colms=arr[0].length;
        int result[] = new int[row];
        for(int i=0;i<row;i++)
        {
            int sum=0;
            for(int j=0;j<colms;j++)
            {
                sum=sum+arr[i][j];
            }
            result[i]=sum;
        }
        return result;
    }
}
