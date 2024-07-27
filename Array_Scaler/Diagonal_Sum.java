package Array_Scaler;

public class Diagonal_Sum {
    public static void main(String[] args) {
        // int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int mat[][] = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        // System.out.println(AntidiagonalSum(mat));
        // int res = AntidiagonalSum(mat);
        // int res1 = diagonalSum(mat);
        // int result = res+res1;
        // System.out.println(result);
        System.out.println(diagonalSum(mat));
    }
    public static int diagonalSum(int mat[][])
    {
        int n = mat.length;
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            sum = sum+mat[i][i];
            sum = sum+mat[i][n-1-i];
        }
        if(n%2==1)
        {
            sum = sum-mat[n/2][n/2];
        }
        return sum;
    }
    // public static int AntidiagonalSum(int mat[][])
    // {
    //     int sum = 0;
    //     int n = mat.length;
    //     int i=0;
    //     int j=n-1;
    //     while(i<n)
    //     {
    //         if(i==j)
    //         {
    //             i++;
    //             j--;
    //             continue;
    //         }
    //         sum = sum+mat[i][j];
    //         i++;
    //         j--;
    //     }
    //     return sum;
    // }
    // public static int diagonalSum(int mat[][])
    // {
    //     int sum = 0;
    //     for(int i=0;i<mat.length;i++)
    //     {
    //         sum = sum+mat[i][i];
    //     }
    //     return sum;
    // }
}
