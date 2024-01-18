package Array_TwoD;

public class Transpose_Matrix {
    public static void main(String arg[])
    {
        // int arr[][] = {{1,2,3},{5,6,7},{9,10,11}};
        int arr[][] = {{1,2},{3,4}};
        int res1[][] = Transpose(arr);
        for(int i=0;i<res1.length;i++)
        {
            for(int j=0;j<res1.length;j++)
            {
                System.out.print(res1[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int [][] Transpose(int arr[][])
    {
        int row=arr.length;
        int colum=arr[0].length;
        int result[][] = new int[row][colum];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<colum;j++)
            {
                result[j][i]=arr[i][j];
            }
        }
        return result;
    }
}
