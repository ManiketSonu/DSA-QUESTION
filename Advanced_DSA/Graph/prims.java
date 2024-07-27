package Advanced_DSA.Graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class prims {
    public static void main(String[] args) {
        int B[][] = {{1,2,1},{2,3,4},{1,4,3},{4,3,2},{1,3,10}};
        int A = 4;

        //for kruskal
        // ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        // for(int edge[] : B)
        // {
        //     ArrayList<Integer> e = new ArrayList<>();
        //     for(int val:edge)
        //     {
        //         e.add(val);
        //     }
        //     edges.add(e);
        // }
        // System.out.println(solve(A, edges));

        //for prims
        ArrayList<ArrayList<Pair>> graph = new ArrayList<>();
        for(int i=0;i<=A;i++)
        {
            graph.add(new ArrayList<>());
        }

        for(int i=0;i<B.length;i++)
        {
            int u = B[i][0];
            int v = B[i][1];
            int w = B[i][2];

            graph.get(u).add(new Pair(v, w));
            graph.get(v).add(new Pair(v, w));
        }
        System.out.println(solve1(A, graph));
    }
    //prims Algo
    public static int solve1(int A, ArrayList<ArrayList<Pair>> B)
    {
        boolean visited[] = new boolean[A+1];
        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.weight));

        pq.add(new Pair(1, 0));
        int cost = 0;

        while(!pq.isEmpty())
        {
            Pair current = pq.poll();
            if(visited[current.vertex])
            {
                continue;
            }

            cost = cost+current.weight;
            visited[current.vertex] = true;

            for(int i=0;i<B.get(current.vertex).size();i++)
            {
                Pair edge = B.get(current.vertex).get(i);
                if(!visited[edge.vertex])
                {
                    pq.add(edge);
                }
            }
        }
        return cost;
    }
    //Kruskal Algo
    public static int solve(int A, ArrayList<ArrayList<Integer>> B)
    {
        Collections.sort(B, (a,b) -> a.get(2)-b.get(2));
        int cost = 0;

        int parent[] = new int[A+1];
        for(int i=0;i<A+1;i++)
        {
            parent[i] = i;
        }

        for(int i=0;i<B.size();i++)
        {
            int root1 = findRoot(parent, B.get(i).get(0));
            int root2 = findRoot(parent, B.get(i).get(1));

            if(root1!=root2)
            {
                parent[root1] = root2;
                cost = cost+B.get(i).get(2);
            }
        }
        return cost;
    }

    public static int findRoot(int parent[], int n)
    {
        if(parent[n]==n)
        {
            return n;
        }
        return parent[n]=findRoot(parent, parent[n]);
    }
}
class Pair
{
    int vertex;
    int weight;
    Pair(int vertex, int weight)
    {
        this.vertex = vertex;
        this.weight = weight;
    }
}