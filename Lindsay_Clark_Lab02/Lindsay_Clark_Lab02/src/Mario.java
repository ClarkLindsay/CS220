import java.util.*;

public class Mario extends Character{

   private Random rand = new Random();
   private int attack = 5;
   private int defense = 4;
   private int strength = 4;
	
   public Mario(){
      attack = rand.nextInt(12);
   }
	
   public Mario(int attack, int defense, int strength){
      this.attack = attack;
      this.defense = defense;
      this.strength = strength;
   }
	
   public int attack(){
      return (int) ((rand.nextInt(10)*attack)/4)*strength;
   }
	
   public int defend(){
      return (int) ((rand.nextInt(10)*defense)/4)*-1;
   }
	
   public int specialAttack(){
   	
      if (rand.nextInt(2) == 0){
         return 0;
      }
      
      else{
         return (int) ((rand.nextInt(10)*attack)/2)*strength;
      }
   }
}
