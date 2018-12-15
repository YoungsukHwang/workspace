import java.util.HashMap;

public class MYhuffman {

	public static void main(String[] args) {
		System.out.println("Hwang Youngsuk 2010-12086");
	
		// Compute the character frequencies
		String str = "ABCABDECDADBBADGBFGH";
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i=0; i<str.length(); i++){
			char c = str.charAt(i);
			Integer val = map.get(c);
			if(val !=null)
				map.put(c, new Integer(val+1));
			else
				map.put(c, 1);
		}
		System.out.println(map.toString());
		
		// Insert the frequencies into a min-heap
		MinHeap hp = new MinHeap(100);
		for(Character cs : map.keySet()){
			hp.insert( new Node(cs, map.get(cs)) );
		}
		
		// Repeat: Delete the two minimum elements, f1 and f2 from the heap -> Insert f1+f2 into the heap
		Node root = null;
		while(hp.getSize()>1){
			Node n1 = hp.delMin();
			Node n2 = hp.delMin();
			
			Node n3 = new Node('-', n1.getFreq()+n2.getFreq());
			n3.setLeft(n1);
			n3.setRight(n2);
			
			root = n3;
			hp.insert(n3);
		}
		// Print huffman tree. SYMBOL FREQ CODE
		printCode(root, "");
	}
	
	public static void printCode(Node root, String s){
		if(root.getLeft()==null && root.getRight()==null && Character.isLetter(root.getC())){
			System.out.println(root.getC()+":"+s);
			return;
		}
		printCode(root.left, s + "0");
		printCode(root.right,s + "1");
			
	}
	
}
