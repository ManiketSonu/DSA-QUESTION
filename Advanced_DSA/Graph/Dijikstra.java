package Advanced_DSA.Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Dijikstra {
    public static void main(String[] args) {
        int A = 5;
        int B[][] = {{0, 3, 4},{0, 1, 9},{3, 4, 10},{1, 3, 8}};
        int C = 4;

        int res[] = solve(A, B, C);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
    public static int[] solve(int A, int B[][], int C)
    {
        ArrayList<ArrayList<Pair>> graph = new ArrayList<>();
        for(int i=0;i<A;i++)
        {
            graph.add(new ArrayList<>());
        }

        for(int i=0;i<B.length;i++)
        {
            int src = B[i][0];
            int dest = B[i][1];
            int weight = B[i][2];
            graph.get(src).add(new Pair(dest, weight));
            graph.get(dest).add(new Pair(src, weight));
        }

        int distance[] = new int[A];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[C] = 0;

        PriorityQueue<Pair> minHeap = new PriorityQueue<>(Comparator.comparingInt(pair->pair.weight));

        minHeap.add(new Pair(C, 0));

        while(!minHeap.isEmpty())
        {
            Pair currentNode = minHeap.poll();
            for(Pair nghbr:graph.get(currentNode.vertex))
            {
                int newDistance = distance[currentNode.vertex]+nghbr.weight;

                if(newDistance<distance[nghbr.vertex])
                {
                    distance[nghbr.vertex] = newDistance;
                    minHeap.add(new Pair(nghbr.vertex, newDistance));
                }
            }
        }

        for(int i=0;i<A;i++)
        {
            if(distance[i]==Integer.MAX_VALUE)
            {
                distance[i] = -1;
            }
        }
        return distance;
    }
}
class Pair{
    int vertex;
    int weight;
    Pair(int vertex, int weight)
    {
        this.vertex = vertex;
        this.weight = weight;
    }
}
