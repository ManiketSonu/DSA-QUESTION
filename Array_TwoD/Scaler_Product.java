package Array_TwoD;

public class Scaler_Product {
    public static void main(String arg[])
    {
        int arr[][] = {{1,2,3},{5,6,7},{9,10,11}};
        int res1[][] = ScalerProduct(arr, 10);
        for(int i=0;i<res1.length;i++)
        {
            for(int j=0;j<res1.length;j++)
            {
                System.out.print(res1[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int [][] ScalerProduct(int arr[][],int B)
    {
        int row=arr.length;
        int colms=arr[0].length;
        int result[][] = new int[row][colms];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<colms;j++)
            {
                result[i][j]=arr[i][j]*B;
            }
        }
        return result;
    }
}
