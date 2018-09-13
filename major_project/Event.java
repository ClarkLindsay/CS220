package major_project;

import java.util.*;
import java.util.concurrent.TimeUnit;
import major_project.item.Item;
import major_project.item.weapon.meleeWeapon.*;
import major_project.item.weapon.rangedWeapon.*;
import major_project.item.defensiveItem.*;
import major_project.item.spell.healingSpell.*;
import major_project.item.spell.attackSpell.*;
import major_project.item.potion.healingPotion.*;
import major_project.character.*;
import major_project.monster.*;
import java.io.*; 

public class Event{

   public static MainClass mainClass = new MainClass();
   
   //This method creates one or more monsters and has the player fight them
   public static void majorEvent(CharacterClass player, Bag<String> languages) throws Exception{
      Random rand = new Random();
      
      switch(rand.nextInt(3) + 1){
      
         case (1):  
            Monster orc = new Monster();
            orc.setStrength(3);
            orc.setDexterity(1);
            orc.setIntelligence(-2);
            orc.setSpeed(5);
            orc.setArmorClass(13);
            orc.setHitPoints(15);
            
            System.out.println("");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("You have been traveling for some time");
            System.out.println("");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("As you move foreward, you hear a twig snap ahead of you");
            System.out.println("");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("You fall into a combat stance as out of the bush an orc charges, axe swinging wildly");
            System.out.println("");
            TimeUnit.SECONDS.sleep(2);
            
            if (languages.containsString("orc")){
               System.out.println("Knowing orc, you can hear it say 'I'll have you're head, human!'");
               System.out.println("");
               TimeUnit.SECONDS.sleep(2);
            }
               
            System.out.println("(Combat is fought in rounds, with you and your enemies taking turns. You get the first move)");
            System.out.println("");
            TimeUnit.SECONDS.sleep(2);
         
            while(player.getHitPoints() > 0 && orc.getHitPoints() > 0){
            
               System.out.println("What do you do?");
               mainClass.attackOptions(orc, "orc");   
            
               int damage = 0;   
               damage = orc.meleeAttack(player, new Axe());
               System.out.println("");
               TimeUnit.SECONDS.sleep(2);
            
               if (damage > 0)
                  System.out.println("The orc strikes you, you stumble back, clutching your wound");
               else 
                  System.out.println("The orc misses, you ready yourself for your next move");
                     
               System.out.println("");
               TimeUnit.SECONDS.sleep(2);
            }
            
            if (player.getHitPoints() > 0)
               System.out.println("You slay the orc");
               
            else{
               System.out.println("The orc kills you");      
               System.out.println("");
               TimeUnit.SECONDS.sleep(2);
               System.out.println("GAME OVER");
               System.exit(0);
            }
         
            player.setHitPoints(13);
            break;
            
         case (2):  
            Monster spider = new Monster();
            spider.setStrength(2);
            spider.setDexterity(3);
            spider.setIntelligence(-4);
            spider.setSpeed(5);
            spider.setArmorClass(14);
            spider.setHitPoints(26);
            
            System.out.println("");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("You have been traveling for some time");
            System.out.println("");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("You hear a soft press against your back");
            System.out.println("");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("You slowly turn around and are greeted by the sight of a massive spider hanging above you, mandebles snapping");
            System.out.println("");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("(Combat is fought in rounds, with you and your enemies taking turns. You get the first move)");
            System.out.println("");
            TimeUnit.SECONDS.sleep(2);
         
            while(player.getHitPoints() > 0 && spider.getHitPoints() > 0){
            
               System.out.println("What do you do?");
               mainClass.attackOptions(spider, "spider");   
            
               int damage = 0;   
               damage = spider.meleeAttack(player, new Fangs());
               System.out.println("");
               TimeUnit.SECONDS.sleep(2);
            
               if (damage > 0)
                  System.out.println("The spider bites you, you kick frantically, trying to break free");
               else 
                  System.out.println("The spider misses, you ready yourself for your next move");
                     
               System.out.println("");
               TimeUnit.SECONDS.sleep(2);
            }
            
            if (player.getHitPoints() > 0)
               System.out.println("You slay the spider");
               
            else{
               System.out.println("The spider kills you");
               System.out.println("");
               TimeUnit.SECONDS.sleep(2);
               System.out.println("GAME OVER");
               System.exit(0);
            }
         
            player.setHitPoints(13);
            break;
            
         case (3):  
            Monster skeleton1 = new Monster();
            skeleton1.setStrength(0);
            skeleton1.setDexterity(2);
            skeleton1.setIntelligence(-2);
            skeleton1.setSpeed(5);
            skeleton1.setArmorClass(13);
            skeleton1.setHitPoints(13);
            
            Monster skeleton2 = new Monster();
            skeleton2.setStrength(0);
            skeleton2.setDexterity(2);
            skeleton2.setIntelligence(-2);
            skeleton2.setSpeed(5);
            skeleton2.setArmorClass(13);
            skeleton2.setHitPoints(13);
            
            Monster skeleton3 = new Monster();
            skeleton3.setStrength(0);
            skeleton3.setDexterity(2);
            skeleton3.setIntelligence(-2);
            skeleton3.setSpeed(5);
            skeleton3.setArmorClass(13);
            skeleton3.setHitPoints(13);
            
            System.out.println("");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("You have been traveling for some time");
            System.out.println("");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("You come upon an abandoned graveyard, the tombstones broken and moss-covered");
            System.out.println("");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("You see a strange green glow surrounding one of the graves and spreading across the graveyard");
            System.out.println("");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("As you approach to investigate, a skeletal hand bursts from the ground, grabbing your foot");
            System.out.println("");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Around you three dozen skeletons surround you, rusted weapons clutched in boney hands");
            System.out.println("");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("(Combat is fought in rounds, with you and your enemies taking turns. You get the first move)");
         
            while(player.getHitPoints() > 0 && skeleton1.getHitPoints() > 0){
               System.out.println("");
               TimeUnit.SECONDS.sleep(2);
            
               System.out.println("What do you do?");
               mainClass.attackOptions(skeleton1, "skeleton");   
            
               int damage = 0;   
               damage = skeleton1.meleeAttack(player, new RustedSword());
               System.out.println("");
               TimeUnit.SECONDS.sleep(2);
            
               if (damage > 0)
                  System.out.println("The first skeleton stabs you, pulling you in close to its gaping jaws");
               else 
                  System.out.println("The first skeleton misses, stumbling back, you ready yourself for your next move");
               
               damage = skeleton2.meleeAttack(player, new Fangs());
               System.out.println("");
               TimeUnit.SECONDS.sleep(2);
            
               if (damage > 0)
                  System.out.println("The second skeleton bites you, you scream in pain");
               else 
                  System.out.println("The second skeleton misses, bellowing in rage, you ready yourself for your next move");
               
               damage = skeleton3.rangedAttack(player, new LongBow());
               System.out.println("");
               TimeUnit.SECONDS.sleep(2);
            
               if (damage > 0)
                  System.out.println("The third shoots you with a bow");
               else 
                  System.out.println("The third skeleton misses, it cocks its head in confusion");
            }
            
            System.out.println("");
            TimeUnit.SECONDS.sleep(2);
            
            if (player.getHitPoints() > 0)
               System.out.println("You slay the first skeleton");
               
            else{
               System.out.println("The skeleton kills you");
               System.out.println("");
               TimeUnit.SECONDS.sleep(2);
               System.out.println("GAME OVER");
               System.exit(0);
            }
            
            System.out.println("");
            TimeUnit.SECONDS.sleep(2);
            
            while(player.getHitPoints() > 0 && skeleton2.getHitPoints() > 0){
               System.out.println("");
               TimeUnit.SECONDS.sleep(2);
            
               System.out.println("What do you do?");
               mainClass.attackOptions(skeleton2, "skeleton");   
            
               int damage = 0;   
               damage = skeleton2.meleeAttack(player, new Fangs());
               System.out.println("");
               TimeUnit.SECONDS.sleep(2);
            
               if (damage > 0)
                  System.out.println("The second skeleton bites you, you scream in pain");
               else 
                  System.out.println("The second skeleton misses, bellowing in rage, you ready yourself for your next move");
               
               damage = skeleton3.rangedAttack(player, new LongBow());
               System.out.println("");
               TimeUnit.SECONDS.sleep(2);
            
               if (damage > 0)
                  System.out.println("The third shoots you with a bow");
               else 
                  System.out.println("The third skeleton misses, it cocks its head in confusion");
            }
            
            System.out.println("");
            TimeUnit.SECONDS.sleep(2);
            
            if (player.getHitPoints() > 0)
               System.out.println("You slay the skeleton");
               
            else{
               System.out.println("The second skeleton kills you");
               System.out.println("");
               TimeUnit.SECONDS.sleep(2);
               System.out.println("GAME OVER");
               System.exit(0);
            }
         
            while(player.getHitPoints() > 0 && skeleton3.getHitPoints() > 0){
               System.out.println("");
               TimeUnit.SECONDS.sleep(2);
            
               System.out.println("What do you do?");
               mainClass.attackOptions(skeleton3, "skeleton");   
            
               int damage = 0;   
               damage = skeleton3.rangedAttack(player, new LongSword());
               System.out.println("");
               TimeUnit.SECONDS.sleep(2);
            
               if (damage > 0)
                  System.out.println("The third shoots you with a bow");
               else 
                  System.out.println("The third skeleton misses, it cocks its head in confusion");
            } 
            
            System.out.println("");
            TimeUnit.SECONDS.sleep(2);        
            
            if (player.getHitPoints() > 0)
               System.out.println("You slay the last skeleton");
               
            else{
               System.out.println("The skeleton kills you");
               System.out.println("");
               TimeUnit.SECONDS.sleep(2);
               System.out.println("GAME OVER");
               System.exit(0);
            }
         
            player.setHitPoints(13);
            break;
      }
   }
   
