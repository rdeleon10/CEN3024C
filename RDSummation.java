import java.util.Random;

/* Imported java.util for random numbers. */

/* Module 8 Array Summations by Ryan Deleon, June 28 2022. */

class RDSummation extends Thread {

private int[] array;

private int low, high, partial;

public RDSummation(int[] arr, int low, int high)

{

this.array = arr;

this.low = low;

this.high = Math.min(high, arr.length);

}

public int getPartialSum()

{

return partial;

}

public void run()

{

partial = sum(array, low, high);

}

public static int sum(int[] array)

{

return sum(array, 0, array.length);

}

public static int sum(int[] array, int low, int high)

{

int overalltotal = 0;

for (int i = low; i < high; i++) {

overalltotal += array[i];

}

return overalltotal;

}

public static int parallelSum(int[] array)

{

return parallelSum(array, Runtime.getRuntime().availableProcessors());

}

public static int parallelSum(int[] array, int threads)

{

int primarysize = (int) Math.ceil(array.length * 1.0 / threads);

RDSummation[] multisum = new RDSummation[threads];

for (int i = 0; i < threads; i++) {

multisum[i] = new RDSummation(array, i * primarysize, (i + 1) * primarysize);

multisum[i].start();

}

try {

for (RDSummation mainsum : multisum) {

mainsum.join();

}

} catch (InterruptedException e) { }

int totalsum = 0;

for (RDSummation mainsum : multisum) {

totalsum += mainsum.getPartialSum();

}

return totalsum;

}

}

class Main {

public static void main(String[] args)

{

Random utilrand = new Random();

int[] array = new int[200000000];

for (int i = 0; i < array.length; i++) {

array[i] = utilrand.nextInt(10) + 1;

}

long longstart = System.currentTimeMillis();

System.out.println(RDSummation.sum(array));

System.out.println("Single Array Sum: " + (System.currentTimeMillis() - longstart));

longstart = System.currentTimeMillis();

System.out.println(RDSummation.parallelSum(array));

System.out.println("Parallel Array Sum: " + (System.currentTimeMillis() - longstart));

}

}