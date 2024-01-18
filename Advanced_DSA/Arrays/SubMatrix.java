package Advanced_DSA.Arrays;

public class SubMatrix {
    public static void main(String[] args) {
        int arr[][] = {{4,9,6},{5,-1,2}};
        System.out.println(SubMatrixSum(arr));
    }
    public static int SubMatrixSum(int arr[][])
    {
        int n=arr.length;
        int m=arr[0].length;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                ans = ans+arr[i][j]*(i+1)*(j+1)*(n-i)*(m-j);
            }
        }
        return ans;
    }
}
