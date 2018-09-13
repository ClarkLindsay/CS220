import java.util.Random;

public class Bread extends Items{
	
	private Random rand = new Random();
	private int weight;
	
	public Bread(){
		weight = rand.nextInt(16);
	}
	
	public String toString(){
		return "This bread weighs " + weight + "oz";
	}
	
}
