import java.util.concurrent.ThreadLocalRandom;

// Module 4 | Threads & Concurrency | Programming Project (Ryan Deleon)
public class FirstAnimal implements Runnable {

	private String name;
	   private int position;
	   private int speed;
	   private int restMax;
	   private static boolean winner = false;

	   public String getName() {
	       return name;
	   }

	   public void setName(String name) {
	       this.name = name;
	   }

	   public int getPosition() {
	       return position;
	   }

	   public void setPosition(int position) {
	       this.position = position;
	   }

	   public int getSpeed() {
	       return speed;
	   }

	   public void setSpeed(int speed) {
	       this.speed = speed;
	   }

	   public int getRestMax() {
	       return restMax;
	   }

	   public void setRestMax(int restMax) {
	       this.restMax = restMax;
	   }

	   public static void main(String[] args) {
		   
		   // First Instance Hare "user thread"
	       FirstAnimal Hare = new FirstAnimal();
	       Hare.setName("Hare");
	       Hare.setPosition(0);
	       Hare.setRestMax(220);
	       Hare.setSpeed(9);
	       // Second Instance Tortoise "user thread'
	       FirstAnimal Tortoise = new FirstAnimal();
	       Tortoise.setName("Tortoise");
	       Tortoise.setPosition(0);
	       Tortoise.setRestMax(165);
	       Tortoise.setSpeed(5);
	       Thread HareThread = new Thread(Hare);
	       Thread TortoiseThread = new Thread(Tortoise);

	       HareThread.start();
	       TortoiseThread.start();
	   }

	   @Override
	   public void run() {

	       while (position <= 120 && !winner) {
	           position += speed;
	           int randomNumber = ThreadLocalRandom.current().nextInt(0, getRestMax());
	           	   System.out.println("Running: " + getName() + "\tPosition: " + getPosition());
	           if (position >= 120) {
	               winner = true;
	               System.out.println("Winner: " + getName());
	           }

	       }

	   }

	}