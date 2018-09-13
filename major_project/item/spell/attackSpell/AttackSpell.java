package major_project.item.spell.attackSpell;

import major_project.item.spell.Spell;

public class AttackSpell extends Spell{

   private int attack;
   private String name;
	
   public AttackSpell(int weight, int value, String name, int attack){
      super(weight, value, name);
      this.attack = attack;
   }
   
   public int getAttack(){
      return attack;
   }
}