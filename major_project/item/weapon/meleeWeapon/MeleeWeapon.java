package major_project.item.weapon.meleeWeapon;

import major_project.item.weapon.Weapon;

public class MeleeWeapon extends Weapon{
	
   private int weight;
   private int value;
   private int attack;
   private String name;
	
   public MeleeWeapon(int weight, int value, String name, int attack){
      super(weight, value, name, attack);
      this.attack = attack;
   }
	
   public int getAttack(){
      return attack;
   }
}