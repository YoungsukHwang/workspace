import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GraphAdjacency {
	public static void main(String[] args) throws FileNotFoundException {
		// File file = new File("src/dir.txt"); // for eclipse
		File file = new File("dir.txt"); //for run on terminal.
		Scanner sc = new Scanner(file);
		
		String first = sc.nextLine();
		int V = Integer.parseInt(first.substring(0, 1));
		int E = Integer.parseInt(first.substring(2, 3));
		int directed = Integer.parseInt(first.substring(4,5));
		
		ArrayList<Node> nodes = new ArrayList<>();
		ArrayList<Edge> edges = new ArrayList<>();
		
		Graph graph = new Graph(nodes, edges);
		
		while(sc.hasNext()){
			String l = sc.nextLine();
			int from = Integer.parseInt(l.substring(0,1));
			int dest =  Integer.parseInt(l.substring(2,3));
			int weight =  Integer.parseInt(l.substring(4,5));
			edges.add(new Edge(from, dest, weight));
		}
		
		

	}
	
	//toAdjacencyMatrixt()
	//toAdjacencyList()

}
