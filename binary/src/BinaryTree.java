public class BinaryTree {
	// Root of Binary Tree
	Node root;

	BinaryTree() {
		root = null;
	}

	String printPostorder(Node node) {
		// YOUR CODE HERE
		String str = new String();
		if (node != null) {
			str += printPostorder(node.left);
			str += printPostorder(node.right);

	//		System.out.print(node.key + " ");
			str += node.key + " ";
		}
		return str;
	}

	String printInorder(Node node) {
		// YOUR CODE HERE
		String str = new String();
		if (node != null) {
			str += printInorder(node.left);
		//	System.out.print(node.key + " ");
			str += node.key + " ";
			str += printInorder(node.right);
		}
		return str;

	}

	String printPreorder(Node node) {
		// YOUR CODE HERE
		String str = new String();
		if (node != null) {
		//	System.out.print(node.key + " ");
			str += node.key + " ";
			str += printPreorder(node.left);
			str += printPreorder(node.right);
		}
		return str;
	}

}
