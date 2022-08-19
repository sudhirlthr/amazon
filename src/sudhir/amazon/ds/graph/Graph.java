package sudhir.amazon.ds.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
    private final int vertices;
    private LinkedList adjancancyList[];

    public Graph(int v) {
        this.vertices = v;
        this.adjancancyList = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adjancancyList[i] = new LinkedList();
        }
    }
    public void addEdge(int from, int to){
        adjancancyList[from].add(to);
    }

    public boolean isPathBetweenSourceandDestination(int s, int d){
        LinkedList queue = new LinkedList<>();
        boolean visited[] =  new boolean[vertices];

        queue.add(s);
        visited[s] = true;

        Iterator<Integer> neighbour;
        while (queue.size() != 0){
            s = (int) queue.poll();
            neighbour = adjancancyList[s].listIterator();
            int n;
            while (neighbour.hasNext()){
                n = neighbour.next();
                if (n == d) return true;
                if(!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
        return  false;

    }
}
