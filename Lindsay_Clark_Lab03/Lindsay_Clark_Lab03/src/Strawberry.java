import java.util.Random;

public class Strawberry extends Items{
	
	private Random rand = new Random();
	private int weight;
	
	public Strawberry(){
		weight = rand.nextInt(5);
	}
	
	public String toString(){
		return "This strawberry weighs " + weight + " grams";
	}

}
