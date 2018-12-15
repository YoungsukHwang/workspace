import java.util.LinkedList;

public class Node {
	private int x;
	public LinkedList<Edge> links;
	
	
	public Node(int x){
		this.x =x;
		this.links = new LinkedList<>();
	}
	

}
