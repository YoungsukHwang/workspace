import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** Class LinearProbingHashTableTest **/
public class LinearProbingHashTableTest {
	public static void main(String[] args) throws FileNotFoundException
    {

    	LinearProbingHashTable hash = new LinearProbingHashTable(1000003);
    	//read hash.txt  only key insert
    	File file = new File("hash.txt");
    	Scanner sc = new Scanner(file);
    	
    	while(sc.hasNext()){
    		String token = sc.nextLine();
    		System.out.println(token);
    		hash.insert(token, "123");
    	}
    	
    	//print hash
    	hash.printHashTable();
    	
    	
    	//0.1, 0.25, 0.5, 0.75 and 0.9.
    	double d1=0.1, d2=0.25, d3=0.25, d4=0.75, d5=0.9;
    	double[] d = {0,1, 0.25, 0.5, 0.75, 0.9};
    	double t1, t2;
    	int max = 1000003;
    	LinearProbingHashTable [] hT = new LinearProbingHashTable[5];
    	
    	
    	
    	for(int j=0; j<5; j++){
    		hT[j] = new LinearProbingHashTable(max);
    		for(int i=0; i < max*d[j]; i++)
    			hash.insert(Integer.toString(i), "1");
    	}
    	t1 = System.nanoTime();
    	t2 = System.nanoTime();

    }
}
