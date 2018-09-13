import java.util.Random;

public class Carrot extends Items{

	private Random rand = new Random();
	private int weight;
	
	public Carrot(){
		weight = rand.nextInt(7);
	}
	
	public String toString(){
		return "This carrot weighs " + weight + "oz";
	}
}
