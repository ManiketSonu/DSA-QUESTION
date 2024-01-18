package Array_TwoD;

public class Degree_Rotation {
    public static void main(String arg[])
    {
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int res[][] = DegreeRotation(arr);
        for(int i=0;i<res.length;i++)
        {
            for(int j=0;j<res[0].length;j++)
            {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int [][] DegreeRotation(int arr[][])
    {
        int n=arr.length;
        int m=arr[0].length;
        int result[][] = new int[m][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                result[j][n-1-i]=arr[i][j];
            }
        }
        return result;
    }
}
