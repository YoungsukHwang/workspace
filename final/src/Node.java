
public class Node {
	char data;
	Node left;
	Node right;

	public Node(String elem) {
		data = elem.charAt(0);
	}

	public Node() {
		
	}

	public char getData() {
		return data;
	}

	public void setData(char data) {
		this.data = data;
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

	public Node MakeBinaryTree(Expression exp) {
		String elem = exp.giveCurrent(exp.getCur());
		exp.increment();

		if (elem.matches("[A-Z]")) {
			return new Node(elem);
		} else { // operator input
			Node op = new Node(elem);
			op.left = MakeBinaryTree(exp);
			op.right = MakeBinaryTree(exp);
			return op;
		}
	}

}