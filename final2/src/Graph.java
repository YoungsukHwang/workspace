import java.util.ArrayList;

public class Graph {
	public ArrayList<Node> nodes;
	public ArrayList<Edge> edges;
	
	public Graph(){
		
	}
	
	public Graph(ArrayList<Node> nodes2, ArrayList<Edge> edges2) {
		// TODO Auto-generated constructor stub
		nodes = nodes2;
		edges = edges2;
	}

	public void addNode(Node n){
		nodes.add(n);
	}
	public void addEdge(Edge e){
		edges.add(e);
	}
	

}
