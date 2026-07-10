package day5;

import java.util.*;

public class bipartiteGraph {
    public static boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        Arrays.fill(color, -1);
        for (int i = 0; i < n; i++) {
            if (color[i] != -1)
                continue;
            Queue<Integer> q = new LinkedList<>();
            q.offer(i);
            color[i] = 0;
            while (!q.isEmpty()) {
                int node = q.poll();
                for (int neighbour : graph[node]) {
                    if (color[neighbour] == -1) {
                        color[neighbour] = 1 - color[node];
                        q.offer(neighbour);

                    } else if (color[neighbour] == color[node]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] graph = {
                {1,3},
                {0,2},
                {1,3},
                {0,2}
        };
        System.out.println(isBipartite(graph));
    }
}
