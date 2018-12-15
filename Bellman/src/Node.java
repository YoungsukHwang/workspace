import java.util.ArrayList;
import java.util.List;

public class Node {
	public int number;
	public List<Edge> links;
	
	public Node(int i){
		number = i;
		links = new ArrayList<>();
	}
}
