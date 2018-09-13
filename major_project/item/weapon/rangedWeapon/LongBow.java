package major_project.item.weapon.rangedWeapon;

import major_project.item.weapon.*;

public class LongBow extends RangedWeapon implements TwoHandedWeapon{

   private int weight;
   private int value;
   private int attack;
   
   public LongBow(){
      super(2, 50, "Long bow", 8);
   }
}