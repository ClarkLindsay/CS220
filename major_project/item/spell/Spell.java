package major_project.item.spell;

import major_project.item.Item;

public class Spell extends Item{
	
   private int attack;
   private int heal;
   private String name;
   
   public Spell(int weight, int value, String name){
      super(weight, value, name);
   }
   
   public int getAttack(){
      return this.attack;
   }
   
   public int getHeal(){
      return this.heal;
   }
}