import java.util.Iterator;


public class myBellman {
	public static void main(String[] args) {
		System.out.println("Bellman-ford input adj-matrix");
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
	}

	
	
	
	

//	private static void SSSPN(Graph graph, int s) {
//		// TODO Auto-generated method stub
//		int n = graph.nodes.size();
//		ArrayList<Integer> list1 = new ArrayList<>();
//		ArrayList<Integer> list2 = new ArrayList<>();
//		
//		boolean [] inList2 = new boolean[n+1];
//		int[] p = new int[n];
//		int[] d = new int[n];
//		for(int i=0; i<=n; i++)
//			p[i]=0;
//		d[s]=0;
//		p[s]=s;
//		
//		list1.add(0, new Integer(s));
//		for(int k=1; k<n; k++){
//			if(list1.isEmpty())
//				break;
//			
//			Iterator<Integer> iter =list1.iterator();
//			while(iter.hasNext()){
//				int u = ((Integer) iter.next()).intValue();
//				
//				for(Edge e: graph.nodes.get(u).links)
//					if( < )
//					{
//						d[] = ;
//						p[] = ;
//					}
//				
//				
//			}
//		}
//		
}