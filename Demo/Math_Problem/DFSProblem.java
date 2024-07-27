package Demo.Math_Problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class DFSProblem {
    static HashMap<Integer, List<Integer>> graph;
    static HashSet<List<Integer>> distances;
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        graph = new HashMap<>();
        distances = new HashSet<>();
        for (int i = 0; i < n - 1; i++) 
        {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            addEdge(u, v);
        }
        for (int i = 1; i <= n; i++) 
        {
            boolean[] visited = new boolean[n + 1];
            List<Integer> dist = new ArrayList<>();
            dfs(i, 0, visited, dist);
            Collections.sort(dist);
            distances.add(dist);
        }
        System.out.println(distances.size());
    }
    static void addEdge(int u, int v) 
    {
        graph.putIfAbsent(u, new ArrayList<>());
        graph.putIfAbsent(v, new ArrayList<>());
        graph.get(u).add(v);
        graph.get(v).add(u);
    }
    static void dfs(int u, int dist, boolean[] visited, List<Integer> distancesFromU) 
    {
        visited[u] = true;
        distancesFromU.add(dist);
        for (int v : graph.getOrDefault(u, new ArrayList<>())) 
        {
            if (!visited[v]) 
            {
                dfs(v, dist + 1, visited, distancesFromU);
            }
        }
    }
}
