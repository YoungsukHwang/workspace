
public class Node {
	public int data;
	public Node left;
	public Node right;
	int height;
	
	public Node(){
		data =0;
		height =0;
	}
	
	public Node(int n){
		data = n;
		height =0;
	}
	
	
	public int getData() {
		// TODO Auto-generated method stub
		return data;
	}

}
