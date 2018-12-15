import java.util.ArrayList;

public class Graph {

	ArrayList<Node> nodes;

	public Graph(int[][] mat) {
		nodes = new ArrayList<>();
		int n = mat.length;
		for(int i=0; i<n; i++)
			nodes.add(new Node(i));

		for(int i=0; i<n; i++)
			for(int j=0; j<n; j++)
				if(mat[i][j] !=0)
					nodes.get(i).connections.add( new Edge(nodes.get(i), nodes.get(j), mat[i][j]) ) ;
	}
	
	public void showNodes(){
		for(int i=0; i<nodes.size();i++){
			System.out.print("Node "+(i+1));
			System.out.print(" Visited "+nodes.get(i).visited +" Edges:");
			for(Edge e : nodes.get(i).connections)
				e.showEdge();
			System.out.println();
		}
	}
}
