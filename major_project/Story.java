package major_project;

import java.util.*;
import java.util.concurrent.TimeUnit;
import major_project.character.*;

//This class prints out the story 
public class Story{
   
   public static Scanner scan = new Scanner(System.in);
   public static String input;
   public static String name;
   public static boolean loop = true;
   
   public static void begenning() throws Exception{
      for (int i = 0; i < 25; i++){
         System.out.println("");
      }
      
      TimeUnit.SECONDS.sleep(2);
      System.out.println("Your eyes open, however, you cannot see anything");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("You blink once . . .");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("Twice . . .");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("Three times . . .");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("Still nothing");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("Your mind races, are you in a cave?");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("You can't remember anything");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("You feel around you and your hand brushes up against the sole of a leather boot");
      System.out.println("");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("Elemar:");
      System.out.println("\tAwake I see");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("\tIt took you long enougth");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("\tI was woried you might not make it,");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("\tbut I believe you will be alright now");
      System.out.println("");
      TimeUnit.SECONDS.sleep(3);
      System.out.println("");
      
      while (loop == true){
      
         System.out.println("1.) Where . . . Where am I?");
         System.out.println("2.) Why can't I see?");
         System.out.println("3.) Who are you?");
         System.out.println("4.) End Dialog");
         input = scan.nextLine();
      
         if (input.equals("1")){
            System.out.println("");
            System.out.println("Elemar:");
            System.out.println("\tOn the edge of the Wildlands, in the Forgotten Reaml");
            System.out.println("");
            TimeUnit.SECONDS.sleep(2);
         }
         
         else if (input.equals("2")){
            System.out.println("");
            System.out.println("Elemar:");
            System.out.println("\tWell . . . I did what I could");
            System.out.println("");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("\tBut . . . unless the miraculious happens, you'll never see again");
            System.out.println("");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("\tI'm sorry, laddy");
            System.out.println("");
            TimeUnit.SECONDS.sleep(2);
         }
         
         else if (input.equals("3")){
            System.out.println("");
            System.out.println("Elemar:");
            System.out.println("\tElemar StoemRaven, chief healer of the Forgotten Realm");
            System.out.println("");
            TimeUnit.SECONDS.sleep(2);
         }
         
         else if (input.equals("4")){
            loop = false;
         }
         
         else {
            System.out.println("");
            System.out.println("Invalid input");
            System.out.println("");
         }
      }
      
      TimeUnit.SECONDS.sleep(2);
      System.out.println("");
      System.out.println("Elemar:");
      System.out.println("\tWell, you know my name, what is yours?");
      name = scan.nextLine();
      System.out.println("");
      System.out.println("Elemar:");
      System.out.println("\t" + name + ". A good strong name if ever there was one'");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("\tNow for the true test");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("\tWhen light and darkness meet, and Thor is on his throne . . .");
      System.out.println("");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("You:");
      System.out.println("\tThe Ironfists will rise, and darkness will be torn!");
      System.out.println("");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("Memory floods your mind");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("You remember who you are and what you were doing here in the Forgotten Realm");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("You are a messenger for Galin Warbound, leader of the Ironfist rebellion");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("You are in enemy teritory, and were ambushed while making contact with a spy");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("You:");
      System.out.println("\tWhat happened to my contact, and how do you know the creed?");
      System.out.println("");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("Elemar:");
      System.out.println("\tThomas is dead, killed by the same patrol that nearly killed you");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("\tBut he was not the only one who would see the rebellion spread");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("\tI am a member of a small chapter of the Ironfists, planting seeds even here");
      System.out.println("");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("You:");
      System.out.println("\tThen you know of my mission, I carry documents bearing the mark of the king of Whitehaven");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("\tPapers that will seal a deal between Whitehaven and the Forgotten Realm");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("\tA deal that will mean a fight on two fronts for us");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("\tThese documents have to get to the Ironfist camp at Thor's Rock");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("\tBut I am unable to get them there with my eyesight gone");
      System.out.println("");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("Elemar:");
      System.out.println("\tYou are not as helpless as you might think");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("\tI cannot grant you sight, but I can give you this . . .");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("\tThis is a drop of WolfFlower nector");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("\tIt will heighten your remaning sences beyond any mortal man");
      System.out.println("");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("You drink the contents of the vial");
      System.out.println("");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("Sounds, and smells of the world around you flood your mind");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("A strange picture of the room is formed in your mind and you glance about rapidly");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("You hear boots marching toward the room");
      System.out.println("");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("Guard:");
      System.out.println("\tQuiet men, we want them alive");
      System.out.println("");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("Elemar:");
      System.out.println("\tThey are on to me, hurry, there is a trapdoor leading to the Wildlands under the bed");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("\tYou will need a weapon. Here take this, and may Thor guide you!");
      System.out.println(""); 
      TimeUnit.SECONDS.sleep(2);
      System.out.println("You hurry through the trapdoor, weapon in hand");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("You hear the guards break down the door just as lower the hinge");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("You listen and hear Elemar attempting to talk to the guards");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("After a short conversation, the guards attempt to arrest Elemar");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("You hear the sounds of swords drawing and a brief struggle");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("A body thumps against the boards above you");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("You hear Elemar whisper four words as life leaves him");
      System.out.println("");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("Elemar:");
      System.out.println("\tLong live the rebellion");
      System.out.println("");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("You clench your fist and silently repeate the phrase");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("You run through the tunnel and cautiously open the door");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("The sounds of the Wildlands erupt around you");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("You sigh, how many more must die befor this war ends?");
      System.out.println("");
      TimeUnit.SECONDS.sleep(2);
      System.out.println("Taking a deep breath, you enter the woods"); 
      
      for (int i = 0; i < 25; i++){
         System.out.println("");
      } 
   }
   
   public static void thorsRock(CharacterClass player){
      for (int i = 0; i < 25; i++){
         System.out.println("");
      }
      
      
   }
   
   public String getName(){
      return this.name;
   }
}
