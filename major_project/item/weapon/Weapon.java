package major_project.item.weapon;

import major_project.item.Item;

public class Weapon extends Item{
	
   private int weight;
   private int value;
   private int attack;
   private String name;
	
   public Weapon(int weight, int value, String name, int attack){
      super(weight, value, name);
      this.attack = attack;
   }
	
   public int getAttack(){
      return attack;
   }
}