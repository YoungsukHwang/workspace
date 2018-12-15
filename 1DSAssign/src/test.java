import java.util.ArrayList;

public class test {
	
	String a;
	int b;
	
	public test(){
		b= 123;
		a= "Test Test ...";
		System.out.println("Test is constructed: "+a );
	}

	public String canDoIt(){
		a = "You can do it";
		return a;
	}
	
	 //	ArrayList containing strings.
	ArrayList<String> list = new ArrayList<String>();  
	//	An array containing String
	String[] list2 = new String[10];
	Node[] nodes = new Node[10];
	
}
