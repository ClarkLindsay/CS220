package major_project;

import java.util.*;
import java.util.concurrent.TimeUnit;
import major_project.item.Item;
import major_project.item.weapon.*;
import major_project.item.weapon.meleeWeapon.*;
import major_project.item.weapon.rangedWeapon.*;
import major_project.item.defensiveItem.*;
import major_project.item.spell.*;
import major_project.item.spell.healingSpell.*;
import major_project.item.spell.attackSpell.*;
import major_project.item.potion.healingPotion.*;
import major_project.character.*;
import major_project.monster.*;
import java.io.*; 

public class MainClass{
   //The map
   public static char[][] map = new char[100][100];
   
   //The player's current row and column
   public static int row; 
   public static int col;
   
   //The destination's row and column
   public static int dRow;
   public static int dCol;
   
   //This is the class used for the player's character
   public static CharacterClass player;
   
   //This is the bag used to hold the items that the player finds
   public static Bag<Item> backpack = new Bag<Item>();
   
   //This is the bag used to hold the languages the player knows
   public static Bag<String> languages = new Bag<String>();
   
   //This holds basic user input
   public static String input;
   
   //This holds the player's name
   public static String name;
   
   //This is to get input from the keyboard
   public static Scanner scan = new Scanner(System.in);
   
   //This is to generate random events
   public static Random rand = new Random();
   
   //This holds the maximum hit points for the player
   public static int maxHitPoints;
   
   //This is the class used to store the story
   public static Story story = new Story();
   
   //This it the class used to generate minor and major events
   public static Event event = new Event();
   
   
   //These are the weapons that the player can select at the start of the game
   public static LongSword longSword = new LongSword();
   public static ShortSword shortSword = new ShortSword();
   public static Dagger dagger = new Dagger();
   public static LongBow longBow = new LongBow();
   public static CrossBow crossBow = new CrossBow();
      
   //These are the spells that the player can select at the start of the game   
   public static FireSpell fireSpell = new FireSpell();
   public static CureWoundsSpell healingSpell = new CureWoundsSpell();
   
   //These are the potions that the player can select  
   public static CureWoundsPotion healingPotion = new CureWoundsPotion();
   
   //This is the shield that the player can select at the start of the game   
   public static Shield shield = new Shield();
   
