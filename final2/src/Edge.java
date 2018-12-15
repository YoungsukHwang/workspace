
public class Edge {
	public int from;
	public int dest;
	public int weight;
	
	public Node edgeFrom;
	
	public Edge(int From, int destination, int d) {
		this.from = From;
		this.dest = destination;
		this.weight = d;
	}
	
	public Edge(int destination, int d) {
		this.dest = destination;
		this.weight = d;
	}

	public double getWeight() {
		return weight;
	}

	public void setEdgeFrom(Node from) {
		this.edgeFrom = from;
	}
	

}
