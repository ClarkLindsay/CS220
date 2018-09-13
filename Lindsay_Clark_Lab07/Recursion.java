public class Recursion{
   
   public static void main(String[] args){
   
      System.out.println(intToBinary(4));
      System.out.println(factorial(9));
      System.out.println(gcd(4, 10));
      System.out.println(reverse(""));
      System.out.println(reverse("s"));
      System.out.println(reverse("string"));
      System.out.println(fibonacci(6));
   }
   
   public static String intToBinary(int n){
      
      if (n / 2 == 0)
         return "" + n;
      
      return intToBinary(n/2) + "" + n % 2;    
   }
   
   public static long factorial(int n){
      
      if (n <= 1)
         return 1;
         
      return  n * factorial(n-1);  
   }
   
   public static int gcd(int a, int b){
      
      if (b == 0)
         return a;
         
      return gcd(b, a % b); 
   }
   
   public static String reverse(String s){

      if (s.length() <= 1)
         return s;
         
      return reverse(s.substring(1)) + s.charAt(0);  
   }
   
   public static long fibonacci(int n){
   
      if (n <= 0)
         return 0;
      
      if (n == 1)
         return 1;
      
      return fibonacci(n-1) + fibonacci(n-2);    
   }
}