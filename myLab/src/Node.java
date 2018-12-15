public class Node {
	int freq;
	char c;
	Node left;
	Node right;
	
	public Node(){
		
	}
	
	public Node(Character cs, Integer integer) {
		this.c = cs;
		this.freq = integer;
	}

	public int getFreq() {
		return freq;
	}

	public char getC() {
		return c;
	}

	public void setC(char c) {
		this.c = c;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public void setFreq(int freq) {
		this.freq = freq;
	}
	
}
