
public class DoublyLinkedList<T>{
	
	private Node lastNode;
	private Node firstNode;
	private int numberOfNodes;
	
	public DoublyLinkedList(){
		lastNode = null;
		firstNode = null;
		numberOfNodes = 0;
	}
	
	public boolean addFirst(T newEntry){
		
		Node newNode = new Node(newEntry);
		boolean result = false;
		      
		      if (firstNode == null){
		         firstNode = newNode;
		         lastNode = newNode;
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

	   public boolean addLast(T newEntry){
		   
		      Node newNode = new Node(newEntry);
		      boolean result = false;
		      
		      if (firstNode == null){
			         firstNode = newNode;
			         lastNode = newNode;
			         numberOfNodes++;
			         result = true;
			  }
	
		      else{
		         lastNode.next = newNode;
		         newNode.prev = lastNode;
		         lastNode = newNode;
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
	   
	   public T removeFirst(){
		   
		      T result = null;
		      
		      if (firstNode != null){
		         result = firstNode.data;
		         firstNode = firstNode.next;
		         firstNode.prev = null;
		         numberOfNodes--;  
		      }
		      
		      return result;
	   }
	   
	   public T removeLast(){
		  
		      T result = null;
		      
		      if (lastNode != null){
		         result = lastNode.data;
		         lastNode = lastNode.prev;
		         lastNode.next = null;
		         numberOfNodes--;  
		      }
		      
		      return result;
	   }
	   
	   public boolean searchRemove(T anEntry){
		      
		      boolean found = false;
		      Node currentNode = firstNode;
		      
		      while((found == false) && (currentNode != null)){
		         if (currentNode.data.equals(anEntry)){
		            found = true;
		            (currentNode.next).prev = currentNode.prev;
		            (currentNode.prev).next = currentNode.next;
		         }
		                  
		         else
		            currentNode = currentNode.next;
		      }
		      
		      return found;
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
