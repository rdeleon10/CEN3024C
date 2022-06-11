import javafx.stage.Stage;
import java.util.Random;
import java.util.*;
import java.util.Scanner; /* Uses java utility. */
/** 
 * @author Ryan Deleon
 * 
 * @see rdfibonacci to perform basic fibonacci sequence.
 * 
 */

/* Ryan Deleon, June 8th 2022 */

public class rdfibonacci
{
public static int fibonaccir (int number) { /* Used recursive method */


if(number <= 1)
{
	
return 1;
}

else {
	
return fibonaccir(number-1)+fibonaccir(number-2);
}

}

public static int fibonaccii(int number) { /* Used for iterative method */

	if(number<=1)

{
	return 1;
}

int returnval = 0, pattern = 1, pattern2 = 1, inte;

for(inte = 2; inte <= number;inte++)

{
	
returnval = pattern + pattern2;
pattern2 = pattern;
pattern = returnval;

}

return returnval;
}

public static void main(String[] args) {


int integer, num = 40,function1,function2;

System.out.print("n\tIterative\tRecursive\n");

System.out.print("==\t=========\t=====================\n");

long time_started,time_ended;

int calculation,calculation2;

for(integer = 30;integer <= num; integer++) /* loop from 30 to 40 */
{
time_started = System.nanoTime(); /* Used for initiating time */

function1 = fibonaccii(integer); /* Function thats using for iterative method */

time_ended = System.nanoTime(); /* for end time */

calculation = (int)((time_ended - time_started) / 1e4); /* for calculating difference. */

time_started = System.nanoTime(); /* for initial time. */

function2 = fibonaccir(integer); /* Function thats using recursive method. */

time_ended = System.nanoTime(); /* for end time. */

calculation2 = (int)((time_ended - time_started) / 1e4); 
/* calculates time which uses scientific notation (10^4). */

System.out.print(integer+"\t\t"+calculation+"\t\t\t"+calculation2 +"\t\n");

}

}

}