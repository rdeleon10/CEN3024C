import java.util.HashMap; 
import java.util.Map; 
	
/**
 * Public Class known as RDWordOccurrences.
 * 
 */

	public class RDWordOccurrences {
	
		/**
		 * @author ryandeleon
		 * @version 7/5/2022
		 * This is the application's entry point.
		 */
		
		/**
		 * Main Method
		 * @param args an array of command-line arguments for the application.
		 */
   public static void main(String[] args) { 
       String text = "Sample text one sample text two"; 
       String[] words = text.split(" "); 
       Map<String, Integer> counts = new HashMap<String, Integer>(); 
       
       	/**
       	 * Implemented string, integers, for, if and else to count the strings of text.
       	 * 
       	 */
       for (String word : words) { 
           Integer countswords = counts.get(word); 
           
           if (countswords == null) { 
               counts.put(word, 1);
               
           } 
           else { 
               counts.put(word, countswords + 1); 
           } 
       } 
       	/**
       	 * println is used to output words and the number of words used.
       	 */
       System.out.println(counts); 
   } 
} 