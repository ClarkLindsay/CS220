import java.util.Scanner;

public class CheckOne{

   public static void main(String[] args){
   
      int input;
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Enter a number, but don't enter '1'");
      input = scan.nextInt();
      
      System.out.println(checkOne(input));
   }

   public static String checkOne(int input){
   
      try{
      
         if (input == 1)
            throw new OneException();
            
         else   
            return "It was not ONE, we are saved!";
      }
      
      catch (OneException ex) {
         return ex.getMessage(); 
      }
   }
}