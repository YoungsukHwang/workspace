//2010-12086 Hwang, Young suk
public class myDFS {

	public static void main(String[] args) {
		// implement graph and check the connectivity between nodes using a
		// standard DFS.

		// adjacency matrix input. (undirected)
		int[][] mat = new int[4][4];
		mat[0][0] = 0;mat[0][1] = 1;mat[0][2] = 1;mat[0][3] = 1;
		mat[1][0] = 1;mat[1][1] = 0;mat[1][2] = 0;mat[1][3] = 1;
		mat[2][0] = 1;mat[2][1] = 0;mat[2][2] = 0;mat[2][3] = 0;
		mat[3][0] = 1;mat[3][1] = 1;mat[3][2] = 0;mat[3][3] = 0;

		int sourceNode = 4;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++)
				System.out.print(mat[i][j] + " ");
			System.out.println();
		}

		Graph graph = new Graph(mat);
		depthFirstSearch(graph, sourceNode-1);
		
		boolean connectivity=true;
		System.out.print("The source node " + sourceNode + " is connected to: ");
		for(Node n : graph.nodes){
			if(n.visited==true)
				System.out.print((n.number+1)+" ");
			else
				connectivity=false;
		}
		
		if(connectivity)
			System.out.println("\nThe Graph is Connected");
		else
			System.out.println("\nThe Graph is Not Connected");
		
	}

	public static void depthFirstSearch(Graph graph, int sourceNode) {
		Node cur = graph.nodes.get(sourceNode);
		cur.visited = true;
		for (Edge e : cur.connections) {
			if (e.explored == false)
				if (e.end.visited == false) {
					e.explored = true;  //Set the edge explored
					for(Edge edge : graph.nodes.get(e.end.number).connections) 	// Set the other-way explored too.
						if(edge.end.number == cur.number) 
							edge.explored=true;
					// DFS
					depthFirstSearch(graph, e.end.number);
				}
		}
	}

}
