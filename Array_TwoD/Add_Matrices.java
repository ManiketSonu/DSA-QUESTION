package Array_TwoD;

public class Add_Matrices {
    public static void main(String arg[])
    {
        int arr[][] = {{1,2,3},{5,6,7},{9,10,11}};
        int arr1[][] = {{1,2,3},{5,6,7},{9,10,11}};
        int res1[][] = AddMatrices(arr, arr1);
        for(int i=0;i<res1.length;i++)
        {
            for(int j=0;j<res1[0].length;j++)
            {
                System.out.print(res1[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int [][] AddMatrices(int A[][], int B[][])
    {
        int row=Math.max(A.length, B.length);
        int colms=Math.max(A[0].length, B[0].length);
        int result[][] = new int[row][colms];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<colms;j++)
            {
                int value=0;
                if(i<A.length && j<A[i].length)
                {
                    value=A[i][j];
                }
                int value1=0;
                if(i<B.length && j<B[i].length)
                {
                    value1=B[i][j];
                }
                result[i][j]=value+value1;
            }
        }
        return result;
    }

}
