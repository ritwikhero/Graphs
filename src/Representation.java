import java.util.ArrayList;

public class Representation {
    public static void main(String[] args) {
        int V = 5;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
            addEdge(adj,0,1);
            addEdge(adj,0,4);
            addEdge(adj,1,2);
            addEdge(adj,1,3);
            addEdge(adj,2,3);
            addEdge(adj,3,4);

            printGraph(adj);

    }

    public static void addEdge(ArrayList<ArrayList<Integer>> adj,int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public static void printGraph(ArrayList<ArrayList<Integer>> adj){
        for(int i = 0; i < adj.size(); i++){
            System.out.println("Adjacency List of vertex " + i);
            System.out.println("head");
            for(int j = 0; j < adj.get(i).size(); j++){
                System.out.println("-->" + adj.get(i).get(j));
            }
        }
    }
}