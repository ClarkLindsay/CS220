public class LinkedListTester{

   public static void main(String[] args){
      
      LinkedList<String> myList = new LinkedList<String>();
      
      System.out.println("Number of entries: " + myList.getNumberOfEntries());
      System.out.println("");   
      
      System.out.println("Is the list empty?");
      System.out.println(myList.isEmpty());
      System.out.println("");   
      
      System.out.println("Can we add?");
      System.out.println(myList.add("Hello"));
      System.out.println(myList.add("Clark"));
      System.out.println(myList.add("Lindsay"));
      System.out.println("");
      
      System.out.println("Number of entries: " + myList.getNumberOfEntries());
      System.out.println(""); 
      
      System.out.println("Is the list empty?");
      System.out.println(myList.isEmpty());
      System.out.println("");
      
      System.out.println("Removing:");
      while (myList.isEmpty() == false){
         System.out.println(myList.remove());
      }
      System.out.println("");
      
      System.out.println("Number of entries: " + myList.getNumberOfEntries());
      System.out.println(""); 
      
      System.out.println("Is the list empty?");
      System.out.println(myList.isEmpty());
      System.out.println("");
   }
}