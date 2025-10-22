package Graph;

import java.util.*;

public class GraphClient {
    public static void main(String[] args) {
        Graph g = new Graph(7);
        g.AddEdge(1, 4, 6);
        g.AddEdge(1, 2, 10);
        g.AddEdge(2, 3, 7);
        g.AddEdge(3, 4, 5);
        g.AddEdge(4, 5, 1);
        g.AddEdge(5, 6, 4);
        g.AddEdge(7, 5, 2);
        g.AddEdge(6, 7, 3);
        g.Display();
        // System.out.println("****************************");
        // g.removevertex(4);
        // g.Display();
        System.out.println(g.haspath(1, 6, new HashSet<Integer>()));
        g.PrintAllPath(1, 6, new HashSet<>(), "");

        System.out.println("***************");
        Graph2 g1 = new Graph2(7);
        g1.AddEdge(1, 4, 6);
        g1.AddEdge(1, 2, 10);
        g1.AddEdge(2, 3, 7);
        g1.AddEdge(3, 4, 5);
        g1.AddEdge(4, 5, 1);
        g1.AddEdge(5, 6, 4);
        g1.AddEdge(7, 5, 2);
        g1.AddEdge(6, 7, 3);
        System.out.println(g1.BFS(1,6));
        System.out.println(g1.DFS(1,6));
        g1.BFT();
        g1.DFT();
    }
}

