package major_project.item.weapon.rangedWeapon;

import major_project.item.weapon.*;

public class CrossBow extends RangedWeapon implements TwoHandedWeapon{

   private int weight;
   private int value;
   private int attack;
   
   public CrossBow(){
      super(-1, -1, "Cross bow", -1);
   }
}