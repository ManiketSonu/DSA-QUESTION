package Advanced_DSA.Graph;

public class PethInDirectedGraph {
    public static void main(String[] args) {
        // int arr[][] = {{1, 2},{4,1},{2,4},{3,4},{5,2},{1,3}};
        int arr[][] = {{1, 2},{2,3},{3,4},{4,5}};
        System.out.println(solve(5, arr));
    }
    public static int solve(int A, int B[][])
    {
        int res[][] = new int[A][A];
        for(int i=0;i<B.length;i++)
        {
            int source = B[i][0]-1;
            int dest = B[i][1]-1;
            res[source][dest] = 1;
        }

        for(int i=0;i<A;i++)
        {
            for(int j=0;j<A;j++)
            {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
        boolean[] visited = new boolean[A];
        if (hasPath(res, 0, A - 1, visited)) {
            return 1;
        } else {
            return 0;
        }
    }
    public static boolean hasPath(int[][] graph, int src, int dest, boolean[] visited) {
        if (src == dest) {
            return true;
        }
        visited[src] = true;
        for (int i = 0; i < graph.length; i++) {
            if (graph[src][i] == 1 && !visited[i]) {
                if (hasPath(graph, i, dest, visited)) {
                    return true;
                }
            }
        }
        return false;
    }
}
