package Graphs.AdjacencyMatrix_Undirected.DepthFirstSearch;

import java.util.LinkedList;
import java.util.Stack;

public class IterativeDFS {
    private LinkedList<Integer>[] adj;
    private int V; // vertices
    private int E; // edges

    public IterativeDFS(int nodes) {
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

    public void ItrDFS(int s){
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

    public static void main(String[] args) {
        IterativeDFS dfs = new IterativeDFS(5);
        dfs.addEdge(0, 1);
        dfs.addEdge(1, 2);
        dfs.addEdge(2, 3);
        dfs.addEdge(3, 0);
        dfs.addEdge(2, 4);

        dfs.ItrDFS(0);

    }
}
