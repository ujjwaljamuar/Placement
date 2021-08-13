package Graphs.AdjacencyMatrix_Undirected.BreadthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
    private LinkedList<Integer>[] adj;
    private int V; // vertices
    private int E; // edges

    public BreadthFirstSearch(int nodes) {
        this.V = nodes;
        this.E = 0;
        this.adj = new LinkedList[nodes];
        for (int v = 0; v < V; v++) {
            adj[v] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
        E++;
    }

    public void bfs(int s) {                 // source
        boolean[] visited = new boolean[V];

        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.offer(s);

        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + " ");

            for (int v : adj[u]) {
                if (!visited[v]) {
                    visited[v] = true;
                    q.offer(v);
                }
            }
        }
    }

    public static void main(String[] args) {
        BreadthFirstSearch bf = new BreadthFirstSearch(5);
        bf.addEdge(0, 1);
        bf.addEdge(1, 2);
        bf.addEdge(2, 3);
        bf.addEdge(3, 0);
        bf.addEdge(2, 4);
        bf.bfs(0);
    }
}
