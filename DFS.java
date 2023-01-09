import java.io.*;
import java.util.*;
public class DFS{
    private int Vertices; 
    private LinkedList<Integer> adj[];
    @SuppressWarnings("unchecked") DFS(int v){
     Vertices = v;
     adj = new LinkedList[v];
     for (int i = 0; i < v; ++i)
        adj[i] = new LinkedList();
    }
    void addEdge(int v, int w){
        adj[v].add(w); 
    }
