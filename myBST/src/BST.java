public class BST {
	Node root;

	// BST with unique keys.
	public BST() {

	}

	public Node get(int i) {

		Node result = new Node();

		if (this.root == null) {
			System.out.println("No such Node");
			return null;
		}

		if (this.root.data == i) {
			return root;
		} else if (i < this.root.data) {
			BST left = new BST();
			left.root = this.root.left;
			result = left.get(i);
		} else if (i > this.root.data) {
			BST right = new BST();
			right.root = this.root.right;
			result = right.get(i);
		}

		return result;

	}

	public void insert(int i) { // Question: dealing with object thing.
								// reference of BST.
		if (root == null)
			root = new Node(i);

		if (i < root.data && root.left == null)
			root.left = new Node(i);

		if (i > root.data && root.right == null)
			root.right = new Node(i);

		if (i < root.data) {
			BST left = new BST();
			left.root = this.root.left;
			left.insert(i);
		} else if (i > root.data) {
			BST right = new BST();
			right.root = this.root.right;
			right.insert(i);
		}

	}

	public void deleteKey(int i) {
		// TODO Auto-generated method stub
		// if the node to be deleted is a leaf (no children) -> cut the parent;
		// if the node has one child (degree 1 node) -> link the grandparent and
		// the child
		// if the node has two children (degree 2 node) -> Replace with largest
		// key in left subtree (or smallest in right subtree).
		root = delete(root, i);
	}

	public Node delete(Node root, int i) {
		if (root == null)
			return root;

		if (i < root.data)
			root.left = delete(root.left, i);
		else if (i > root.data)
			root.right = delete(root.right, i);
		else { // you hit!
			if (root.left == null) 
				//if root.right also null -> returning null so that this returning node can be null above.
				return root.right;
			else if (root.right == null)
				//if left is no null, this has 1 left child and the parent will set it as his child.
				return root.left;
			
			//this case is where the to-be-deleted node have both left and right subtree.
			root.data = minValue(root.right); // set its value as min of right subtree.
			root.right = delete(root.right, root.data); // delete the min value inthe right subtree.
		}

		return root;
	}

	private int minValue(Node root) { // find the min of the right subtree
		int min = root.data;
		while(root.left != null){
			min = root.left.data;
			root = root.left;
		}
		return min;
	}

	public void inorder() { // ascend()
		// Use inorder traversal for printing the output.
		BST left = new BST();
		BST right = new BST();
		left.root = this.root.left;
		right.root = this.root.right;

		if (left.root != null)
			left.inorder();
		System.out.print(root.data + " ");
		if (right.root != null)
			right.inorder();

	}

}
