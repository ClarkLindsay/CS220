package major_project.item.weapon.meleeWeapon;

import major_project.item.weapon.*;

public class RustedSword extends MeleeWeapon implements OneHandedWeapon{

   private int weight;
   private int value;
   private int attack;
   
   public RustedSword(){
      super(2, 10, "Rusted sword", 6);
   }
}