   public static <T> void main(String[] args) throws Exception{
      //This is to ensure correct data is entered
      boolean loop = true;
      
      //This calls the method that initalizes the map
      createMap(map);
      
      //These lines initilize the player's starting row and column and the destination's row and column
      row = rand.nextInt(100);
      col = rand.nextInt(100);
      dRow = rand.nextInt(100);
      dCol = rand.nextInt(100);
      
      //This clears the screen
      for (int i = 0; i < 25; i++){
         System.out.println("");
      }
      
      //The opening crawl
      System.out.println("\tHEART OF THE MOUNTAIN");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("");
      System.out.println("A Fantasy RPG Designed by Clark Lindsay");
      TimeUnit.SECONDS.sleep(2);
      System.out.println(""); 
      
      //To validate input
      while (loop == true){
         //Class selection
         System.out.println("Choose your class!");
         System.out.println("1.) Fighter");
         System.out.println("2.) Ranger");
         System.out.println("3.) Wizard");
         input = scan.nextLine();
      
         if (input.equals("1")){ 
            loop = true; 
                 
            System.out.println("");
            
            //Initalization of the player's class with the proper stats for a fighter
            player = new CharacterClass();
            player.setStrength(4);
            player.setDexterity(2);
            player.setIntelligence(1);
            player.setSpeed(5);
            player.setArmorClass(17);
            player.setHitPoints(15);
            maxHitPoints = 15;
         
            //To validate input
            while (loop == true){
               //Weapon selection
               System.out.println("Chose your weapon!");
               System.out.println("1.) Long Sword");
               System.out.println("2.) Short Sword and Shield");
               input = scan.nextLine();
               
               if (input.equals("1")){       
                  player.setTwoHandedWeapon(longSword);
                  backpack.add(longSword);   
                  loop = false;
               }
               
               else if (input.equals("2")){
                  player.setRightHandWeapon(shortSword);
                  player.setShield(shield);
                  player.setArmorClass(player.getArmorClass() + shield.getDefense());
                  backpack.add(shortSword);
                  backpack.add(shield);
                  loop = false;
               }
               
               else {
                  System.out.println("");
                  System.out.println("Invalid input");
                  System.out.println("");
               }
            }
         }
         
         else if (input.equals("2")){
            loop = true;  
                   
            System.out.println("");
            
            //Initalization of the player's class with the proper stats for a ranger
            player = new CharacterClass();
            player.setStrength(1);
            player.setDexterity(4);
            player.setIntelligence(2);
            player.setSpeed(6);
            player.setArmorClass(14);
            player.setHitPoints(12);
            maxHitPoints = 12;
            
            //To validate input
            while (loop == true){
               //Weapon selection
               System.out.println("Chose your weapon!");
               System.out.println("1.) Long Bow");
               System.out.println("2.) Cross Bow");
               System.out.println("3.) Double Daggers");
               input = scan.nextLine();
            
               if (input.equals("1")){
                  player.setTwoHandedWeapon(longBow);
                  backpack.add(longBow);
                  loop = false;
               }
               
               else if (input.equals("2")){
                  player.setTwoHandedWeapon(crossBow);
                  backpack.add(crossBow);
                  loop = false;
               }
               
               else if (input.equals("3")){
                  player.setRightHandWeapon(dagger);
                  player.setLeftHandWeapon(dagger);
                  backpack.add(dagger);
                  backpack.add(dagger);
                  loop = false;
               }
               
               else {
                  System.out.println("");
                  System.out.println("Invalid input");
                  System.out.println("");
               }
            }
         }
         
         else if (input.equals("3")){
            loop = true;   
                  
            System.out.println("");
            
            //Initalization of the player's class with the proper stats for a wizard
            player = new CharacterClass();
            player.setStrength(1);
            player.setDexterity(2);
            player.setIntelligence(4);
            player.setSpeed(6);
            player.setArmorClass(12);
            player.setHitPoints(10);
            maxHitPoints = 10;
            
            //To validate input
            while (loop == true){
               //Weapon selection
               System.out.println("Chose your weapon!");
               System.out.println("1.) Fire spell and a dagger");
               System.out.println("2.) Double fire spells");
               System.out.println("3.) Healing spell and a dagger");
               input = scan.nextLine();
            
               if (input.equals("1")){
                  player.setRightHandWeapon(dagger);
                  player.setLeftHandSpell(fireSpell);
                  backpack.add(dagger);
                  backpack.add(fireSpell);
                  loop = false;
               }
               
               else if (input.equals("2")){
                  player.setRightHandSpell(fireSpell);
                  player.setLeftHandSpell(fireSpell);
                  backpack.add(fireSpell);
                  backpack.add(fireSpell);
                  loop = false;
               }
               
               else if (input.equals("3")){
                  player.setRightHandWeapon(dagger);
                  player.setLeftHandSpell(healingSpell);
                  backpack.add(dagger);
                  backpack.add(healingSpell);
                  loop = false;
               }
               
               else {
                  System.out.println("");
                  System.out.println("Invalid input");
                  System.out.println("");
               }
            }
         }
         
         else {
            System.out.println("");
            System.out.println("Invalid input");
            System.out.println("");
         }
      }
      
      System.out.println("");
     
      //Language selection
      System.out.println("Chose your known languages");
      System.out.println("(Pick two)");
      
      //To ensure exactly two languages are chosen
      for (int i = 0; i < 2; i++){
         loop = true;
         //To validate input
         while (loop == true){
            System.out.println("");
            if (i == 0)
               System.out.println("First selection");
            else
               System.out.println("Second selection");
         
            System.out.println("1.) Common (Humans)");
            System.out.println("2.) Draconic (Dragons)");
            System.out.println("3.) Dwarvish (Dwarves)");
            System.out.println("4.) Elvish (Elves)");
            System.out.println("5.) Giant (Orgres, Giants)");
            System.out.println("6.) Gnomish (Gnomes)");
            System.out.println("7.) Goblin (Goblinoids)");
            System.out.println("8.) Halfling (Halflings)");
            System.out.println("9.) Orc (Orcs)");
         
            input = scan.nextLine();
            
            //This switch determines what language to add to the language bag depending on the user's input
            switch (input) {
            
               case "1" :
                  if (!languages.containsString("common")){
                     languages.add("common");
                     loop = false;
                  }
                  else
                     System.out.println("Already chosen");
                  break;
                  
               case "2" :
                  if (!languages.containsString("draconic")){
                     languages.add("draconic");
                     loop = false;
                  }
                  else
                     System.out.println("Already chosen");
                  break;
                  
               case "3" :
                  if (!languages.containsString("dwarvish")){
                     languages.add("dwarvish");
                     loop = false;
                  }
                  else
                     System.out.println("Already chosen");
                  break;
                  
               case "4" :
                  if (!languages.containsString("elvish")){
                     languages.add("elvish");
                     loop = false;
                  }
                  else
                     System.out.println("Already chosen");
                  break;
                  
               case "5" :
                  if (!languages.containsString("giant")){
                     languages.add("giant");
                     loop = false;
                  }
                  else
                     System.out.println("Already chosen");
                  break;
                  
               case "6" :
                  if (!languages.containsString("gnomish")){
                     languages.add("gnomish");
                     loop = false;
                  }
                  else
                     System.out.println("Already chosen");
                  break;
                  
               case "7" :
                  if (!languages.containsString("goblin")){
                     languages.add("goblin");
                     loop = false;
                  }
                  else
                     System.out.println("Already chosen");
                  break;
                  
               case "8" :
                  if (!languages.containsString("halfling")){
                     languages.add("halfling");
                     loop = false;
                  }
                  else
                     System.out.println("Already chosen");
                  break;
                  
               case "9" :
                  if (!languages.containsString("orc")){
                     languages.add("orc");
                     loop = false;
                  }
                  else
                     System.out.println("Already chosen");
                  break;
                  
               default :
                  System.out.println("");
                  System.out.println("Invalid input");
                  break;
            }
         }
      }
      
      //These calls print out the begening of the story and initalize the player's name 
      //(which is determined whithin the story class)
      //These lines have been comented out to save time for the presentation
      //story.begenning();
      //name = story.getName();
      
      loop = true;
      
      //To validate input
      while (loop == true){
         System.out.println("");
         TimeUnit.SECONDS.sleep(2);
      
         //The "main menue"
         System.out.println("What do you want to do?");
         System.out.println("1.) Travel");
         System.out.println("2.) Sleep");
         System.out.println("3.) Equip item");
         System.out.println("4.) View contents of backpack");
         input = scan.nextLine();
         
         switch (input){
         
            case "1" : 
               //These determine what direction the player should travel to arive at the destination      
               String upDown;
               String leftRight;
               
               //Initalization of upDown
               if (row < dRow)
                  upDown = "South";
               else if (row == dRow)
                  upDown = "";    
               else
                  upDown = "North";
               
               //Initalization of leftRight   
               if (col < dCol)
                  leftRight = "East";
               else if (col == dCol)
                  leftRight = "";   
               else
                  leftRight = "West";
               
               System.out.println("");
               
               //Prints out movement menue
               if (upDown.equals("") && leftRight.equals("")) {
                  System.out.println("You arrive at Thor's Rock");
                  System.out.println("You win!");
                  System.exit(0);
               }
               
               else if (upDown.equals(""))
                  System.out.println("Thor's Rock is to the " + leftRight);
               
               else if (leftRight.equals(""))
                  System.out.println("Thor's Rock is to the " + upDown);
               
               else
                  System.out.println("Thor's Rock is to the " + upDown + "-" + leftRight);
               
               System.out.println("What direction would you like to go"); 
               System.out.println("1.) North");
               System.out.println("2.) South");
               System.out.println("3.) East");
               System.out.println("4.) West");
               input = scan.nextLine();
            
               //These lines make a call to the method in charge of player movement
               if (input.equals("1") || input.equals("2") || input.equals("3") || input.equals("4")){
                  moveAround(input);
               }
               
               else {
                  System.out.println("");
                  System.out.println("Invalid input");
                  System.out.println("");
               }
               break;
            
            case "2" :
               //Returns the player to max hit points
               player.setHitPoints(maxHitPoints);
               System.out.println("");
               TimeUnit.SECONDS.sleep(2);
               System.out.println("You sleep for eight hours");
               System.out.println("");
               TimeUnit.SECONDS.sleep(2);
               System.out.println("All your wounds are healed");
               break;
            
            case "3" :
               System.out.println("");
               System.out.println("Equiped items:");
               
               //These lines determines what the player has equiped
               if (player.getLeftHandWeapon() != null){
                  System.out.println("Left hand: " + player.getLeftHandWeapon().toString());
               }
                  
               if (player.getLeftHandSpell() != null){
                  System.out.println("Left hand: " + player.getLeftHandSpell().toString());
               }
               
               if (player.getShield() != null){
                  System.out.println("Left hand: " + player.getShield().toString());
               }
               
               if (player.getRightHandWeapon() != null){
                  System.out.println("Right hand: " + player.getRightHandWeapon().toString());
               }
               
               if (player.getRightHandSpell() != null){
                  System.out.println("Right hand: " + player.getRightHandSpell().toString());
               }
               
               if (player.getTwoHandedWeapon() != null){
                  System.out.println("Both hands: " + player.getTwoHandedWeapon().toString());
               }
                    
               System.out.println("");   
               System.out.println("Items you can equip:");
               
               //These lines create an array holding the contents of the bag
               @SuppressWarnings("unchecked")
                  T[] array = (T[]) new Object[backpack.getCurrentSize()];
               array = (T[]) backpack.toArray();
               
               //These lines create another array holding the contents of the bag
               @SuppressWarnings("unchecked")
                  T[] equipment = (T[]) new Object[backpack.getCurrentSize()];
               equipment = (T[]) backpack.toArray();
               
               int j = 0;
               //These lines determine if the items in the backpack are equippable
               //If they are, they are added to the equipment array
               for (int i = 0; i < array.length; i++){
                  if (array[i] instanceof Weapon || array[i] instanceof Spell || array[i] instanceof DefensiveItem){
                     System.out.println((j + 1) + ".) " + array[i].toString());
                     equipment[j] = array[i];
                     j++;
                  }
               }
               
               input = scan.nextLine();
               int inputInt = 0;
               try{
                  inputInt = Integer.parseInt(input);
               
               //To validate input
                  try {
                  //Checks to see if the selected item will take up two hands
                     if (equipment[inputInt - 1] instanceof TwoHandedWeapon){
                        System.out.println("");
                        System.out.println("Equipment will use both hands");
                        System.out.println("All other weapons will be unequiped");
                        System.out.println("Do you want to equip this");
                        System.out.println("1.) Yes");
                        System.out.println("2.) No");
                        input = scan.nextLine();
                     
                        if (input.equals("1")){
                           player.setLeftHandWeapon(null);
                           player.setRightHandWeapon(null);
                           player.setShield(null);
                           player.setRightHandSpell(null);
                           player.setLeftHandSpell(null);
                           player.setTwoHandedWeapon((Weapon) equipment[inputInt - 1]);
                           System.out.println("");
                           System.out.println(equipment[inputInt - 1].toString() + " equiped");
                        }
                     }
                     
                     else if (equipment[inputInt - 1] instanceof OneHandedWeapon){
                        System.out.println("");
                        System.out.println("Which hand do you want to equip the " + equipment[inputInt - 1].toString() + " to?");
                        System.out.println("1.) Left");
                        System.out.println("2.) Right");
                        input = scan.nextLine();
                     
                        if (input.equals("1")){
                           player.setLeftHandWeapon((Weapon) equipment[inputInt - 1]);
                           player.setShield(null);
                           player.setLeftHandSpell(null);
                           player.setTwoHandedWeapon(null);
                           System.out.println("");
                           System.out.println(equipment[inputInt - 1].toString() + " equiped");
                        }
                     
                        if (input.equals("2")){
                           player.setRightHandWeapon((Weapon) equipment[inputInt - 1]);
                           player.setRightHandSpell(null);
                           player.setTwoHandedWeapon(null);
                           System.out.println("");
                           System.out.println(equipment[inputInt - 1].toString() + " equiped");
                        }
                     }
                     
                     else if (equipment[inputInt - 1] instanceof Spell){
                        System.out.println("");
                        System.out.println("Which hand do you want to equip the " + equipment[inputInt - 1].toString() + " to?");
                        System.out.println("1.) Left");
                        System.out.println("2.) Right");
                        input = scan.nextLine();
                     
                        if (input.equals("1")){
                           player.setLeftHandSpell((Spell) equipment[inputInt - 1]);
                           player.setShield(null);
                           player.setLeftHandWeapon(null);
                           player.setTwoHandedWeapon(null);
                           System.out.println("");
                           System.out.println(equipment[inputInt - 1].toString() + " equiped");
                        }
                     
                        if (input.equals("2")){
                           player.setRightHandSpell((Spell) equipment[inputInt - 1]);
                           player.setRightHandWeapon(null);
                           player.setTwoHandedWeapon(null);
                           System.out.println("");
                           System.out.println(equipment[inputInt - 1].toString() + " equiped");
                        }
                     }
                     
                     else if (equipment[inputInt - 1] instanceof Shield){
                        System.out.println("");
                        System.out.println("Equipment will use left hand");
                        System.out.println("All weapons and spells in the left hand will be unequiped");
                        System.out.println("");
                        System.out.println("Do you want to equip this");
                        System.out.println("1.) Yes");
                        System.out.println("2.) No");
                        input = scan.nextLine();
                     
                        if (input.equals("1")){
                           player.setLeftHandWeapon(null);
                           player.setShield((Shield) equipment[inputInt - 1]);
                           player.setLeftHandSpell(null);
                           player.setTwoHandedWeapon(null);
                           System.out.println("");
                           System.out.println(equipment[inputInt - 1].toString() + " equiped");
                        }
                     }
                  }
                  
                  catch (Exception e){
                     System.out.println("");
                     System.out.println("Invalid input");
                  }
               }
               
               catch (Exception e){
                  System.out.println("");
                  System.out.println("Invalid input");
               }
            
               break;
               
            case "4" :
               //These lines create and print out an array with the bag's contents
               System.out.println("");
               System.out.println("Items in backpack:");
               @SuppressWarnings("unchecked")
                  T[] contents = (T[]) new Object[backpack.getCurrentSize()];
               contents = (T[]) backpack.toArray();
            
               for (int i = 0; i < contents.length; i++){
                  System.out.println((i + 1) + ".) " + contents[i].toString());
               }
            default :
               System.out.println("");
               System.out.println("Invalid input");
               break;
         }
      }    
   }
   
