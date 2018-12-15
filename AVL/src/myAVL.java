import java.util.ArrayList;

public class myAVL {
	public Node root;

	public myAVL() {
		root = null;
	}

	public myAVL(Node root) {
		this.root = root;
	}

	public void insert(int data) {
		root = insert(data, root);
	}

	private Node insert(int data, Node t) {
		if (t == null)
			t = new Node(data);

		else if (data < t.data) {
			t.left = insert(data, t.left);
			if (height(t.left) - height(t.right) == 2) {
				if (data < t.left.data)
					t = rotateLL(t);
				else
					t = rotateLR(t);
			}
		} else if (data > t.data) {
			t.right = insert(data, t.right);
			if (height(t.left) - height(t.right) == -2) {
				if (data < t.right.data)
					t = rotateRL(t);
				else
					t = rotateRR(t);
			}

		} else // Duplicate. do nothing
			;

		t.height = max(height(t.left), height(t.right));
		return t;
	}

	public int height(Node n) {
		return n == null ? -1 : n.height;
	}

	private int max(int l, int r) {
		return l > r ? l : r;
	}

	// AVL Tree is a type of balanced binary search tree

	private Node rotateLL(Node n) { // LL
		Node x = n.left;

		n.left = x.right;
		x.right = n;

		n.height = max(height(n.left), height(n.right)) + 1;
		x.height = max(height(x.left), n.height) + 1;
		return x;
	}

	private Node rotateRR(Node n) { // RR
		Node x = n.right;
		n.right = x.left;
		x.left = n;
		return x;
	}

	private Node rotateLR(Node n) {
		n.left = rotateRR(n.left);
		return rotateLL(n);
	}

	private Node rotateRL(Node n) {
		n.right = rotateLL(n.right);
		return rotateRR(n);
	}

	private void inorder(ArrayList<Node> list) {
		myAVL left = new myAVL();
		myAVL right = new myAVL();
		left.root = this.root.left;
		right.root = this.root.right;

		if (left.root != null)
			left.inorder(list);
		list.add(root);
		if (right.root != null)
			right.inorder(list);
	}

}
