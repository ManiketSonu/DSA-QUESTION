package Array_TwoD;

public class Array_Colm_WiseSum {
    public static void main(String arg[])
    {
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int res1[] = ColumWiseSum(arr);
        for(int i=0;i<res1.length;i++)
        {
            System.out.println(res1[i]+" ");
        }
    }
    public static int [] ColumWiseSum(int arr[][])
    {
        int row=arr.length;
        int colum=arr[0].length;
        int result[] = new int[colum];
        for(int j=0;j<colum;j++)
        {
            int sum=0;
            for(int i=0;i<row;i++)
            {
                sum=sum+arr[i][j];
            }
            result[j]=sum;
        }
        return result;
    }
}
