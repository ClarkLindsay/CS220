import java.util.Random;

public class ShoppingCart {

	@SuppressWarnings("unchecked")
	public static <T> void main(String[] args){
		Bag<Items> paperBag = new Bag<Items>();
		Bread bread = new Bread();
		Carrot carrot = new Carrot();
		Hamburger hamburger = new Hamburger();
		Strawberry strawberry = new Strawberry();
		
		T[] result = (T[]) new Object[20];
		
		Random rand = new Random(50);
		
		while (paperBag.isFull() == false){
			if (rand.nextInt(4) == 0)
				paperBag.add(bread);
			if (rand.nextInt(4) == 1)
				paperBag.add(carrot);
			if (rand.nextInt(4) == 2)
				paperBag.add(hamburger);
			if (rand.nextInt(4) == 3)
				paperBag.add(strawberry);
		}
		
		System.out.println("Adding items to the bag.");
		System.out.println("Current size: " + paperBag.getCurrentSize());
		
		System.out.println("");
		
		System.out.println("Does the bag contain bread?");
		System.out.println(paperBag.contains(bread));
		
		System.out.println("Does the bag contain carrots?");			
		System.out.println(paperBag.contains(carrot));
			
		System.out.println("Does the bag contain hamburger?");
		System.out.println(paperBag.contains(hamburger));
		
		System.out.println("Does the bag contain strawberries?");
		System.out.println(paperBag.contains(strawberry));
			
		System.out.println("How much bread?");
		System.out.println(paperBag.getFrequencyOf(bread));
			
		System.out.println("How many carrots?");
		System.out.println(paperBag.getFrequencyOf(carrot));
			
		System.out.println("How much hamburger?");
		System.out.println(paperBag.getFrequencyOf(hamburger));
			
		System.out.println("How many strawberries?");
		System.out.println(paperBag.getFrequencyOf(strawberry));
		
		System.out.println("");
		System.out.println("This is what is in your bag:");
		
		result = (T[]) paperBag.toArray();
		for (int i = 0; i < 20; i++){
			System.out.println(result[i].toString());
		}
		
		System.out.println("");
		System.out.println("Emptying bag, one item at a time.");
		
		while (paperBag.isEmpty() == false){
			System.out.println("We removed: " + paperBag.remove());
		}
		
		System.out.println("");
		
		System.out.println("Current size: " + paperBag.getCurrentSize());
		
		System.out.println("");
		System.out.println("Adding items back into bag.");
		
		while (paperBag.isFull() == false){
			if (rand.nextInt(4) == 0)
				paperBag.add(bread);
			if (rand.nextInt(4) == 1)
				paperBag.add(carrot);
			if (rand.nextInt(4) == 2)
				paperBag.add(hamburger);
			if (rand.nextInt(4) == 3)
				paperBag.add(strawberry);
		}
		
		
		System.out.println("Current size: " + paperBag.getCurrentSize());
		
		System.out.println("");
		
		System.out.println("Removing one item?: " + paperBag.remove(bread));
		
		System.out.println("");
		
		System.out.println("Current size: " + paperBag.getCurrentSize());
		
		System.out.println("");
		System.out.println("Clearing all items.");
		
		paperBag.clear();
		
		System.out.println("Current size: " + paperBag.getCurrentSize());
	}
}
