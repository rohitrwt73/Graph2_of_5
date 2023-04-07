import java.util.*;
public class KahnsAlgo {
    //topsort using bfs
    static class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
       } 
       static void createGraph(ArrayList<Edge>graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        //directed acyclic graph
        graph[2].add(new Edge(2,3)); 
        graph[3].add(new Edge(3,1));
        graph[4].add(new Edge(4,0)); 
        graph[4].add(new Edge(4,1)); 
        graph[5].add(new Edge(5,2));
        graph[5].add(new Edge(5,0));
    }




    public static void main(String[] args) {
        int V=6;
        ArrayList<Edge>[]graph=new ArrayList[V];
        createGraph(graph);
        topSort(graph);
    }
}
