
public class Edge {
	public Node end;
	public double weight;
	
	public Edge(Node end, double weight){
		this.end = end;
		this.weight = weight;
	}
	
	public void showEdge(){
		System.out.print(end.number+" weight: "+weight);
	}
}
