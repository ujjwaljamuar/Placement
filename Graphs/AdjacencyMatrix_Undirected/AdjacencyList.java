package Graphs.AdjacencyMatrix_Undirected;

import java.util.LinkedList;

public class AdjacencyList {

    private LinkedList<Integer>[] adj;
    private int V; // vertices
    private int E; // edges

    public AdjacencyList(int nodes) {
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

    public static void main(String[] args) {
        AdjacencyList al = new AdjacencyList(4);
        al.addEdge(0, 1);
        al.addEdge(1, 2);
        al.addEdge(2, 3);
        al.addEdge(3, 0);

        System.out.println(al);

    }
}
