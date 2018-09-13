public class LinkedList<T>{

   private Node firstNode;
   private int numberOfNodes;
   
   public LinkedList(){
      firstNode = null;
      numberOfNodes = 0;
   }
   
   public boolean add(T newEntry){
      Node newNode = new Node(newEntry);
      newNode.next = firstNode;
      firstNode = newNode;
      numberOfNodes++;
      return true;
   }
   
   public boolean isEmpty(){
      if (firstNode == null)
         return true;
      else
         return false;    
   }
   
   public T remove(){
      T result = null;
      
      if (firstNode != null){
         result = firstNode.data;
         firstNode = firstNode.next;
         numberOfNodes--;  
      }
      
      return result;
   }
   
   public int getNumberOfEntries(){
      return numberOfNodes;
   }
   
   private class Node{
   
      private T data;
      private Node next;
      
      private Node(T data){
         this(data, null);
      }
      
      private Node(T data, Node nextNode){
      
         this.data = data;
         this.next = nextNode;
      }
   }
   
}
