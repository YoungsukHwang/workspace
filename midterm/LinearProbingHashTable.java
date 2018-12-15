import java.util.Scanner;
 
 
/** Class LinearProbingHashTable **/
public class LinearProbingHashTable
{
    private int currentSize, maxSize;       
    private String[] keys;    // Integers but stored in String??? use the slide code
    private String[] vals;    // strings
 
    /** Constructor **/
    public LinearProbingHashTable(int capacity) 
    {
    	maxSize=capacity;
    	currentSize=0;
    	keys = new String[maxSize];
    	vals = new String[maxSize];
    }  
 
    /** Function to clear hash table **/
    public void makeEmpty()
    {
    }
 
    /** Function to get size of hash table **/
    public int getSize() 
    {
    	return currentSize;
    }
 
    /** Function to check if hash table is empty **/
    public boolean isEmpty() 
    {
        return getSize() == 0;
    }
 
    /** Function to get hash code of a given key **/
    private int hashCode(String key) 
    {
    	int length = key.length();
    	int answer=0;
    	if(length%2 ==1){
    		answer = key.charAt(length-1);
    		length--;
    	}
    	for(int i=0; i<length;i+=2){
    		answer+= key.charAt(i);
    		answer+= ((int) key.charAt(i+1)) <<16;
    	}
    	return (answer<0) ? -answer: answer;
    }    
 
    /** Function to insert key-value pair **/
    public void insert(String key, String val) 
    {               //hashfunction h(x)= x mod 1000003  maxSize=1000003
    	int keyToInt = hashCode(key);
    	int code = keyToInt % maxSize;
    	
    	if(keys[code]==null){ // 
    		keys[code] = key;
    		vals[code] = val;
    	}
    	else{ //linear probing
    		int iter = code;
    		while( keys[iter] != null ){
    			iter++;
    		}
    		keys[iter] = key;
    		vals[iter] = val;
    	}
    }
 
    /** Function to get value for a given key **/
    public String get(String key) 
    {
    	int keyToInt = hashCode(key);
    	int code = keyToInt % maxSize;
    	
    	if( code == Integer.parseInt(keys[code]) )
    		return vals[code];
    	else{ //linear probing
    		int iter = code;
    		while( code != Integer.parseInt(keys[iter]) ){
    			iter++;
    		}
    		return vals[iter];
    	}
    }
 
    /** Function to remove key and its value **/
    public void remove(String key) 
    {
       	int keyToInt = hashCode(key);
    	int code = keyToInt % maxSize;
    	
    	if( code == Integer.parseInt(keys[code])){
    		keys[code]=null;
    		vals[code]=null;
    	}else{ // linear probing with dragging
    		int iter = code;
    		while( code != Integer.parseInt(keys[iter])){
    			iter++;
    		}// found iter
    		keys[iter]=null;
    		vals[iter]=null;
    		int rmv = iter;
    		iter++;
    		while(keys[iter]!=null){
    			if( Integer.parseInt(keys[iter]) < iter ){
    				if( rmv < Integer.parseInt(keys[iter]))
    					iter++;
    				else{
    					keys[rmv]= keys[iter];
    					vals[rmv]= vals[iter];
    					rmv = iter;
    					iter++;
    				}
    			}
    			else if(Integer.parseInt(keys[iter])==iter)
    				iter++;
    		}	
    	}
    }       
 
    /** Function to print HashTable **/
    public void printHashTable()
    {
        System.out.println("\nHash Table: ");
        for (int i = 0; i < maxSize; i++)
            if (keys[i] != null)
              System.out.println("("+keys[i]+","+ vals[i]+")");
        System.out.println();
    }   
}
