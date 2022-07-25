
// Module 4 | Threads & Concurrency | Programming Project (Ryan Deleon)
public class AnimalFood {

		// this is used to share data as synchronized methods only! Therefore displays the behavior outputs in both FirstAnimal and SecondAnimal Outputs. 
	 synchronized void eating(long sleeping) {
	       try {
	           Thread.sleep(sleeping);
	       } catch (InterruptedException eatingfood) {
	    	   // Used to catch tread interruption while sleeping.
	           eatingfood.printStackTrace();
	           // Used to handle exceptions and errors.
	       }
	   }

	}
