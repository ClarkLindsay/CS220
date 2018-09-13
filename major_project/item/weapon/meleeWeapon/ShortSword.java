package major_project.item.weapon.meleeWeapon;

import major_project.item.weapon.*;

public class ShortSword extends MeleeWeapon implements OneHandedWeapon{

   private int weight;
   private int value;
   private int attack;
   
   public ShortSword(){
      super(2, 10, "Short sword", 6);
   }
}