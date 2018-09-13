package major_project.item.weapon.meleeWeapon;

import major_project.item.weapon.*;

public class LongSword extends MeleeWeapon implements TwoHandedWeapon{

   private int weight;
   private int value;
   private int attack;
   
   public LongSword(){
      super(6, 50, "Long sword", 12);
   }
}