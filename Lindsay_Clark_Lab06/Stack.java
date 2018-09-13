public class Stack<T>{

   private Node firstNode;
   private int numberOfNodes;
   
   public Stack(){
      firstNode = null;
      numberOfNodes = 0;
   }
   
   public void push(T entry){
      Node newNode = new Node(entry);
      if (isEmpty()){
         firstNode = newNode;
         numberOfNodes++;
      }
      
      else{
         newNode.next = firstNode;
         firstNode = newNode;
         numberOfNodes++;
      }
   }
   
   public T pop(){
      T result = null;
      
      if (isEmpty()){
         result = null;
      } 
       
      else{
         result = firstNode.getData();
         firstNode = firstNode.getNextNode();
         numberOfNodes--;
      } 
      
      return result;   
   }
   
   public T peek(){
      T result = null;
      
      if (isEmpty()){
         result = null;
      }  
      
      else{
         result = firstNode.getData();
      } 
      
      return result;   
   }
   
   public boolean isEmpty(){
      if (firstNode == null)
         return true;
      else
         return false;    
   }
   
   public void clear(){
      while (!isEmpty()){
         pop();
      }
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
      
      private T getData(){
         return this.data;
      }
   
      private Node getNextNode(){
         return this.next;
      }
   }   
}