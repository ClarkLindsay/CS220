package major_project.item.potion.healingPotion;

import major_project.item.potion.Potion;

public class HealingPotion extends Potion{

   public int heal;
   private String name;
	
   public HealingPotion(int weight, int value, String name, int heal){
      super(weight, value, name);
      this.heal = heal;
   }
   
   public int getHeal(){
      return this.heal;
   }
}