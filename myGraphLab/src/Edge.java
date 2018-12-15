
public class Edge {
	public Node start;
	public Node end;
	public double weight;
	public boolean explored;
	
	public Edge(Node start, Node end, double weight){
		this.start = start;
		this.end = end;
		this.weight = weight;
		this.explored=false;
	}
	
	public void showEdge(){
		System.out.print(start.number+"->"+end.number+" weight: "+weight+" Explored: "+explored+"\t");
	}
}
