import java.util.ArrayList;
import java.util.Stack;

public class d {
	public static void main(String args[]) {
		BinaryTree tree = new BinaryTree();

		// Let us create trees shown in above diagram
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);

		ArrayList<Integer> mylist = tree.postOrderIterative(tree.root);

		System.out.println("Post order traversal of binary tree is :");
		System.out.println(mylist);
	}
}

// A binary tree node
class Node {
	int data;
	Node left, right;

	Node(int item) {
		data = item;
		left = right;
	}
}

class BinaryTree{ 
    Node root;
    ArrayList<Integer> list = new ArrayList<Integer>(); 
   
    ArrayList<Integer> postOrderIterative(Node node)  
    { 
     // YOUR CODE HERE
        Stack<Node> s = new Stack<>();
        s.push(node);
        
        Node bef = null;
        while( !s.empty()){   
            Node rt = s.peek();
            
            if(bef==null|| bef.left==rt || bef.right==rt){
                if(rt.left !=null)
                    s.push(rt.left);
                else if(rt.right!=null)
                    s.push(rt.right);
                else{
                    s.pop();
                    list.add(rt.data);
                }
            }else if(rt.left==bef){
                if(rt.right!=null)
                    s.push(rt.right);
                else{
                    s.pop();
                    list.add(rt.data);
                }
            }else if(rt.right==bef){
                s.pop();
                list.add(rt.data);
            }
            
            bef = rt;
        }
        
        return list;
    }
}
