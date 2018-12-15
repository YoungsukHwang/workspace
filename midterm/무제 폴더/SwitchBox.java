import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class SwitchBox {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//input.txt   just 8 switches
		File file = new File("input.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));

		int [] net = new int[8];
		String st;
		while ( (st=br.readLine()) != null) {
			String first= new String(st.substring(0,1));
			String last = new String(st.substring(2,3));
			
			//Integer elem = Integer.parseInt(st);
		}

		System.out.println("Initialized complete");
		//just 8 elements
		Stack<Integer> s = new Stack<>();
		int n = 8;
		for(int i=0; i<n; i++){
			if(!s.isEmpty())
				if(net[i] == net[s.peek().intValue()] )
					s.pop();
				else s.push(i);
			else s.push(i); //new Integer(i)
		}	
		
		if(s.empty())
		{
			System.out.println("Swithch box routable");	
		}
		System.out.println("Not routable");
		
		
	
	}

}
