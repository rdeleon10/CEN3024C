import java.util.HashMap; 
import java.util.Map; 
public class RDWordOccurrences {

   public static void main(String[] args) { 
       String text = "Sample text one sample text two"; 
       String[] words = text.split(" "); 
       Map<String, Integer> counts = new HashMap<String, Integer>(); 
       
       for (String word : words) { 
           Integer countswords = counts.get(word); 
           
           if (countswords == null) { 
               counts.put(word, 1);
               
           } 
           else { 
               counts.put(word, countswords + 1); 
           } 
       } 
       System.out.println(counts); 
   } 
} 