import static org.junit.Assert.*; 
import org.junit.Test; 
import java.util.HashMap; 
import java.util.Map; 
public class RDWordOccurrenceTesting {

   @Test 
   public void testRDWordOccurrences() { 
       String text = "Sample text one sample text two"; 
       String[] words = text.split(" "); 
       Map<String, Integer> counts = new HashMap<String, Integer>(); 
       
       for (String word : words) { 
           Integer count = counts.get(word); 
           
           if (count == null) { 
               counts.put(word, 1); 
           } 
           
           else { 
               counts.put(word, count + 1); 
           } 
       } 
       assertEquals(counts, RDWordOccurrences.main(words)); 
   } 
}