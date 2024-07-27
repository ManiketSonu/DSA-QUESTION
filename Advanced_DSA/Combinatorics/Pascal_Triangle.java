package Advanced_DSA.Combinatorics;

import java.util.ArrayList;
import java.util.List;
public class Pascal_Triangle {
    public static void main(String[] args) {
        // int n = 7;
        // int res[][] = Pascalbhai(n);
        // for(int i=0;i<res.length;i++)
        // {
        //     for(int j=0;j<res[0].length;j++)
        //     {
        //         System.out.print(res[i][j]+" ");
        //     }
        //     System.out.println();
        // }
    }
    // public static int[][] Pascalbhai(int n)
    // {
    //     int mat[][] = new int[n][n];
    //     for(int i=0;i<n;i++)
    //     {
    //         mat[i][0] = 1;
    //         mat[i][i] = 1;
    //         for(int j=1;j<i;j++)
    //         {
    //             mat[i][j] = mat[i-1][j]+mat[i-1][j-1];
    //         } 
    //     }
    //     return mat;
    // }
    public static List<List<Integer>> Pascal(int n)
    {
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0||j==i)
                {
                    row.add(1);
                }
                else
                {
                    row.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
                }
            }
            result.add(row);
        }
        return result;
    }
}
