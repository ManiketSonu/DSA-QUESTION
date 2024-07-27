package Advanced_DSA.Graph;

import java.util.ArrayList;

public class CkeckCycleInDirectedGraph {
    public static void main(String[] args) {
        int arr[][] = {{1, 2},{4,1},{2,4},{3,4},{5,2},{1,3}};
        System.out.println(solev(arr, 5));
    }
    public static int solev(int B[][], int A)
    {
        ArrayList<ArrayList<Integer>> ar = new ArrayList<>();
        for(int i=0;i<A;i++)
        {
            ar.add(new ArrayList<>());
        }
        for(int i=0;i<B.length;i++)
        {
            int source = B[i][0]-1;
            int dest = B[i][1]-1;
            ar.get(source).add(dest);
        }
        boolean isVisited[] = new boolean[A];
        boolean inStack[] = new boolean[A];

        for(int i=0;i<A;i++)
        {
            if(hasCycle(ar,i,isVisited, inStack))
            {
                return 1;
            }
        }
        return 0;
    }
    public static boolean hasCycle(ArrayList<ArrayList<Integer>> ar, int vertex, boolean isVisited[], boolean inStack[])
    {
        if(inStack[vertex])
        {
            return true;
        }
        if(isVisited[vertex])
        {
            return true;
        }
        isVisited[vertex] = true;
        inStack[vertex] = true;
        ArrayList<Integer> neighbour = ar.get(vertex);
        for(int i=0;i<neighbour.size();i++)
        {
            int neb = neighbour.get(i);
            if(hasCycle(ar, neb, isVisited, inStack))
            {
                return true;
            }
        }
        inStack[vertex] = false;
        return false;
    }
}
