package major_project.item.spell.healingSpell;

import major_project.item.spell.Spell;

public class HealingSpell extends Spell{

   private int heal;
   private String name;
	
   public HealingSpell(int weight, int value, String name, int heal){
      super(weight, value, name);
      this.heal = heal;
   }
   
   public int getHeal(){
      return this.heal;
   }
}