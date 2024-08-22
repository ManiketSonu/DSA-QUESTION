package Interview.MountBlue;

public class PrintPattern {
    public static void main(String[] args) {
        int n = 2;
        int result[][] = solve(n);
        for(int i=0;i<result.length;i++)
        {
            for(int j=0;j<result[i].length;j++)
            {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] solve(int n)
    {
        int len = 2*n-1;
        int result[][] = new int[len][len];
        int start = 0;
        int end = len-1;
        while(n>0)
        {
            for(int i = start; i <= end; i++)
            {
                for(int j = end; j>=start; j--)
                {
                    if(i==start || i==end || j==start || j==end)
                    {
                        result[i][j] = n;
                    }
                }
            }
            start++;
            end--;
            n--;
        }
        return result;
    }
}
