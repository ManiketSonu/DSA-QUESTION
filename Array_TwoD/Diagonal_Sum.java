package Array_TwoD;

public class Diagonal_Sum {
    public static void main(String arg[])
    {
        int arr[][] = {{1,2,3},{5,6,7},{9,10,11}};
        DiagonalSum(arr);
    }
    public static void DiagonalSum(int arr[][])
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(i==j)
                {
                    System.out.println(arr[i][j]);
                    sum=sum+arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
