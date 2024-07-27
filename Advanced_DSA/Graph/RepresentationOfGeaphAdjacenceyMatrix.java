package Advanced_DSA.Graph;

import java.util.ArrayList;

//Undirected Graph
public class RepresentationOfGeaphAdjacenceyMatrix {
    public static void main(String[] args) {
        int arr[][] = {{1, 2},{4, 1},{2, 4},{3, 4},{5, 2},{1, 3}};
        solve(arr, 5);
    }
    // Using list
    public static void solve(int B[][], int A)
    {
        ArrayList<ArrayList<Integer>> ar = new ArrayList<>();

        for(int i=0;i<A;i++)
        {
            ar.add(new ArrayList<>());
        }
        for(int i=0;i<A;i++)
        {
            int source = B[i][0]-1;
            int dest = B[i][1]-1;
            ar.get(source).add(dest);
            ar.get(dest).add(source);
        }
        printlist(ar);
    }
    public static void printlist(ArrayList<ArrayList<Integer>> ar)
    {
        for(int i=0;i<ar.size();i++)
        {
            for(int j=0;j<ar.get(i).size();j++)
            {
                System.out.print(ar.get(i).get(j)+1+ " ");
            }
            System.out.println();
        }
    }
    //----------Using two D array--------------//
    // public static int solve(int B[][], int A)
    // {
    //     int res[][] = new int[A][A];
    //     for(int i=0;i<B.length;i++)
    //     {
    //         int source = B[i][0]-1;
    //         int dest = B[i][1]-1;
    //         res[source][dest] = 1;
    //         res[dest][source] = 1;
    //     }
    //     printMatrix(res);
    //     return 0;
    // }
    // public static void printMatrix(int res[][])
    // {
    //     int n = res.length;
    //     int m = res[0].length;
    //     for(int i=0;i<n;i++)
    //     {
    //         for(int j=0;j<m;j++)
    //         {
    //             System.out.print(res[i][j]+" ");
    //         }
    //         System.out.println();
    //     }
    // }
}
