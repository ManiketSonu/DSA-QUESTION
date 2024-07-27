package Advanced_DSA.Arrays;

public class Richest_CustomerWealth {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{3,2,1}};
        // int result[] = maximumWealth(arr);
        // for(int i=0;i<result.length;i++)
        // {
        //     System.out.print(result[i]+" ");
        // }
        System.out.println(maximumWealth(arr));
    }
    public static int maximumWealth(int [][]arr)
    {
        int row = arr.length;
        int col = arr[0].length;
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<row;i++)
        {
            int sum = 0;
            for(int j=0;j<col;j++)
            {
                sum = sum+arr[i][j];
                ans = Math.max(ans, sum);
            }
            
        }
        return ans;
    }
}
