import java.util.Random;

public class Hamburger extends Items{
	
	private Random rand = new Random();
	private int weight;
	
	public Hamburger(){
		weight = rand.nextInt(10);
	}
	
	public String toString(){
		return "This hamburger weighs " + weight + "oz";
	}

}
