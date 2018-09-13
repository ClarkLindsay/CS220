package major_project.item.weapon.meleeWeapon;

import major_project.item.weapon.*;

public class Dagger extends MeleeWeapon implements OneHandedWeapon{

   private int weight;
   private int value;
   private int attack;
   
   public Dagger(){
      super(-1, -1, "Dagger", -1);
   }
}