   //This method generates random things that the player finds
   public static void minorEvent(CharacterClass player, Bag<Item> backpack) throws Exception{
      Random rand = new Random();
      Scanner scan = new Scanner(System.in);
      String input;
      boolean loop = true;
      
      switch (rand.nextInt(2) + 1){
         
         case 1 : 
            Axe axe = new Axe();
            System.out.println("");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("You see a glint of steel hidden in a bush");
            System.out.println("");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Moving closer, you see that it is an old axe");
            
            loop = true;
            while (loop == true){  
               System.out.println("");
               TimeUnit.SECONDS.sleep(2);
               System.out.println("What do you do?");
               System.out.println("1.) Keep it");
               System.out.println("2.) Move on");
               input = scan.nextLine();
             
               switch (input){
                  case "1" :
                     backpack.add(axe);
                     System.out.println("");
                     System.out.println("Axe added to backpack");
                     loop = false;
                     break;
                  
                  case "2" :
                     loop = false;
                     break;
                  
                  default :
                     System.out.println("");
                     System.out.println("Invalid input");
                     break;       
               }
            }
            break;
            
         case 2 : 
            CureWoundsPotion potion = new CureWoundsPotion();
            System.out.println("");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("You find an abandoned house");
            System.out.println("");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Inside, you see a chest, opening it you see that it contains a 2 healing potions");
            
            loop = true;
            while (loop == true){  
               System.out.println("");
               TimeUnit.SECONDS.sleep(2);
               System.out.println("What do you do?");
               System.out.println("1.) Keep them");
               System.out.println("2.) Move on");
               input = scan.nextLine();
             
               switch (input){
                  case "1" :
                     backpack.add(potion);
                     System.out.println("");
                     System.out.println("Healing potion added to backpack");
                     backpack.add(potion);
                     System.out.println("Healing potion added to backpack");
                     loop = false;
                     break;
                  
                  case "2" :
                     loop = false;
                     break;
                  
                  default :
                     System.out.println("");
                     System.out.println("Invalid input");
                     break;
               }
            }
      
      }
   }
}