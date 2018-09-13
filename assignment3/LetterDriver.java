import java.util.Random;

public class LetterDriver {

   public static void main(String[] args){
   
      Letters<String> letters = new Letters<String>();
      Letters<String> vowels = new Letters<String>();
      Letters<String> consonants = new Letters<String>();
      
      String copy;
   	
      Random rand = new Random();
   	
      while (letters.isFull() == false){
         
         switch (rand.nextInt(26)){
         
            case 0: System.out.println(letters.add("A"));
               break;
            case 1: System.out.println(letters.add("B"));
               break;
            case 2: System.out.println(letters.add("C"));
               break;
            case 3: System.out.println(letters.add("D"));
               break;
            case 4: System.out.println(letters.add("E"));
               break;
            case 5: System.out.println(letters.add("F"));
               break;
            case 6: System.out.println(letters.add("G"));
               break;
            case 7: System.out.println(letters.add("H"));
               break;
            case 8: System.out.println(letters.add("I"));
               break;
            case 9: System.out.println(letters.add("J"));
               break;
            case 10: System.out.println(letters.add("K"));
               break;
            case 11: System.out.println(letters.add("L"));
               break;
            case 12: System.out.println(letters.add("M"));
               break;
            case 13: System.out.println(letters.add("N"));
               break;
            case 14: System.out.println(letters.add("O"));
               break;
            case 15: System.out.println(letters.add("P"));
               break;
            case 16: System.out.println(letters.add("Q"));
               break;
            case 17: System.out.println(letters.add("R"));
               break;
            case 18: System.out.println(letters.add("S"));
               break;
            case 19: System.out.println(letters.add("T"));
               break;
            case 20: System.out.println(letters.add("U"));
               break;
            case 21: System.out.println(letters.add("V"));
               break;
            case 22: System.out.println(letters.add("W"));
               break;
            case 23: System.out.println(letters.add("X"));
               break;
            case 24: System.out.println(letters.add("Y"));
               break;
            case 25: System.out.println(letters.add("Z"));
               break;
         }
      }
      
      System.out.println("");
      
      vowels.add("A");
      vowels.add("E");
      vowels.add("I");
      vowels.add("O");
      vowels.add("U");
         
      for (int i = 0; i < 52; i++){
         copy = letters.remove();
            
         if (!vowels.contains(copy))
            consonants.add(copy);
            
      }
      
      System.out.println("Size of consonants: " + consonants.getCurrentSize());
      System.out.println("");
   
      System.out.println("B's: " + consonants.getFrequency("B"));
      System.out.println("C's: " + consonants.getFrequency("C"));
      System.out.println("D's: " + consonants.getFrequency("D"));
      System.out.println("F's: " + consonants.getFrequency("F"));
      System.out.println("G's: " + consonants.getFrequency("G"));
      System.out.println("H's: " + consonants.getFrequency("H"));
      System.out.println("J's: " + consonants.getFrequency("J"));
      System.out.println("K's: " + consonants.getFrequency("K"));
      System.out.println("L's: " + consonants.getFrequency("L"));
      System.out.println("M's: " + consonants.getFrequency("M"));
      System.out.println("N's: " + consonants.getFrequency("N"));
      System.out.println("P's: " + consonants.getFrequency("P"));
      System.out.println("Q's: " + consonants.getFrequency("Q"));
      System.out.println("R's: " + consonants.getFrequency("R"));
      System.out.println("S's: " + consonants.getFrequency("S"));
      System.out.println("T's: " + consonants.getFrequency("T"));
      System.out.println("V's: " + consonants.getFrequency("V"));
      System.out.println("W's: " + consonants.getFrequency("W"));
      System.out.println("X's: " + consonants.getFrequency("X"));
      System.out.println("Y's: " + consonants.getFrequency("Y"));
      System.out.println("Z's: " + consonants.getFrequency("Z"));
   }
}
