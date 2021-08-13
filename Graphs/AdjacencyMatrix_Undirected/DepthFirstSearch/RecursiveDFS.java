package Graphs.AdjacencyMatrix_Undirected.DepthFirstSearch;

import java.util.LinkedList;
import java.util.Stack;

public class RecursiveDFS {
    private LinkedList<Integer>[] adj;
    private int V; // vertices
    private int E; // edges

    public RecursiveDFS(int nodes) {
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

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(V + " vertices " + E + " Edges  \n");
        for (int i = 0; i < V; i++) {
            sb.append(i + ": ");
            for (int j : adj[i]) {
                sb.append(j + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public void ItrDFS(int s) {
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        stack.push(s);

        while (!stack.isEmpty()) {
            int u = stack.pop();
            if (!visited[u]) {
                visited[u] = true;
                System.out.print(u + " ");
                for (int v : adj[u]) {
                    if (!visited[v]) {
                        stack.push(v);
                    }
                }
            }
        }
    }

    public void RecDFS(int s) {
        boolean[] visited = new boolean[V];
        for (int v = 0; v < V; v++) {
            if (!visited[v]) {
                dfs(v, visited);
            }
        }
    }

    public void dfs(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");
        for (int w : adj[v]) {
            if (!visited[w]) {
                dfs(w, visited);
            }
        }
    }

    public static void main(String[] args) {
        RecursiveDFS idfs = new RecursiveDFS(5);
        idfs.addEdge(0, 1);
        idfs.addEdge(1, 2);
        idfs.addEdge(2, 3);
        idfs.addEdge(3, 0);
        idfs.addEdge(2, 4);


        idfs.RecDFS(0);

    }
}
