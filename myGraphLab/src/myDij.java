//2010-12086 Hwang, Youngsuk
public class myDij {
	
	public static void main(String[] args) {
		System.out.println("Dij input adj-matrix");
		// adjacency matrix input. (undirected)
		int[][] mat = new int[5][5];
		mat[0][0] = 0;mat[0][1] = 7;mat[0][2] = 0;mat[0][3] = 0;mat[0][4] = 2;
		mat[1][0] = 0;mat[1][1] = 0;mat[1][2] = 1;mat[1][3] = 0;mat[1][4] = 2;
		mat[2][0] = 0;mat[2][1] = 0;mat[2][2] = 0;mat[2][3] = 4;mat[2][4] = 0;
		mat[3][0] = 0;mat[3][1] = 0;mat[3][2] = 5;mat[3][3] = 0;mat[3][4] = 0;
		mat[4][0] = 0;mat[4][1] = 3;mat[4][2] = 8;mat[4][3] = 5;mat[4][4] = 0;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++)
				System.out.print(mat[i][j] + " ");
			System.out.println();
		}
		int sourceNode = 1;
		
		Graph graph = new Graph(mat);
		System.out.println("The Shorted Path to all nodes are");
		SSSP(graph, sourceNode-1);
		
	}

	private static void SSSP(Graph graph, int sourceNode) {

		int V =graph.nodes.size();
		int[] d = new int[V]; 
		int[] p = new int[V];
		boolean sptSet[] = new boolean[V];
		for(int i=0;i<V;i++){
			d[i]= Integer.MAX_VALUE;
			sptSet[i]=false;
		}
		
		d[sourceNode]=0;
		
		for(int count=0; count<V-1; count++){
			int u = minD(d, sptSet);
			sptSet[u]= true;
			
			for(int v=0; v<V;v++){
				double link=0;
				for(Edge e : graph.nodes.get(u).connections)//find cost of u->v
					if(e.end.number==v)
						link= e.weight;
				
				if(sptSet[v]==false && d[u] != Integer.MAX_VALUE && link!=0 && d[u]+link<d[v])
					d[v] = d[u]+ (int)link;
			}
		}
		
		for(int i=0; i<V; i++)
			System.out.println((sourceNode+1)+" to "+(i+1)+" is "+ d[i]);
	}
	
	public static int minD(int[] d, boolean[] sptSet){
		int min = Integer.MAX_VALUE;
		int min_index = -1;
		for(int i=0; i<d.length;i++)
			if(sptSet[i]==false && d[i] <= min){
				min = d[i];
				min_index= i;
			}
		return min_index;
	}
	
}
