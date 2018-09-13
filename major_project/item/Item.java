package major_project.item;

//This class is used for a generic item
public class Item {
	
   private int weight;
   private int value;
   private String name;
	
   public Item(int weight, int value, String name){
      this.weight = weight;
      this.value = value;
      this.name = name;
   }
	
   public int getWeight(){
      return weight;
   }
	
   public int getValue(){
      return value;
   }
   
   public String toString(){
      return name;
   }
}