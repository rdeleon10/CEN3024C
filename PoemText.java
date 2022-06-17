/* Imported Java.io */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/* Poem Text Analyzer by Ryan Deleon 
 Created on May 18th 2022 */
public class PoemText {

	public static void main(String[] args) throws FileNotFoundException {
		
	        File textfile = new File("src/textFile.txt");
	        
	        Scanner scannerutil = new Scanner(textfile);
	        
	        Map<String,Integer> Hashmaputil = new HashMap <String, Integer> (); 
	        
	        while (scannerutil.hasNext()) {
	        String value = scannerutil.next(); 
	        
	        if(Hashmaputil.containsKey(value) == false) 
	        Hashmaputil.put(value,1); else {
	                
	        int count = (int)(Hashmaputil.get(value)); /* finds frequency of the word. */
	        Hashmaputil.remove(value);  /* removes value. */
	        Hashmaputil.put(value,count+1); /* increases frequency by 1. */
	            
	            }
	        }
	        Set<Map.Entry<String, Integer>> entryset = Hashmaputil.entrySet(); /* Lists set entry. */
	        
	        ArrayList<Map.Entry<String, Integer>> sortedArrayList = new ArrayList<Map.Entry<String, Integer>>(entryset);
	        
	        Collections.sort( sortedArrayList, new Comparator<Map.Entry<String, Integer>>() {
	           /* Sorts Comparator as collection. */
	        	public int compare( Map.Entry<String, Integer> a, Map.Entry<String, Integer> b )
	            
	        	{
	            return (b.getValue()).compareTo( a.getValue() );
	            
	        	}
	        } 	
	 
	        	);
	        
	        		for(Map.Entry<String, Integer> i:sortedArrayList){
	        			System.out.println(i.getKey()+" -> "+i.getValue() );
	        }
	} }