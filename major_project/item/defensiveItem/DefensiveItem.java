package major_project.item.defensiveItem;

import major_project.item.Item;

public class DefensiveItem extends Item{
	
   private int weight;
   private int value;
   private int defense;
   private String name;
	
   public DefensiveItem(int weight, int value, String name, int defense){
      super(weight, value, name);
      this.defense = defense;
   }
	
   public int getDefense(){
      return defense;
   }
}