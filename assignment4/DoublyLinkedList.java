public class DoublyLinkedList<T>{

   private Node firstNode;
   private int numberOfNodes;
   
   public DoublyLinkedList(){
      firstNode = null;
      numberOfNodes = 0;
   }
   
   public boolean add(T newEntry){
   
      Node newNode = new Node(newEntry);
      boolean result = false;
      
      if (firstNode == null){
         firstNode = newNode;
         numberOfNodes++;
         result = true;
      }
      
      
      else{
         newNode.next = firstNode;
         firstNode.prev = newNode;
         firstNode = newNode;
         numberOfNodes++;
         result = true;
      }
      
      return result;
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
         firstNode.prev = null;
         numberOfNodes--;  
      }
      
      return result;
   }
   
   public boolean remove(T anEntry){
   
      Node currentNode = firstNode;
      boolean result = false;
      
      for (int i = 0; i < numberOfNodes; i++){
         
         if (currentNode.data.equals(anEntry)){
            (currentNode.next).prev = currentNode.prev;
            (currentNode.prev).next = currentNode.next;
            result = true;
            i = numberOfNodes;
         }
         
         else
            currentNode = currentNode.next;     
      }
      
      return result;
   }
   
   public int getNumberOfEntries(){
      return numberOfNodes;
   }
   
   public T[] toArray(){
      
      @SuppressWarnings("unchecked")
         T[] result = (T[]) new Object[numberOfNodes]; 
      int index = 0;
      Node currentNode = firstNode;
      
      while ((index < numberOfNodes) && (currentNode != null)){
         result[index] = currentNode.data;
         index++;
         currentNode = currentNode.next;
      }
      
      return result;
   }
   
   public int getFrequency(T anEntry){
      
      int frequency = 0;
      int count = 0;
      Node currentNode = firstNode;
      
      while ((count < numberOfNodes) && (currentNode != null)){
         if (currentNode.data.equals(anEntry)){
            frequency++;        
         }
         
         count++;
         currentNode = currentNode.next;
      }
      
      return frequency;
   }
   
   
   public boolean contains(T anEntry){
      
      boolean found = false;
      Node currentNode = firstNode;
      
      while((found == false) && (currentNode != null)){
         if (currentNode.data.equals(anEntry))
            found = true;
                  
         else
            currentNode = currentNode.next;
      }
      
      return found;
   }
   
      
   public Node getReferenceTo(T anEntry){
      
      boolean found = false;
      Node currentNode = firstNode;
      
      while((found == false) && (currentNode != null)){
         if (currentNode.data.equals(anEntry))
            found = true;
                  
         else
            currentNode = currentNode.next;
      }
      
      return new Node(currentNode.data);
   }
   
   public void clear(){
      while (isEmpty() == false){
         remove();
      }
   }
   
   private class Node{
   
      private T data;
      private Node next;
      private Node prev;
      
      private Node(T data){
         this(data, null, null);
      }
      
      private Node(T data, Node next, Node prev){
      
         this.data = data;
         this.next = next;
         this.prev = prev;
      }
   }
   
}
