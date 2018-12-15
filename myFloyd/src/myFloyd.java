//2010-12086 Hwang, Young suk.
import java.util.Scanner;

public class myFloyd {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number of vertices");
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		int[][] mat = new int[n][n];
		System.out.println("Enter the Weighted Matrix for the graph");  // input one row by row with numbers separated by a whitespace.
		for(int i=0; i<n; i++){
			String[] numbers = sc.nextLine().split(" ");
			for(int j=0; j<n; j++)
				mat[i][j] = Integer.parseInt(numbers[j]);}
		
		System.out.println("This is the input adjacency cost matrix.");
		printMatrix(mat);
		
		//Floyd algorithm
		System.out.println("Floyd algorithm Processing...");
		printMatrix(floyd(mat));
		
		System.out.println("---The end of the program.---");
	}

	private static int[][] floyd(int[][] mat) {
		int n = mat.length;
		int[][] c = mat.clone();
		
		for(int i=0; i<n; i++)
			for(int j=0; j<n; j++)
				if(c[i][j]==0 && i!=j)
					c[i][j]=999;
		
		int[][] kay = new int[n][n];
		
		for(int k=0; k<n; k++)
			for(int i=0; i<n; i++)
				for(int j=0; j<n; j++){
					if(c[i][j] > c[i][k]+c[k][j])
						kay[i][j] = k+1; 
					c[i][j] = giveMin(c[i][j], c[i][k]+c[k][j]);
				}

		System.out.println("The kay matrix");
		printMatrix(kay);
		int a=1, b=6; // node number
		System.out.print("The outputPath from "+a+" to "+b+" is\n"+a+" ");
		outputPath(a, b, kay);
		System.out.println();
		
		return c;
	}

	private static void outputPath(int i, int j, int[][] kay) {
		if(i==j) return;
		if(kay[i-1][j-1]==0)
			System.out.print(j+" ");
		else{
			outputPath(i, kay[i-1][j-1], kay);
			outputPath(kay[i-1][j-1], j, kay);
		}
	}

	private static void printMatrix(int[][] c) {
		int n = c.length;
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++)
				System.out.print(c[i][j]+"\t");
			System.out.println();
		}
	}

	private static int giveMin(int a, int b){
		if(a>b)	return b;
		else return a;
	}
	
}