   //This class initalizes the map
   public static void createMap(char[][] map) throws IOException {
      
      Random rand = new Random();
      
      for (int rowSet = 0; rowSet < map.length; rowSet++) {
            
         for (int colSet = 0; colSet < map[rowSet].length; colSet++){
         
            int random = rand.nextInt(100);
            
            //Randomly places minor ('m') and major ('M') events
            if (random < 30) 
               map[rowSet][colSet] = 'M';
                    
            if (random > 30 && random < 80) 
               map[rowSet][colSet] = 'm';          
         }
      } 
      
      //Designates the player's position and the destination's position
      map[row][col] = 'p';
      map[dRow][dCol] = 'd';
   }   
   
   //This method allows the player to traverse the map
   public static boolean moveAround(String direction) throws Exception{
      boolean stop = false;
      
      switch (direction) {
         case ("4") : 
            if ((col - 1) == -1){
               System.out.println("");
               System.out.println("Don't go off the map");
               return true;
            }
               
            if (map[row][col - 1] == 'm') {
               event.minorEvent(player, backpack);
               stop = true;
            }
               
            else if (map[row][col - 1] == 'M') {
               event.majorEvent(player, languages);
               stop = true;
            }
            
            else if (map[row][col - 1] == 'd') {
               story.thorsRock(player);
               stop = true;
            }
                 
            map[row][col] = ' ';
            col--;
            map[row][col] = 'p';
         
            break;
         
         case ("3") :
            if ((col + 1) == 100){
               System.out.println("");
               System.out.println("Don't go off the map");
               return true;
            }
            
            if (map[row][col + 1] == 'm') {
               event.minorEvent(player, backpack);
               stop = true;
            }
               
            else if (map[row][col + 1] == 'M') {
               event.majorEvent(player, languages);
               stop = true;
            }
            
            else if (map[row][col + 1] == 'd') {
               story.thorsRock(player);
               stop = true;
            }
               
            map[row][col] = ' ';
            col++;
            map[row][col] = 'p';
         
            break;
       
         case ("1") :
            if ((row - 1) == -1){
               System.out.println("");
               System.out.println("Don't go off the map");
               return true;
            }
            
            if (map[row - 1][col] == 'm') {
               event.minorEvent(player, backpack);
               stop = true;
            }
               
            else if (map[row - 1][col] == 'M') {
               event.majorEvent(player, languages);
               stop = true;
            }
            
            else if (map[row - 1][col] == 'd') {
               story.thorsRock(player);
               stop = true;
            }
               
            map[row][col] = ' ';
            row--;
            map[row][col] = 'p';
         
            break;
        
         case ("2") :
            if ((row + 1) == 100){
               System.out.println("");
               System.out.println("Don't go off the map");
               return true;
            }
            
            if (map[row + 1][col] == 'm') {
               event.minorEvent(player, backpack);
               stop = true;
            }
               
            else if (map[row + 1][col] == 'M') {
               event.majorEvent(player, languages);
               stop = true;
            }
            
            else if (map[row + 1][col] == 'd') {
               story.thorsRock(player);
               stop = true;
            }
               
            map[row][col] = ' ';
            row++;
            map[row][col] = 'p';
         
            break;
                     
         default :
            System.out.println(); 
            System.out.println("Invalid input");
      
      }         
      return stop;
   }
   
