package major_project.item.weapon.meleeWeapon;

import major_project.item.weapon.*;

public class Axe extends MeleeWeapon implements TwoHandedWeapon{

   private int weight;
   private int value;
   private int attack;
   
   public Axe(){
      super(2, 10, "Axe", 6);
   }
}