public class myLab {

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		String preorder = tree.printPreorder(tree.root);
		assert preorder.equalsIgnoreCase("1 2 4 5 3 ") : "Wrong Result";
		String Inorder = tree.printInorder(tree.root);
		assert Inorder.equalsIgnoreCase("4 2 5 1 3 ") : "Wrong Result";
		String postorder = tree.printPostorder(tree.root);
		assert postorder.equalsIgnoreCase("4 5 2 3 1 ") : "Wrong Result";
		int a=1;
		assert a==2 : "Wrong Result";
		System.out.println("Passed");
	}
	
}