   //This method prints out the avaliable attack options for combat
   public static void attackOptions(Monster monster, String name) throws Exception{
      if (player.getLeftHandWeapon() instanceof MeleeWeapon || player.getRightHandWeapon() instanceof MeleeWeapon || player.getTwoHandedWeapon() instanceof MeleeWeapon)
         System.out.println("1.) Perform a melee attack");
      else 
         System.out.println("(Not avaliable) 1.) Perform a melee attack");
         
      if (player.getTwoHandedWeapon() instanceof RangedWeapon)
         System.out.println("2.) Perform a ranged attack");        
      else 
         System.out.println("(Not avaliable) 2.) Perform a ranged attack");
         
      if (player.getLeftHandSpell() instanceof AttackSpell || player.getRightHandSpell() instanceof AttackSpell)
         System.out.println("3.) Perform a spell attack");
      else 
         System.out.println("(Not avaliable) 3.) Perform a spell attack");
      
      if (player.getHitPoints() < maxHitPoints){   
         if (player.getLeftHandSpell() instanceof HealingSpell || player.getRightHandSpell() instanceof HealingSpell)
            System.out.println("4.) Heal yourself with a healing spell");
         else 
            System.out.println("(Not avaliable) 4.) Heal yourself with a healing spell");
      }
      else 
         System.out.println("(Not avaliable) 4.) Heal yourself with a healing spell");
         
      if (player.getHitPoints() < maxHitPoints){   
         if (backpack.contains(healingPotion))
            System.out.println("5.) Heal yourself with a healing potion");
         else 
            System.out.println("(Not avaliable) 5.) Heal yourself with healing potion");
      }
      else 
         System.out.println("(Not avaliable) 5.) Heal yourself with a healing potion");
      input = scan.nextLine();
         
      int damage = 0;
      int healing = 0;
      switch (input) {
               
         case ("1") :
            System.out.println("");
            TimeUnit.SECONDS.sleep(2);
         
            if (player.getLeftHandWeapon() instanceof MeleeWeapon && player.getRightHandWeapon() instanceof MeleeWeapon){
               System.out.println("Equiped with twin blades, you make two attacks");
               System.out.println("");
               TimeUnit.SECONDS.sleep(2);
               damage = player.meleeAttack(monster, player.getLeftHandWeapon());
               if (damage > 0)
                  System.out.println("Your first strike hits, wounding the " + name);
               else
                  System.out.println("Your first strike misses"); 
                    
               damage = player.meleeAttack(monster, player.getRightHandWeapon());
               System.out.println("");
               TimeUnit.SECONDS.sleep(2);
            
               if (damage > 0)
                  System.out.println("Your second strike hits, wounding the " + name);
               else
                  System.out.println("Your second strike misses");   
               break; 
            }
            if (player.getTwoHandedWeapon() == null){
               damage = player.meleeAttack(monster, player.getRightHandWeapon());
               if (damage > 0)
                  System.out.println("Your blade strikes true, wounding the " + name);
               else
                  System.out.println("You miss, and the " + name + " swings lunges for you");   
            }
            
            else{
               damage = player.meleeAttack(monster, player.getTwoHandedWeapon());
               if (damage > 0)
                  System.out.println("Your blade strikes true, wounding the " + name);
               else
                  System.out.println("You miss, and the " + name + " swings lunges for you");   
               break; 
            }
            
            break; 
               
         case ("2") :
            System.out.println("");
            TimeUnit.SECONDS.sleep(2);
         
            damage = player.rangedAttack(monster, player.getTwoHandedWeapon());
            if (damage > 0)
               System.out.println("Your arrow strikes true, wounding the " + name);
            else
               System.out.println("You miss, and the " + name + " swings it's blade at you");   
            break; 
               
         case ("3") :
            System.out.println("");
            TimeUnit.SECONDS.sleep(2);
            
            if (player.getLeftHandSpell() instanceof AttackSpell && player.getRightHandSpell() instanceof AttackSpell){
               System.out.println("Equiped with two spells, you make two attacks");
               System.out.println("");
               TimeUnit.SECONDS.sleep(2);
               damage = player.spellAttack(monster, player.getLeftHandSpell());
               if (damage > 0)
                  System.out.println("Your first spell hits, wounding the " + name);
               else
                  System.out.println("Your first spell misses"); 
                    
               damage = player.spellAttack(monster, player.getRightHandSpell());
               System.out.println("");
               TimeUnit.SECONDS.sleep(2);
            
               if (damage > 0)
                  System.out.println("Your second spell hits, wounding the " + name);
               else
                  System.out.println("Your second spell misses");   
               break; 
            }
         
            damage = player.spellAttack(monster, player.getLeftHandSpell());
            if (damage > 0)
               System.out.println("Fire erupts from your hands, wounding the " + name);
            else
               System.out.println("You don't have enougth time to cast your spell, the " + name + " lunges for you");   
            break; 
               
         case ("4") :
            System.out.println("");
            TimeUnit.SECONDS.sleep(2);
         
            healing = player.spellHeal(player, player.getLeftHandSpell());
            if (healing > 0)
               System.out.println("You quickly utter a word as the wounds on your flesh vanish");
            else
               System.out.println("You don't have enougth time to cast your spell, the " + name + " lunges for you");   
            break;  
               
         case ("5") :
            System.out.println("");
            TimeUnit.SECONDS.sleep(2);
         
            healing = healingPotion.heal;
            System.out.println("You swallow the contents of the vial and feel new strength flood your veigns");  
            break;
             
         default :
            System.out.println("");
            System.out.println("Invalid input");
            System.out.println("");
            System.out.println("What do you do?");
            attackOptions(monster, name);
            break;   
      }
   }

}