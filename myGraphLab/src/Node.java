import java.util.ArrayList;
import java.util.List;

public class Node {
	public int number;
	public List<Edge> connections;
	public boolean visited;
	
	public Node(int i){
		number = i;
		connections = new ArrayList<>();
		visited=false;
	}
}
