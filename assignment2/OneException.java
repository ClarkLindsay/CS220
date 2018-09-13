public class OneException extends ArithmeticException{

   public OneException(){}
   
   public OneException(String message){}
   
   public String getMessage(){
      return "Exception: It was a ONE, we are DOOMED!";
   }
}