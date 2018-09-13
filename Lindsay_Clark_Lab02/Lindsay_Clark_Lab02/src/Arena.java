import java.util.*;

public class Arena {
	
   private static Scanner scan = new Scanner(System.in);
   private static Random rand = new Random();
   private static Character char1;
   private static Character char2;
   private static String s;

   public static void main(String[] args) {
   
      System.out.println("Choose a character!");
      System.out.println("(mario, bowser, or peach");
      s = scan.nextLine().toLowerCase();
      System.out.println("");
   	
      if (s.equals("mario"))
         char1 = new Mario();
      else if (s.equals("Bowser"))
         char1 = new Bowser();
      else if (s.equals("Peach"))
         char1 = new Peach();
      else 
         char1 = new Mario();
   	
      if (rand.nextInt(3) == 0)
         char2 = new Mario((rand.nextInt(14)+1), (rand.nextInt(4)+1), (rand.nextInt(1)+1));
      else if (rand.nextInt(2) == 1)
         char2 = new Peach((rand.nextInt(14)+1), (rand.nextInt(4)+1), (rand.nextInt(1)+1));
      else if (rand.nextInt(2) == 2)
         char2 = new Bowser((rand.nextInt(14)+1), (rand.nextInt(4)+1), (rand.nextInt(1)+1));
      else
         char2 = new Mario((rand.nextInt(14)+1), (rand.nextInt(4)+1), (rand.nextInt(1)+1));
   	
      while (char1.getHealth()>0 && char2.getHealth()>0){
      	
         int playerDamage = 0;
         int computerDamage = 0;
         int randNum = 0;
      	
         System.out.println("Do you want to attack, defend, or use your special attack?");
         System.out.println("(attack, defend, or special attack)");
         s = scan.nextLine().toLowerCase();
         System.out.println("");
         
         if (s.equals("attack"))
            playerDamage = char1.attack();
         else if (s.equals("defend"))
            playerDamage = char1.defend();
         else if (s.equals("special attack")){
            playerDamage = char1.specialAttack();
            s = "attack";
         }
         else
            playerDamage = char1.attack();
      	
         randNum = rand.nextInt(3);
      	
         if (randNum == 0)
            computerDamage = char2.attack();
         else if (randNum == 1)
            computerDamage = char2.defend();
         else if (randNum == 2){
            computerDamage = char2.specialAttack();
            randNum = 0;
         }
         else 
            computerDamage = char2.attack();
      	
      	
         if (s.equals("defend") && randNum == 1){
            System.out.println("Both players defended");
            System.out.println("Player1 Health: " + char1.getHealth());
            System.out.println("Computer Player Health: " + char2.getHealth());
            System.out.println("");
         }
         
         else if (s.equals("attack") && randNum == 1){
            System.out.println("Computer Defended while Player1 Attacked!");
         	
            if ((playerDamage + computerDamage) > 0){
               if ((char2.getHealth() - playerDamage) > 0){
                  char2.setHealth(char2.getHealth() - (playerDamage + computerDamage));
               }
               else
                  char2.setHealth(0);
            }
         	
            System.out.println("Player1 Health: " + char1.getHealth());
            System.out.println("Computer Player Health: " + char2.getHealth());
            System.out.println("");
         }
         
         else if (s.equals("defend") && randNum == 0){
            System.out.println("Player1 defended while Computer Attacked!");
         	
            if ((playerDamage + computerDamage) > 0){
               if ((char1.getHealth() - computerDamage) > 0){
                  char1.setHealth(char1.getHealth() - (playerDamage + computerDamage));
               }
               else
                  char1.setHealth(0);
            }
         	
            System.out.println("Player1 Health: " + char1.getHealth());
            System.out.println("Computer Player Health: " + char2.getHealth());
            System.out.println("");
         }
         
         else if (s.equals("attack") && randNum == 0){
            System.out.println("Both Players Attacked Eachother");
         	
            if ((char1.getHealth() - computerDamage) > 0){
               char1.setHealth(char1.getHealth() - computerDamage);
            }
            else 
               char1.setHealth(0);
         	
            if ((char2.getHealth() - playerDamage) > 0){
               char2.setHealth(char2.getHealth() - playerDamage);
            }
            else
               char2.setHealth(0);
         	
            System.out.println("Player1 Health: " + char1.getHealth());
            System.out.println("Computer Player Health: " + char2.getHealth());
            System.out.println("");
         }
      	
      }
   	
      if(char1.getHealth() > 0){
         System.out.println("Congratulations, You Won!");
      }
      
      else
         System.out.println("I am sorry, you lost");
   }
}	

